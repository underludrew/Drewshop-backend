package only.undrewyan.drewshop.userservice.manager.user;

import only.undrewyan.drewshop.userservice.convert.user.UserConvert;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserCreateReqDTO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserVerifyPasswordDTO;
import only.undrewyan.drewshop.userservice.service.user.UserService;
import only.undrewyan.drewshop.userservice.service.user.bo.UserBO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserRespDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager {

    @Autowired
    private UserService userService;


    public UserRespDTO getUserByMobileNumber(String user_mobile_number){
        UserBO userBO = userService.getUserByMobileNumber(user_mobile_number);
        return UserConvert.INSTANCE.convert(userBO);
    }


    public UserRespDTO createUserByMobileNumberIfAbsent(UserCreateReqDTO userCreateDTO){
        //用户存在
        UserBO userBO = userService.getUserByMobileNumber(userCreateDTO.getUser_mobile_number());
        if (userBO!=null){
            return UserConvert.INSTANCE.convert(userBO);
        }

        //用户不存在,则创建用户
        userBO =userService.createUserByMobileNumber(UserConvert.INSTANCE.convert(userCreateDTO));
        UserRespDTO userRespDTO = UserConvert.INSTANCE.convert(userBO);
        System.out.println(userRespDTO.toString());
        return userRespDTO;
    }


    public void verifyUserPassword(UserVerifyPasswordDTO userVerifyPasswordDTO){
        userService.verifyUserPassword(
                userVerifyPasswordDTO.getUser_mobile_number(),
                userVerifyPasswordDTO.getPassword());
    }
}
