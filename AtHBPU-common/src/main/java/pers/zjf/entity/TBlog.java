package pers.zjf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 博客表
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Getter
@Setter
@TableName("t_blog")
public class TBlog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 博客id
     */
    @TableId(value = "blog_id", type = IdType.AUTO)
    private Integer blogId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 标题
     */
    @TableField("blog_title")
    private String blogTitle;

    /**
     * 发布时间
     */
    @TableField("blog_time")
    private LocalDateTime blogTime;

    /**
     * 内容
     */
    @TableField("blog_text")
    private String blogText;

    /**
     * 审核
     */
    @TableField("blog_audit")
    private Integer blogAudit;


}
