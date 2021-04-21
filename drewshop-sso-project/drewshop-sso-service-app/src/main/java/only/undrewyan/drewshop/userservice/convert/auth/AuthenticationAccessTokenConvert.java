package only.undrewyan.drewshop.userservice.convert.auth;

import only.undrewyan.drewshop.userservice.dal.mysql.dataobject.auth.AuthenticationAccessTokenDO;
import only.undrewyan.drewshop.userservice.ssoservice.rpc.auth.dto.AuthenticationAccessTokenRespDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface AuthenticationAccessTokenConvert {

    AuthenticationAccessTokenConvert INSTANCE = Mappers.getMapper(AuthenticationAccessTokenConvert.class);

    @Mapping(source = "id",target = "access_token")
    AuthenticationAccessTokenRespDTO convert(AuthenticationAccessTokenDO bean);
}
