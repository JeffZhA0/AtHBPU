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
 * 私信表
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Getter
@Setter
@TableName("t_message")
public class TMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 私信id
     */
    @TableId(value = "message_id", type = IdType.AUTO)
    private Integer messageId;

    /**
     * 用户1
     */
    @TableField("user_id$1")
    private Integer userId$1;

    /**
     * 用户2
     */
    @TableField("user_id$2")
    private Integer userId$2;

    /**
     * 私信内容
     */
    @TableField("message_text")
    private String messageText;


}
