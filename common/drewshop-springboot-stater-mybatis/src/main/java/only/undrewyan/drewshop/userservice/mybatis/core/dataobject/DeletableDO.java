package only.undrewyan.drewshop.userservice.mybatis.core.dataobject;

import com.baomidou.mybatisplus.annotation.TableLogic;


/**
 * extends BaseDO 扩展 delete 操作
 */
public class DeletableDO extends BaseDO{

    /**
     * 是否删除
     */
    @TableLogic
    private Integer deleted;

    @Override
    public String toString() {
        return "DeletableDO{" +
                "deleted=" + deleted +
                '}';
    }

    public Integer getDeleted() {
        return deleted;
    }

    public DeletableDO setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

}
