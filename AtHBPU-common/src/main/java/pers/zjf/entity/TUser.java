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
 * 用户表
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Getter
@Setter
@TableName("t_user")
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 注册时间
     */
    @TableField("user_regist_time")
    private LocalDateTime userRegistTime;

    /**
     * 邮箱
     */
    @TableField("user_email")
    private String userEmail;

    /**
     * 上一次登录时间
     */
    @TableField("user_last_logon_time")
    private LocalDateTime userLastLogonTime;

    /**
     * 密码
     */
    @TableField("user_password")
    private String userPassword;

    /**
     * 昵称
     */
    @TableField("user_nickname")
    private String userNickname;

    /**
     * 性别
     */
    @TableField("user_gender")
    private Integer userGender;

    /**
     * 介绍
     */
    @TableField("user_introduce")
    private String userIntroduce;

    /**
     * 电话号码
     */
    @TableField("user_phone_number")
    private String userPhoneNumber;


}
