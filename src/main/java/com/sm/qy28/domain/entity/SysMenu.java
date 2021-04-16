package com.sm.qy28.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.sm.qy28.domain.entity.base.BaseEntity;
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
public class SysMenu extends BaseEntity {


    /**
     * 菜单标题
     */
    private String menuTitle;

    /**
     * 上级菜单id
     */
    private Long parentId;

    /**
     * 菜单分类 0：表示目录 1： 表示菜单  2：表示按钮
     */
    private Integer menuType;

    /**
     * 菜单排序
     */
    private Integer menuSort;

    /**
     * 路由地址
     */
    private String menuPath;

    /**
     * 菜单图标
     */
    private String menuIcon;

    /**
     * 组件地址
     */
    private String component;

    /**
     * 是否隐藏
     */
    private Boolean isHidden;

    /**
     * 权限标识
     */
    private String permission;




}
