package only.undrewyan.drewshop.userservice.rpc.user.dto;


import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
@ToString
public class UserRespDTO implements Serializable {

//    private Integer user_id;
//
//    private String user_name;
//
//    private String user_mobile_number;
//
//    private String password;
//
//    private String salt;
//
//    private String email;
//
//    private String contact;
//
//    private String country;
//
//    private String city;
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
