package cn.segema.system.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.segema.frame.core.dao.impl.BaseDaoImpl;
import cn.segema.system.dao.SysSystemDao;
import cn.segema.system.domain.SysSystem;
import cn.segema.system.domain.vo.SysResourcesVo;
import cn.segema.system.domain.vo.SysSystemVo;

/**
 * 用户数据库操作类接口实现类
 * @author wangyong
 * @date 2014年3月3日下午2:27:45
 */
@Repository
public class SysSystemDaoImpl extends BaseDaoImpl<SysSystem> implements SysSystemDao {

	@Override
	public List<SysSystemVo> querySystems() {
		Map params = new HashMap();
		
		List<SysSystemVo> list = sqlSessionTemplate.selectList("selectSystems", params);
		return list;
	}



}
