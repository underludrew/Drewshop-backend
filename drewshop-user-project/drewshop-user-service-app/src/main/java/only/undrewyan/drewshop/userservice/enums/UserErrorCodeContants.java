package only.undrewyan.drewshop.userservice.enums;


import only.undrewyan.common.framework.exception.ErrorCode;

/**
 * 错误码枚举类
 *
 * user-service 服务，使用 1-002-000-000 段
 */
public interface UserErrorCodeContants {

    ErrorCode USER_NOT_FOUND = new ErrorCode(1001001200,"用户不存在");
    ErrorCode USER_PASSWORD_NOT_CORRECT = new ErrorCode(1001001201,"密码错误");

}
