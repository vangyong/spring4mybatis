package cn.segema.system.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.segema.frame.core.dao.BaseDao;
import cn.segema.frame.core.service.impl.BaseServiceImpl;
import cn.segema.system.dao.SysGroupDao;
import cn.segema.system.dao.SysResourcesDao;
import cn.segema.system.dao.SysUserDao;
import cn.segema.system.domain.SysUser;
import cn.segema.system.domain.query.SysGroupUserQuery;
import cn.segema.system.domain.vo.SysGroupUserVo;
import cn.segema.system.domain.vo.SysResourcesVo;
import cn.segema.system.service.SysResourcesService;
import cn.segema.system.service.SysUserService;

/**
 * 用户信息服务类接口实现
 * @author wangyong
 * @date 2014年3月7日下午2:27:08
 */
@Service
public class SysResourcesServiceImpl  implements SysResourcesService {
	@Autowired
	private SysResourcesDao sysResourcesDao;

	@Override
	public List<SysResourcesVo> queryResources() {
		return sysResourcesDao.queryResources();
	}
	
	
	
	

}
