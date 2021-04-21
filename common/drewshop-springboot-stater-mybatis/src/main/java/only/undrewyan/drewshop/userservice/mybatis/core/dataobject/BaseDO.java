package only.undrewyan.drewshop.userservice.mybatis.core.dataobject;

import java.io.Serializable;
import java.util.Date;

public class BaseDO implements Serializable {

    /*
        创建时间
     */
    private Date create_time;
    /*
        最后更新时间
     */
    private Date update_time;

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "BaseDO{" +
                "create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
