package com.fei.admin.shiro;


import com.fei.common_until.bcrypt.BCryptPasswordEncoder;
import com.fei.entities.vo.SysAdminVO;
import com.fei.service.SysAdminUserService;
import com.google.common.collect.Sets;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;

public class AdminAuthorizingRealm extends AuthorizingRealm {

    @Autowired
    private SysAdminUserService sysAdminUserService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        if (principals == null) {
            throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }
        Set<String> roles = Sets.newHashSet();
        Set<String> permissions = Sets.newHashSet();

        SysAdminVO admin = (SysAdminVO) getAvailablePrincipal(principals);
        List<SysRole> roleIds = admin.getSysRoleList();
//        if (Collections3.isNotEmpty(roleIds)) {
//            Example exampleSysRole = new Example(SysRole.class);
//            exampleSysRole.createCriteria().andIn("id", roleIds);
//            List<SysRole> sysRoles = roleMapper.selectByExample(exampleSysRole);
//            roles = sysRoles.stream().map(SysRole::getName).collect(Collectors.toSet());
//
//            Example exampleSysPermission = new Example(SysPermission.class);
//            exampleSysPermission.createCriteria().andIn("roleId", roleIds);
//            List<SysPermission> sysPermissionList = permissionMapper.selectByExample(exampleSysPermission);
//            permissions = sysPermissionList.stream().map(SysPermission::getPermission).distinct().collect(Collectors.toSet());
//        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roles);
        info.setStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String username = upToken.getUsername();
        String password = new String(upToken.getPassword());

        if (StringUtils.isEmpty(username)) {
            throw new AccountException("用户名不能为空");
        }
        if (StringUtils.isEmpty(password)) {
            throw new AccountException("密码不能为空");
        }

        List<com.fei.entities.po.SysAdmin> sysAdminVOList = sysAdminUserService.getSysAdminVO(username);
        Assert.state(sysAdminVOList.size() > 1, "同一个用户名存在多个账户");
        if (sysAdminVOList.size() == 0) {
            throw new UnknownAccountException("找不到用户（" + username + "）的帐号信息");
        }
        com.fei.entities.po.SysAdmin sysAdminVO = sysAdminVOList.get(0);

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (!encoder.matches(password, sysAdminVO.getPassword())) {
            throw new UnknownAccountException("找不到用户（" + username + "）的帐号信息");
        }
        return new SimpleAuthenticationInfo(sysAdminVO, password, getName());
    }

}
