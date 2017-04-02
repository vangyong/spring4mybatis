package cn.segema.system.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.segema.frame.core.dao.BaseDao;
import cn.segema.system.domain.SysUser;
import cn.segema.system.domain.query.SysGroupUserQuery;
import cn.segema.system.domain.vo.SysGroupUserVo;
import cn.segema.system.domain.vo.SysResourcesVo;

/**
 * 用户数据库操作类接口
 * @author wangyong
 * @date 2014年3月3日下午1:30:20
 */
public interface SysResourcesDao  {
	
	public List<SysResourcesVo> queryResources();

}
