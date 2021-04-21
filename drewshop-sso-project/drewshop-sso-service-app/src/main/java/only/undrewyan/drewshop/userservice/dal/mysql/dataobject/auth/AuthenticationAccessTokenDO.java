package only.undrewyan.drewshop.userservice.dal.mysql.dataobject.auth;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import only.undrewyan.drewshop.userservice.mybatis.core.dataobject.BaseDO;

import java.util.Date;

@TableName("authentication_access_token")
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class AuthenticationAccessTokenDO extends BaseDO {

    @TableId(type = IdType.INPUT)
    private String id;

    private Integer user_id;

    private Integer user_type;

    private String refresh_token;

    private Date expires_time;

    private String create_ip;




}
