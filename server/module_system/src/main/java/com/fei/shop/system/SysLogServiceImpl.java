package com.fei.shop.system;

import com.fei.shop.mapper.SysLogMapper;
import com.fei.entities.po.SysLog;
import com.fei.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.dubbo.config.annotation.Service;

@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    public void add(SysLog sysLog) {
        sysLogMapper.insertSelective(sysLog);
    }
}
