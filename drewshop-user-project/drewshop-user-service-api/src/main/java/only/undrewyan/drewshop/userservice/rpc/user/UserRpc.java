package only.undrewyan.drewshop.userservice.rpc.user;


import only.undrewyan.common.framework.exception.ServiceException;
import only.undrewyan.common.framework.vo.CommonResult;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserCreateReqDTO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserRespDTO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserVerifyPasswordDTO;

public interface UserRpc {


    /**
     * 以注册手机号获取用户
     * @param user_mobile_number
     * @return
     */
    CommonResult<UserRespDTO> getUserByUserMobilePhoneNumber(String user_mobile_number);

    /**
     * 基于手机号创建新用户
     * @param userCreateDTO
     * @return
     */
    CommonResult<UserRespDTO> createUserByMobileNumberIfAbsent(UserCreateReqDTO userCreateDTO);

    CommonResult<Boolean> verifyUserPassword (UserVerifyPasswordDTO userVerifyPasswordDTO) throws ServiceException;

}
