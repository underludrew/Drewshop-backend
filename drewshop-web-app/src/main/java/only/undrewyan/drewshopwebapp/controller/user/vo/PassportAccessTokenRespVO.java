package only.undrewyan.drewshopwebapp.controller.user.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class PassportAccessTokenRespVO {

    private String access_token;

    private String refresh_token;

    private Date expires_time;
}
