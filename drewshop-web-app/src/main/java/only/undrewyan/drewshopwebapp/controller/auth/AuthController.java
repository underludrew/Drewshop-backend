package only.undrewyan.drewshopwebapp.controller.auth;


import only.undrewyan.common.framework.vo.CommonResult;
import only.undrewyan.drewshopwebapp.controller.auth.vo.UserAuthByMobileNumberVO;
import only.undrewyan.drewshopwebapp.controller.user.vo.auth.AuthenticationAccessTokenRespVO;
import only.undrewyan.drewshopwebapp.controller.user.vo.user.UserRespVO;
import only.undrewyan.drewshopwebapp.service.auth.AuthManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import static only.undrewyan.common.framework.vo.CommonResult.success;
import static only.undrewyan.common.framework.vo.CommonResult.success2;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {


    @Autowired
    AuthManager authManager;

    @PostMapping("/login-by-mobilenumber")
    public CommonResult<AuthenticationAccessTokenRespVO> authUserByUserMobileNumber(@RequestBody UserAuthByMobileNumberVO userAuthByMobileNumberVO,
                                                                                    HttpServletRequest request){
        return success(authManager.authUserByUserMobileNumber(userAuthByMobileNumberVO, request));
    }

    @GetMapping("checkauth")
    public CommonResult<Boolean> checkAuth(){
        return success2(false);
    }

}
