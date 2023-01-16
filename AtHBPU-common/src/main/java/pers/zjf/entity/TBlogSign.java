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
 * 博客标签表
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Getter
@Setter
@TableName("t_blog_sign")
public class TBlogSign implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 博客标签表
     */
    @TableId(value = "bs_id", type = IdType.AUTO)
    private Integer bsId;

    /**
     * 博客id
     */
    @TableField("blog_id")
    private Integer blogId;

    /**
     * 标签
     */
    @TableField("sign")
    private String sign;


}
