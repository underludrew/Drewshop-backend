package only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto;


import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 *  DrewShop SSO 单点登录 创建访问令牌 Request DTO
 */
@Data
@Accessors(chain = true)
@ToString
public class AuthenticationCreateAccessTokenReqDTO implements Serializable {

    /**
     * 用户id
     */

    private Integer user_id;

    /**
     * 用户类型
     */
    private Integer user_type;

    /**
     * 创建IP
     */
    private String create_ip;


}

