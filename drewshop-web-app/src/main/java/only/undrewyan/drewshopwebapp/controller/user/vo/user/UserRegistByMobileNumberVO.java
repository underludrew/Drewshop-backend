package only.undrewyan.drewshopwebapp.controller.user.vo.user;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserRegistByMobileNumberVO {

    /**
     * 手机号
     */
    private String user_mobile_number;

    /**
     * 密码
     *
     * 允许为空，自动生成
     */
    private String password;
}
