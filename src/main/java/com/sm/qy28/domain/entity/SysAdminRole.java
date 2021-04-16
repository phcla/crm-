package com.sm.qy28.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

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
public class SysAdminRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员id
     */
    private Long adminId;

    /**
     * 角色id
     */
    private Long roleId;


}
