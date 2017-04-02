package cn.segema.system.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.segema.frame.core.dao.BaseDao;
import cn.segema.system.domain.SysUser;
import cn.segema.system.domain.query.SysGroupUserQuery;
import cn.segema.system.domain.vo.SysGroupUserVo;

/**
 * 用户数据库操作类接口
 * @author wangyong
 * @date 2014年3月3日下午1:30:20
 */
public interface SysUserDao extends BaseDao<SysUser> {
	
	public Page<SysGroupUserVo> queryGroupUser(SysGroupUserQuery query,Pageable pageable);

}
