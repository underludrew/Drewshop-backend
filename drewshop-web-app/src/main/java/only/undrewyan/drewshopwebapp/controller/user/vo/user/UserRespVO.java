package only.undrewyan.drewshopwebapp.controller.user.vo.user;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserRespVO {

    private Integer user_id;

    private String user_mobile_number;
}
