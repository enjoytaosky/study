package com.example.study.controller.base;

import com.example.study.bean.dto.base.SupplierDTO;
import com.example.study.bean.entity.base.Supplier;
import com.example.study.bean.response.BaseResponse;
import com.example.study.service.base.SupplierService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: taotao
 * @date: 2019/10/30 15:37
 * @description:
 */
@RestController
@Slf4j
@RequestMapping("/base")
public class SupplierController {


    @Autowired
    private SupplierService supplierService;

    @ApiOperation(value = "/新增供应商", notes = "新增供应商")
    @RequestMapping(value = "/addSupplier", method = RequestMethod.POST)
    public BaseResponse<String> addSupplier(@RequestBody SupplierDTO request) {
        BaseResponse<String> response = new BaseResponse<>();
        log.info("[addSupplier] start.request:{}", request);
        Supplier supplier = supplierService.addSupplierService(request);
        response.setResult(supplier.getSupplierNo());
        log.info("[addSupplier] end.response:{}", response);
        return response;
    }
}
