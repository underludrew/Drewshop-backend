package only.undrewyan.drewshop.userservice.rpc.auth;

import only.undrewyan.common.framework.vo.CommonResult;
import only.undrewyan.drewshop.userservice.service.auth.AuthenticationService;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.AuthenticationRpc;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationAccessTokenRespDTO;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationCreateAccessTokenReqDTO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import static only.undrewyan.common.framework.vo.CommonResult.success;

@Service(timeout = 3000)
public class AuthenticationRpcImpl implements AuthenticationRpc {

    @Autowired
    AuthenticationService authenticationService;

    @Override
    public CommonResult<AuthenticationAccessTokenRespDTO> createAccessToken(AuthenticationCreateAccessTokenReqDTO authenticationCreateAccessTokenReqDTO) {
        return success(authenticationService.createAccessToken(authenticationCreateAccessTokenReqDTO));
    }

    @Override
    public CommonResult<AuthenticationAccessTokenRespDTO> checkAccessToken() {
        return null;
    }
}
