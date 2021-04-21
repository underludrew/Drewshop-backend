package only.undrewyan.drewshop.userservice.convert.auth;

import javax.annotation.Generated;
import only.undrewyan.drewshop.userservice.dal.mysql.dataobject.auth.AuthenticationAccessTokenDO;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationAccessTokenRespDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-06T10:14:33+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
public class AuthenticationAccessTokenConvertImpl implements AuthenticationAccessTokenConvert {

    @Override
    public AuthenticationAccessTokenRespDTO convert(AuthenticationAccessTokenDO bean) {
        if ( bean == null ) {
            return null;
        }

        AuthenticationAccessTokenRespDTO authenticationAccessTokenRespDTO = new AuthenticationAccessTokenRespDTO();

        if ( bean.getId() != null ) {
            authenticationAccessTokenRespDTO.setAccess_token( bean.getId() );
        }
        if ( bean.getRefresh_token() != null ) {
            authenticationAccessTokenRespDTO.setRefresh_token( bean.getRefresh_token() );
        }
        if ( bean.getUser_id() != null ) {
            authenticationAccessTokenRespDTO.setUser_id( bean.getUser_id() );
        }
        if ( bean.getUser_type() != null ) {
            authenticationAccessTokenRespDTO.setUser_type( bean.getUser_type() );
        }
        if ( bean.getExpires_time() != null ) {
            authenticationAccessTokenRespDTO.setExpires_time( bean.getExpires_time() );
        }

        return authenticationAccessTokenRespDTO;
    }
}
