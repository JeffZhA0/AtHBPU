package pers.zjf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 收藏表
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Getter
@Setter
@TableName("t_collect")
public class TCollect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收藏id
     */
    @TableId(value = "collect_id", type = IdType.AUTO)
    private Integer collectId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 博客id
     */
    @TableField("blog_id")
    private Integer blogId;


}
