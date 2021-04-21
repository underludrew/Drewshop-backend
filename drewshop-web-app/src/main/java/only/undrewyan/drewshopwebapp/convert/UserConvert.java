package only.undrewyan.drewshopwebapp.convert;

import only.undrewyan.drewshop.userservice.rpc.user.dto.UserCreateReqDTO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserRespDTO;
import only.undrewyan.drewshop.userservice.rpc.user.dto.UserVerifyPasswordDTO;
import only.undrewyan.drewshopwebapp.controller.auth.vo.UserAuthByMobileNumberVO;
import only.undrewyan.drewshopwebapp.controller.user.vo.user.UserRegistByMobileNumberVO;
import only.undrewyan.drewshopwebapp.controller.user.vo.user.UserRespVO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);


    UserCreateReqDTO convert(UserRegistByMobileNumberVO bean);


    UserRespVO convert(UserRespDTO bean);

    UserVerifyPasswordDTO convert(UserAuthByMobileNumberVO bean);


}
