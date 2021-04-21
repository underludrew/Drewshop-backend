package only.undrewyan.drewshop.userservice.convert.user;


import only.undrewyan.drewshop.userservice.dal.mysql.dataobject.user.UserDO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserCreateReqDTO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserVerifyPasswordDTO;
import only.undrewyan.drewshop.userservice.service.user.bo.UserBO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserRespDTO;
import only.undrewyan.drewshop.userservice.service.user.bo.UserCreateBO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserBO convert(UserDO bean);

    UserRespDTO convert(UserBO bean);

    UserDO convert(UserCreateBO userCreateBO);

    UserCreateBO convert(UserCreateReqDTO userCreateReqDTO);



}
