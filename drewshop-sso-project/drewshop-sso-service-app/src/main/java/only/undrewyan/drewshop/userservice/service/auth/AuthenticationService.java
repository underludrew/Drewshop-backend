package only.undrewyan.drewshop.userservice.service.auth;

import only.undrewyan.common.framework.utils.StringUtil;
import only.undrewyan.common.framework.vo.CommonResult;
import only.undrewyan.drewshop.userservice.convert.auth.AuthenticationAccessTokenConvert;
import only.undrewyan.drewshop.userservice.dal.mysql.dataobject.auth.AuthenticationAccessTokenDO;
import only.undrewyan.drewshop.userservice.dal.mysql.dataobject.auth.AuthenticationRefreshTokenDO;
import only.undrewyan.drewshop.userservice.dal.mysql.mapper.AuthenticationAccessTokenMapper;
import only.undrewyan.drewshop.userservice.dal.mysql.mapper.AuthenticationRefreshTokenMapper;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationAccessTokenRespDTO;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationCreateAccessTokenReqDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AuthenticationService {

    @Autowired
    AuthenticationRefreshTokenMapper authenticationRefreshTokenMapper;
    @Autowired
    AuthenticationAccessTokenMapper authenticationAccessTokenMapper;


    /**
     * 创建刷新令牌+访问令牌
     * @param authenticationCreateAccessTokenReqDTO
     * @return
     */
    public AuthenticationAccessTokenRespDTO createAccessToken(AuthenticationCreateAccessTokenReqDTO
                                                                      authenticationCreateAccessTokenReqDTO){
        //创建刷新令牌
        AuthenticationRefreshTokenDO authenticationRefreshTokenDO = createAuthenticationRefreshToken(
                authenticationCreateAccessTokenReqDTO.getUser_id(),
                authenticationCreateAccessTokenReqDTO.getUser_type(),
                authenticationCreateAccessTokenReqDTO.getCreate_ip()
        );

        //创建访问令牌
        AuthenticationAccessTokenDO authenticationAccessTokenDO = createAuthenticationAccessToken(authenticationRefreshTokenDO);
        //返回访问令牌
        return AuthenticationAccessTokenConvert.INSTANCE.convert(authenticationAccessTokenDO);
    }

    /**
     * 创建刷新令牌
     * @param user_id
     * @param user_type
     * @param create_ip
     * @return
     */
    public AuthenticationRefreshTokenDO createAuthenticationRefreshToken(Integer user_id,Integer user_type,String create_ip){
        AuthenticationRefreshTokenDO authenticationRefreshTokenDO = new AuthenticationRefreshTokenDO()
                .setCreate_ip(create_ip)
                .setUser_id(user_id)
                .setUser_type(user_type)
                .setId(generateRefreshToken())
                .setExpires_time(new Date(System.currentTimeMillis()+3000000));
        authenticationRefreshTokenMapper.insert(authenticationRefreshTokenDO);
        return authenticationRefreshTokenDO;
    }

    /**
     * 创建访问令牌
     * @param authenticationRefreshTokenDO
     * @return
     */
    public AuthenticationAccessTokenDO createAuthenticationAccessToken(AuthenticationRefreshTokenDO authenticationRefreshTokenDO){
        AuthenticationAccessTokenDO authenticationAccessTokenDO = new AuthenticationAccessTokenDO()
                .setId(generateAccessToken())
                .setRefresh_token(authenticationRefreshTokenDO.getId())
                .setExpires_time(new Date(System.currentTimeMillis()+1000000))
                .setUser_id(authenticationRefreshTokenDO.getUser_id())
                .setUser_type(authenticationRefreshTokenDO.getUser_type())
                .setCreate_ip(authenticationRefreshTokenDO.getCreate_ip());
        authenticationAccessTokenMapper.insert(authenticationAccessTokenDO);
        return authenticationAccessTokenDO;
    }

    private static String generateAccessToken() {
        return StringUtil.uuid(true);
    }

    private static String generateRefreshToken() {
        return StringUtil.uuid(true);
    }

}
