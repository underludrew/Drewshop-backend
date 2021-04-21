package only.undrewyan.drewshop.userservice.rpc.user;

import only.undrewyan.common.framework.exception.ServiceException;
import only.undrewyan.common.framework.vo.CommonResult;
import only.undrewyan.drewshop.userservice.manager.user.UserManager;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserCreateReqDTO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserRespDTO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserVerifyPasswordDTO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import static only.undrewyan.common.framework.vo.CommonResult.success;

@Service(timeout = 3000)
public class UserRpcImpl implements UserRpc {

    @Autowired
    private UserManager userManager;

    @Override
    public CommonResult<UserRespDTO> getUserByUserMobilePhoneNumber(String user_mobile_number) {
        return success(userManager.getUserByMobileNumber(user_mobile_number));
    }

    @Override
    public CommonResult<UserRespDTO> createUserByMobileNumberIfAbsent(UserCreateReqDTO userCreateReqDTO) {
        UserRespDTO userRespDTO = userManager.createUserByMobileNumberIfAbsent(userCreateReqDTO);
        return success(userRespDTO);
    }


    @Override
    public CommonResult<Boolean> verifyUserPassword(UserVerifyPasswordDTO userVerifyPasswordDTO) throws ServiceException {
        userManager.verifyUserPassword(userVerifyPasswordDTO);
        return CommonResult.success(true);
    }




}
