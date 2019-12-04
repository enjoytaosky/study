package com.example.study.service.base;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.study.bean.constants.Constants;
import com.example.study.bean.dto.base.SupplierDTO;
import com.example.study.bean.entity.base.Contact;
import com.example.study.bean.entity.base.Supplier;
import com.example.study.bean.vo.BasePageVO;
import com.example.study.bean.vo.base.SupplierVO;
import com.example.study.dao.base.ContactMapper;
import com.example.study.dao.base.SupplierMapper;
import com.example.study.util.BeanUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: taotao
 * @date: 2019/10/30 14:25
 * @description: 供应商相关类
 */
@Service
@Slf4j
public class SupplierService {


    @Autowired
    private SupplierMapper supplierMapper;


    @Autowired
    private ContactMapper contactMapper;

    /**
     * 新增供应商信息
     *
     * @param supplierDTO
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public Supplier addSupplierService(SupplierDTO supplierDTO) {
        log.info("[addSupplierService] start.supplierDTO:{}", supplierDTO);
        Contact contact = Contact.builder().contactAddress(supplierDTO.getContactAddress())
                .contactName(supplierDTO.getContactName())
                .phone(supplierDTO.getContactPhone())
                .email(supplierDTO.getContactEmail())
                .build();
        contactMapper.insert(contact);
        Supplier supplier = Supplier.builder().supplierName(supplierDTO.getSupplierName())
                .supplierNo(supplierDTO.getSupplierNo())
                .contactId(contact.getId())
                .status(Constants.STATUS_ENABLE)
                .build();
        supplierMapper.insert(supplier);
        log.info("[addSupplierService] end.supplier:{}", supplier);
        return supplier;
    }

    /**
     * 获取供应商列表
     *
     * @param supplierDTO
     * @return
     */
    public BasePageVO<SupplierVO> getSupplierPageList(SupplierDTO supplierDTO) {
        log.info("[getSupplierPageList] start.supplierDTO:{}", supplierDTO);
        QueryWrapper<Supplier> queryWrapper = new QueryWrapper<>();
        Supplier supplier = new Supplier();
        supplier.setStatus(supplierDTO.getStatus());
        queryWrapper.lambda().likeLeft(Supplier::getSupplierName, supplierDTO.getSupplierName());
        queryWrapper.lambda().likeLeft(Supplier::getSupplierNo, supplierDTO.getSupplierNo());
        Page<Supplier> page = new Page<>(supplierDTO.getPageNo(), supplierDTO.getPageSize());
        IPage<Supplier> supplierIPage = supplierMapper.selectPage(page, queryWrapper);
        BasePageVO<SupplierVO> result = new BasePageVO<>();
        result.setPageNo(supplierDTO.getPageNo());
        result.setPageSize(supplierDTO.getPageSize());
        result.setTotal(supplierIPage.getSize());
        List<SupplierVO> supplierVOS = new ArrayList<>();
        for (Supplier item : supplierIPage.getRecords()) {
            SupplierVO copy = BeanUtils.copy(item, SupplierVO.class);
            Contact contact = contactMapper.selectById(item.getContactId());
            if (contact != null) {
                copy.setContactAddress(contact.getContactAddress());
                copy.setContactName(contact.getContactName());
                copy.setPhone(contact.getPhone());
                copy.setEmail(contact.getEmail());
            }
            supplierVOS.add(copy);
        }
        result.setList(supplierVOS);
        log.info("[getSupplierPageList] end.result:{}", result);
        return result;
    }


}
