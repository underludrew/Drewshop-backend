package only.undrewyan.drewshopwebapp.convert;


import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationAccessTokenRespDTO;
import only.undrewyan.drewshopwebapp.controller.user.vo.auth.AuthenticationAccessTokenRespVO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface AuthenticationAccessTokenConvert {

    AuthenticationAccessTokenConvert INSTANCE = Mappers.getMapper(AuthenticationAccessTokenConvert.class);

    AuthenticationAccessTokenRespVO convert(AuthenticationAccessTokenRespDTO bean);


}
