package only.undrewyan.drewshop.userservice.dal.mysql.mapper.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import only.undrewyan.drewshop.userservice.dal.mysql.dataobject.user.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

    default UserDO selectByMobileNumber(String user_mobile_number){
        return selectOne(new QueryWrapper<UserDO>().eq("user_mobile_number", user_mobile_number));
    }




}
