package only.undrewyan.drewshopwebapp.service.auth;


import lombok.extern.slf4j.Slf4j;
import only.undrewyan.common.framework.vo.CommonResult;
import only.undrewyan.drewshop.userservice.rpc.user.UserRpc;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserRespDTO;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.AuthenticationRpc;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationAccessTokenRespDTO;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationCreateAccessTokenReqDTO;
import only.undrewyan.drewshopwebapp.controller.auth.vo.UserAuthByMobileNumberVO;
import only.undrewyan.drewshopwebapp.controller.user.vo.auth.AuthenticationAccessTokenRespVO;
import only.undrewyan.drewshopwebapp.controller.user.vo.user.UserRespVO;
import only.undrewyan.drewshopwebapp.convert.AuthenticationAccessTokenConvert;
import only.undrewyan.drewshopwebapp.convert.UserConvert;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@Slf4j
public class AuthManager {

    @Reference
    private UserRpc userRpc;
    @Reference
    private AuthenticationRpc authenticationRpc;


    public AuthenticationAccessTokenRespVO authUserByUserMobileNumber(UserAuthByMobileNumberVO userAuthByMobileNumberVO,
                                                                      HttpServletRequest request){

        //校验用户密码 rpc
        CommonResult<Boolean> verifyUserPasswordResult = userRpc.verifyUserPassword(
                UserConvert.INSTANCE.convert(userAuthByMobileNumberVO));
        verifyUserPasswordResult.checkError();
        //获取用户
        CommonResult<UserRespDTO> getUserInfoResult = userRpc.getUserByUserMobilePhoneNumber(
                userAuthByMobileNumberVO.getUser_mobile_number()
        );
        getUserInfoResult.checkError();
        //获取Access Token and Refresh Token
        CommonResult<AuthenticationAccessTokenRespDTO> createAccessTokenResult =
                authenticationRpc.createAccessToken(new AuthenticationCreateAccessTokenReqDTO()
                .setUser_id(getUserInfoResult.getData().getUser_id())
                .setUser_type(0)
                .setCreate_ip(request.getRemoteAddr()));
        createAccessTokenResult.checkError();
        log.info("[SUCCESS] Create Access token and refresh token success!!");
        log.info("【AccessToken】"+createAccessTokenResult.getData().getAccess_token());
        log.info("【RefreshToken】"+createAccessTokenResult.getData().getRefresh_token());
        //返回 Access Token and Refresh Token
        return AuthenticationAccessTokenConvert.INSTANCE.convert(createAccessTokenResult.getData());
    }

}
