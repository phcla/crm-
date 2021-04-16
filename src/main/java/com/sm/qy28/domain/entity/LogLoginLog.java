package com.sm.qy28.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author phcla
 * @since 2021-04-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LogLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 登录日志id
     */
    @TableId(value = "login_id", type = IdType.AUTO)
    private Long loginId;

    /**
     * 谁登录的
     */
    private String adminName;

    /**
     * 登录者使用电脑的ip
     */
    private String requestIp;

    /**
     * 登录地点
     */
    private String loginAddress;

    /**
     * 登录使用的浏览器名称
     */
    private String broswerName;

    /**
     * 登录使用电脑的系统名称
     */
    private String osName;

    /**
     * 登录状态0： 表示登录成功 1： 表示登录失败
     */
    private Integer loginStatus;

    /**
     * 登录提示信息
     */
    private String message;

    /**
     * 登录时间
     */
    private LocalDateTime loginTime;


}
