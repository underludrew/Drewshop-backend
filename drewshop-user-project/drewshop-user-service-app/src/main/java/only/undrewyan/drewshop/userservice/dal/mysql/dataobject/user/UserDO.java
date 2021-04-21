package only.undrewyan.drewshop.userservice.dal.mysql.dataobject.user;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import only.undrewyan.drewshop.userservice.mybatis.core.dataobject.BaseDO;

import java.util.Date;

/**
 * 用户实体类
 */
@TableName(value = "user")
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ToString
public class UserDO extends BaseDO {

    private Integer user_id;

    private String user_name;

    private String user_mobile_number;

    private String password;

    private String salt;

    private String email;

    private String contact;

    private String country;

    private String city;

//    private Date create_time;
//
//    private Date update_time;
}
