package com.fei.module.system;

import com.fei.db.mapper.SysLogMapper;
import com.fei.entities.po.SysLog;
import com.fei.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    public void add(SysLog sysLog) {
        sysLogMapper.insertSelective(sysLog);
    }
}
