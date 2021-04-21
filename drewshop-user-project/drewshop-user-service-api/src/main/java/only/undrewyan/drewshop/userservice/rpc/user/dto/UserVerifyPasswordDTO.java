package only.undrewyan.drewshop.userservice.rpc.user.dto;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@ToString
@Accessors(chain = true)
public class UserVerifyPasswordDTO implements Serializable {

    private String user_mobile_number;

    private String password;


}


