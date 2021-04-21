package only.undrewyan.drewshop.userservice.service.user;

import only.undrewyan.common.framework.exception.ServiceException;
import only.undrewyan.common.framework.exception.util.ServiceExceptionUtil;
import only.undrewyan.common.framework.utils.StringUtil;
import only.undrewyan.drewshop.userservice.convert.user.UserConvert;
import only.undrewyan.drewshop.userservice.dal.mysql.dataobject.user.UserDO;
import only.undrewyan.drewshop.userservice.dal.mysql.mapper.user.UserMapper;
import only.undrewyan.drewshop.userservice.service.user.bo.UserBO;
import only.undrewyan.drewshop.userservice.service.user.bo.UserCreateBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import only.undrewyan.common.framework.utils.DigestUtil;

import static only.undrewyan.drewshop.userservice.enums.UserErrorCodeContants.*;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserBO getUserByMobileNumber(String user_mobile_number){

        UserDO userDO = userMapper.selectByMobileNumber(user_mobile_number);
        return UserConvert.INSTANCE.convert(userDO);
    }

    public UserBO createUserByMobileNumber(UserCreateBO userCreateBO){
        UserDO userDO = UserConvert.INSTANCE.convert(userCreateBO);
        //密码加密
        String passwordSalt = genPasswordSalt();
        String password = userCreateBO.getPassword();

        if (!StringUtil.hasText(password)) {//判断传入的密码是否为空
            password = genPassword();
        }
        password = encodePassword(password, passwordSalt);
        userDO.setPassword(password).setSalt(passwordSalt);
        //保存用户
        userMapper.insert(userDO);

        UserBO userBO = UserConvert.INSTANCE.convert(userDO);
        return userBO;
    }

    public void verifyUserPassword(String user_mobile_number,String password){
        UserDO userDO = userMapper.selectByMobileNumber(user_mobile_number);
        if(userDO == null){// 如果用户为空，抛出异常
            throw ServiceExceptionUtil.exception(USER_NOT_FOUND);
        }
        String encoded_password = encodePassword(password,userDO.getSalt());
        if(!userDO.getPassword().equals(encoded_password)){// 如果密码比对错误，抛出异常
            throw ServiceExceptionUtil.exception(USER_PASSWORD_NOT_CORRECT);
        }

    }

    private String genPasswordSalt() {
        return DigestUtil.genBcryptSalt();
    }

    private String genPassword() {
        return StringUtil.uuid(true);
    }

    private String encodePassword(String password, String salt) {
        return DigestUtil.bcrypt(password, salt);
    }

}
