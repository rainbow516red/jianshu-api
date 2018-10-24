package com.soft1611.jianshu.service;

import com.soft1611.jianshu.entity.LoginUser;
import com.soft1611.jianshu.entity.SysUser;
import com.soft1611.jianshu.utils.ResponseUtil;

import java.util.List;

public interface SysUserService {
    ResponseUtil userLogin(LoginUser loginUser);

    List<SysUser> getHotUsers();
}
