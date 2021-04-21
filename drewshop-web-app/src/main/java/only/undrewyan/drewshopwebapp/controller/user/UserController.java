package only.undrewyan.drewshopwebapp.controller.user;

import only.undrewyan.common.framework.vo.CommonResult;
import only.undrewyan.drewshopwebapp.controller.user.vo.user.UserRegistByMobileNumberVO;
import only.undrewyan.drewshopwebapp.controller.user.vo.user.UserRespVO;
import only.undrewyan.drewshopwebapp.service.user.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import static only.undrewyan.common.framework.vo.CommonResult.success;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserManager userManager;

    @PostMapping("/regist-by-mobilenumber")
    public CommonResult<UserRespVO> createUserByUserMobileNumber(@RequestBody UserRegistByMobileNumberVO userRegistByMobileNumberVO,
                                                                 HttpServletRequest request){
        return success(userManager.createUserByUserMobileNumber(userRegistByMobileNumberVO,request));
    }

//    @GetMapping("/getuserinfotest")
//    public CommonResult<UserRespVO> getUserInfoTest(){
//
//    }






}
