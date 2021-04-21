package only.undrewyan.drewshop.userservice.service.user.bo;

import lombok.Data;
import lombok.experimental.Accessors;
import only.undrewyan.common.framework.validator.Mobile;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Accessors(chain = true)
public class UserCreateBO {

    private Integer user_id;

    private String user_name;

    @NotNull(message = "手机号不能为空")
    @Mobile
    private String user_mobile_number;

    /**
     * 原始密码，允许空
     *
     * 当为空时，会自动进行生成
     */
    private String password;

    /*
        随机生成的盐
     */
    private String salt;

//    /**
//     * IP 地址
//     */
//    private String create_ip;
}
