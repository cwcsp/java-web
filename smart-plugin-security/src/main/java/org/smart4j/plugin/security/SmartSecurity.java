package org.smart4j.plugin.security;

import java.util.Set;

public interface SmartSecurity {
    /**
     * 根据用户名获取密码
     */
    String getPassword(String username);

    /**
     * 根据用户名获取角色名集合
     */
    Set<String> getRoleNameSet(String username);

    /**
     * 根据角色名获取权限名集合
     */
    Set<String> getPermissionNameSet(String roleName);
}
