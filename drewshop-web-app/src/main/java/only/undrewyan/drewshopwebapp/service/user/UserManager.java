package only.undrewyan.drewshopwebapp.service.user;

import only.undrewyan.common.framework.vo.CommonResult;
import only.undrewyan.drewshop.userservice.rpc.user.UserRpc;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserCreateReqDTO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserRespDTO;
import only.undrewyan.drewshopwebapp.controller.user.vo.user.UserRegistByMobileNumberVO;
import only.undrewyan.drewshopwebapp.controller.user.vo.user.UserRespVO;
import only.undrewyan.drewshopwebapp.convert.UserConvert;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserManager {

    @Reference
    UserRpc userRpc;


    public UserRespVO createUserByUserMobileNumber(UserRegistByMobileNumberVO userRegistByMobileNumberVO,
                                                   HttpServletRequest request){
        //校验手机号正确性 [TODO]

        //创建用户
        CommonResult<UserRespDTO> createUserResult = userRpc.createUserByMobileNumberIfAbsent(
                UserConvert.INSTANCE.convert(userRegistByMobileNumberVO)
        );
        System.out.println(createUserResult.getData().toString());
        createUserResult.checkError();

        return UserConvert.INSTANCE.convert(createUserResult.getData());
    }
}
