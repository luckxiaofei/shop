package com.fei.service;

import com.fei.entities.vo.SysAdminVO;

import java.util.List;

public interface SysAdminUserService {
    List<SysAdminVO> getSysAdminVO(String userName);
}
