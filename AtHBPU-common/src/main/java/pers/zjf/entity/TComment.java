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
 * 评论表
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Getter
@Setter
@TableName("t_comment")
public class TComment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
    @TableId(value = "comment_id", type = IdType.AUTO)
    private Integer commentId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 评论时间
     */
    @TableField("comment_time")
    private LocalDateTime commentTime;

    /**
     * 是否删除评论
     */
    @TableField("comment_delete")
    private Integer commentDelete;

    /**
     * 博客id
     */
    @TableField("blog_id")
    private Integer blogId;

    /**
     * 是否是回复
     */
    @TableField("comment_reply")
    private Integer commentReply;

    /**
     * 被回复人
     */
    @TableField("user_id$1")
    private Integer userId$1;

    /**
     * 评论内容
     */
    @TableField("comment_text")
    private String commentText;

    /**
     * 回复的评论id
     */
    @TableField("comment_id$1")
    private Integer commentId$1;


}
