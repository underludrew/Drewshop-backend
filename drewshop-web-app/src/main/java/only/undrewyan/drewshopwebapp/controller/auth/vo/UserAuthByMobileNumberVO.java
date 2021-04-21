package only.undrewyan.drewshopwebapp.controller.auth.vo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ToString
public class UserAuthByMobileNumberVO {

    /**
     * 用户认证手机号码
     */
    private String user_mobile_number;

    /**
     * 用户认证密码
     */
    private String password;


}
