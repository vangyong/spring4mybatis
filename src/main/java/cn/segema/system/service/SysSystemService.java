package cn.segema.system.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.segema.frame.core.service.BaseService;
import cn.segema.system.domain.SysUser;
import cn.segema.system.domain.query.SysGroupUserQuery;
import cn.segema.system.domain.vo.SysGroupUserVo;
import cn.segema.system.domain.vo.SysResourcesVo;
import cn.segema.system.domain.vo.SysSystemVo;

/**
 * 用户基础服务类
 * @author wangyong
 * @date 2014年3月7日下午2:25:54
 */
public interface SysSystemService  {
	
	
	public List<SysSystemVo> querySystems();

}
