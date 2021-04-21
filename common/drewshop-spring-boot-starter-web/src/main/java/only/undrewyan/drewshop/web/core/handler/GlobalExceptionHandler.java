package only.undrewyan.drewshop.web.core.handler;


import cn.hutool.core.exceptions.ExceptionUtil;
import only.undrewyan.common.framework.exception.ServiceException;
import only.undrewyan.common.framework.vo.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

import static only.undrewyan.common.framework.exception.enums.GlobalErrorCodeConstants.INTERNAL_SERVER_ERROR;

/**
 * 全局异常处理器，将 Exception 翻译成 CommonResult + 对应的异常编号
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${spring.application.name}")
    private String applicationName;


    /**
     * 处理业务异常 ServiceException
     *
     * 例如说，商品库存不足，用户手机号已存在。
     */
    @ExceptionHandler(value = ServiceException.class)
    public CommonResult serviceExceptionHandler(ServiceException ex){
        logger.info("[Service-Exception-Handler]"+ex);
        return CommonResult.error(ex.getCode(),ex.getMessage());
    }


//    /**
//     * 处理系统异常，兜底处理所有的一切
//     */
//    @ExceptionHandler(value = Exception.class)
//    public CommonResult defaultExceptionHandler(HttpServletRequest req, Throwable ex){
//        logger.error("[defaultExceptionHandler]", ex);
//        return CommonResult.error(INTERNAL_SERVER_ERROR.getCode(), INTERNAL_SERVER_ERROR.getMessage())
//                .setDetailMessage(ExceptionUtil.getRootCauseMessage(ex));
//    }
}
