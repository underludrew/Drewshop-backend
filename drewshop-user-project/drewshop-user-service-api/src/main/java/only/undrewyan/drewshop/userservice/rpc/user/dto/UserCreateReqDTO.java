package only.undrewyan.drewshop.userservice.rpc.user.dto;




import lombok.Data;
import lombok.experimental.Accessors;
import only.undrewyan.common.framework.validator.Mobile;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户创建 Request DTO
 */
@Data
@Accessors(chain = true)
public class UserCreateReqDTO implements Serializable {

    /**
     * 手机号
     */
    @NotNull(message = "手机号不能为空")
//    @Mobile(message = "手机格式不正确")
    private String user_mobile_number;

    /**
     * 密码
     *
     * 允许为空，自动生成
     */
    private String password;

//    /**
//     * IP
//     */
//    @NotNull(message = "IP 不能为空")
//    private String ip;


}
