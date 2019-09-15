package com.example.study.util.fiter;

import com.example.study.bean.common.CommonException;
import com.example.study.bean.common.ErrorMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: taotao
 * @date: 2019/8/30 16:59
 * @description:
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 统一异常转化
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = CommonException.class)
    @ResponseBody
    public ErrorMessage<String> jsonErrorHandler(HttpServletRequest req, CommonException e) throws Exception {
        ErrorMessage<String> r = new ErrorMessage<>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorMessage.ERROR);
        r.setDate("Some Data");
        return r;
    }

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
    }
}
