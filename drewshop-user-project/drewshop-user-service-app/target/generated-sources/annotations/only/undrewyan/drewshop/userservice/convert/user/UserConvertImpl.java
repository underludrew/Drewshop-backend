package only.undrewyan.drewshop.userservice.convert.user;

import javax.annotation.Generated;
import only.undrewyan.drewshop.userservice.dal.mysql.dataobject.user.UserDO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserCreateReqDTO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserRespDTO;
import only.undrewyan.drewshop.userservice.service.user.bo.UserBO;
import only.undrewyan.drewshop.userservice.service.user.bo.UserCreateBO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-31T11:19:23+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
public class UserConvertImpl implements UserConvert {

    @Override
    public UserBO convert(UserDO bean) {
        if ( bean == null ) {
            return null;
        }

        UserBO userBO = new UserBO();

        if ( bean.getUser_id() != null ) {
            userBO.setUser_id( bean.getUser_id() );
        }
        if ( bean.getUser_name() != null ) {
            userBO.setUser_name( bean.getUser_name() );
        }
        if ( bean.getUser_mobile_number() != null ) {
            userBO.setUser_mobile_number( bean.getUser_mobile_number() );
        }
        if ( bean.getPassword() != null ) {
            userBO.setPassword( bean.getPassword() );
        }
        if ( bean.getSalt() != null ) {
            userBO.setSalt( bean.getSalt() );
        }
        if ( bean.getEmail() != null ) {
            userBO.setEmail( bean.getEmail() );
        }
        if ( bean.getContact() != null ) {
            userBO.setContact( bean.getContact() );
        }
        if ( bean.getCountry() != null ) {
            userBO.setCountry( bean.getCountry() );
        }
        if ( bean.getCity() != null ) {
            userBO.setCity( bean.getCity() );
        }
        if ( bean.getCreate_time() != null ) {
            userBO.setCreate_time( bean.getCreate_time() );
        }
        if ( bean.getUpdate_time() != null ) {
            userBO.setUpdate_time( bean.getUpdate_time() );
        }

        return userBO;
    }

    @Override
    public UserRespDTO convert(UserBO bean) {
        if ( bean == null ) {
            return null;
        }

        UserRespDTO userRespDTO = new UserRespDTO();

        if ( bean.getUser_id() != null ) {
            userRespDTO.setUser_id( bean.getUser_id() );
        }
        if ( bean.getUser_name() != null ) {
            userRespDTO.setUser_name( bean.getUser_name() );
        }
        if ( bean.getUser_mobile_number() != null ) {
            userRespDTO.setUser_mobile_number( bean.getUser_mobile_number() );
        }
        if ( bean.getPassword() != null ) {
            userRespDTO.setPassword( bean.getPassword() );
        }
        if ( bean.getSalt() != null ) {
            userRespDTO.setSalt( bean.getSalt() );
        }
        if ( bean.getEmail() != null ) {
            userRespDTO.setEmail( bean.getEmail() );
        }
        if ( bean.getContact() != null ) {
            userRespDTO.setContact( bean.getContact() );
        }
        if ( bean.getCountry() != null ) {
            userRespDTO.setCountry( bean.getCountry() );
        }
        if ( bean.getCity() != null ) {
            userRespDTO.setCity( bean.getCity() );
        }
        if ( bean.getCreate_time() != null ) {
            userRespDTO.setCreate_time( bean.getCreate_time() );
        }
        if ( bean.getUpdate_time() != null ) {
            userRespDTO.setUpdate_time( bean.getUpdate_time() );
        }

        return userRespDTO;
    }

    @Override
    public UserDO convert(UserCreateBO userCreateBO) {
        if ( userCreateBO == null ) {
            return null;
        }

        UserDO userDO = new UserDO();

        if ( userCreateBO.getUser_id() != null ) {
            userDO.setUser_id( userCreateBO.getUser_id() );
        }
        if ( userCreateBO.getUser_name() != null ) {
            userDO.setUser_name( userCreateBO.getUser_name() );
        }
        if ( userCreateBO.getUser_mobile_number() != null ) {
            userDO.setUser_mobile_number( userCreateBO.getUser_mobile_number() );
        }
        if ( userCreateBO.getPassword() != null ) {
            userDO.setPassword( userCreateBO.getPassword() );
        }
        if ( userCreateBO.getSalt() != null ) {
            userDO.setSalt( userCreateBO.getSalt() );
        }

        return userDO;
    }

    @Override
    public UserCreateBO convert(UserCreateReqDTO userCreateReqDTO) {
        if ( userCreateReqDTO == null ) {
            return null;
        }

        UserCreateBO userCreateBO = new UserCreateBO();

        if ( userCreateReqDTO.getUser_mobile_number() != null ) {
            userCreateBO.setUser_mobile_number( userCreateReqDTO.getUser_mobile_number() );
        }
        if ( userCreateReqDTO.getPassword() != null ) {
            userCreateBO.setPassword( userCreateReqDTO.getPassword() );
        }

        return userCreateBO;
    }
}
