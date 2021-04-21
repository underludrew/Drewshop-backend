package only.undrewyan.drewshop.userservice.dal.mysql.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import only.undrewyan.drewshop.userservice.dal.mysql.dataobject.auth.AuthenticationAccessTokenDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthenticationAccessTokenMapper extends BaseMapper<AuthenticationAccessTokenDO> {

    default int deleteByUserIdAndUserType(Integer user_id,Integer user_type){
        return delete(new QueryWrapper<AuthenticationAccessTokenDO>()
                .eq("user_id",user_id).eq("user_type",user_type));
    }

}
