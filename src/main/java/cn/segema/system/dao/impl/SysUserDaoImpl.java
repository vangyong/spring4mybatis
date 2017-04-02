package cn.segema.system.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import cn.segema.frame.core.dao.impl.BaseDaoImpl;
import cn.segema.frame.core.exception.DaoException;
import cn.segema.system.dao.SysUserDao;
import cn.segema.system.domain.SysUser;
import cn.segema.system.domain.query.SysGroupUserQuery;
import cn.segema.system.domain.vo.SysGroupUserVo;

/**
 * 用户数据库操作类接口实现类
 * @author wangyong
 * @date 2014年3月3日下午2:27:45
 */
@Repository
public class SysUserDaoImpl extends BaseDaoImpl<SysUser> implements SysUserDao {

	@Override
	public Page<SysGroupUserVo> queryGroupUser(SysGroupUserQuery query,Pageable pageable) {
		try {
			List<SysGroupUserVo>  contentList =  sqlSessionTemplate.selectList("selectGroupUser",getParams(query, pageable));
			return new PageImpl<SysGroupUserVo>(contentList, pageable, this.selectCount(query));
		} catch (Exception e) {
			throw new DaoException(String.format("根据分页对象查询列表出错！语句:%s", "selectGroupUser"), e);
		}
	}

}
