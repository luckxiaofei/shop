package com.fei.service;

import com.fei.entities.vo.SysAdminVO;

import java.util.List;

public interface SysAdminUserService {
    List<com.fei.entities.po.SysAdmin> getSysAdminVO();
    List<com.fei.entities.po.SysAdmin> getSysAdminVO(String name);
}
