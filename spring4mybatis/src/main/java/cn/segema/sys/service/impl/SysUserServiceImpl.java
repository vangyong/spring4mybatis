package cn.segema.sys.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.segema.frame.core.dao.BaseDao;
import cn.segema.frame.core.dao.impl.BaseServiceImpl;
import cn.segema.sys.dao.SysGroupDao;
import cn.segema.sys.dao.SysUserDao;
import cn.segema.sys.domain.SysUser;
import cn.segema.sys.domain.query.SysGroupUserQuery;
import cn.segema.sys.domain.vo.SysGroupUserVo;
import cn.segema.sys.service.SysUserService;

/**
 * 用户信息服务类接口实现
 * @author wangyong
 * @date 2014年3月7日下午2:27:08
 */
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements SysUserService {
	@Autowired
	private SysUserDao sysUserDao;
	
	@Autowired
	private SysGroupDao sysGroupDao;

	@Override
	protected BaseDao<SysUser> getBaseDao() {
		return sysUserDao;
	}

	@Override
	public Page<SysGroupUserVo> queryGroupUser(SysGroupUserQuery query,Pageable pageable) {
		return sysUserDao.queryGroupUser(query, pageable);
	}

	@Override
	public List<SysGroupUserVo> queryGroupUser(String userId) {
		List<SysGroupUserVo> users = new ArrayList<SysGroupUserVo>();
		for(int i=0;i<3;i++){
			SysGroupUserVo sysGroupUserVo = new SysGroupUserVo();
			sysGroupUserVo.setUserId(UUID.randomUUID().toString());
			sysGroupUserVo.setNickName("nickName");
			users.add(sysGroupUserVo);
		}
		return users;
	}
	
	

}
