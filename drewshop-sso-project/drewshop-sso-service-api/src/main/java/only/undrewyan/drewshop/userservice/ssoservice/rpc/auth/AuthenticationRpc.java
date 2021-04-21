package only.undrewyan.drewshop.userservice.ssoservice.rpc.auth;


import only.undrewyan.common.framework.vo.CommonResult;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationAccessTokenRespDTO;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationCreateAccessTokenReqDTO;

public interface AuthenticationRpc {

    /**
     * 创建访问令牌
     */
    CommonResult<AuthenticationAccessTokenRespDTO> createAccessToken(AuthenticationCreateAccessTokenReqDTO authenticationCreateAccessTokenReqDTO);

    /**
     * 检查访问令牌
     */
    CommonResult<AuthenticationAccessTokenRespDTO> checkAccessToken();
    /**
     * 刷新访问令牌
     */

    /**
     * 删除访问令牌
     */



}
