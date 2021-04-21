package only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto;


import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * DrewShop SSO 单点登录 访问令牌 Response DTO
 */
@Data
@Accessors(chain = true)
@ToString
public class AuthenticationAccessTokenRespDTO implements Serializable {

    /*
        访问令牌
     */
    private String access_token;
    /*
        刷新令牌
     */
    private String refresh_token;
    /*
        用户Id
     */
    private Integer user_id;
    /*
        用户类型
     */
    private Integer user_type;
    /*
        访问令牌过期时间
     */
    private Date expires_time;

}
