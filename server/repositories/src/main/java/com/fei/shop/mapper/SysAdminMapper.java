package com.fei.shop.mapper;

import com.fei.entities.po.SysAdmin;
import com.fei.entities.vo.SysAdminVO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface SysAdminMapper extends Mapper<SysAdmin> {

    List<SysAdminVO> listSysAdminVOByName(String name);

}
