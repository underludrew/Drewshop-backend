package only.undrewyan.drewshop.userservice.service.user.bo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 用户信息
 */
@Data
@Accessors(chain = true)
@ToString
public class UserBO {
    private Integer user_id;

    private String user_name;

    private String user_mobile_number;

    private String password;

    private String salt;

    private String email;

    private String contact;

    private String country;

    private String city;

    private Date create_time;

    private Date update_time;
}
