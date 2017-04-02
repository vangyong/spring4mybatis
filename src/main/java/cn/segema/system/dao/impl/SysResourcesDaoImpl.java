package cn.segema.system.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.segema.frame.core.dao.impl.BaseDaoImpl;
import cn.segema.system.dao.SysResourcesDao;
import cn.segema.system.domain.SysResources;
import cn.segema.system.domain.vo.SysResourcesVo;

/**
 * 用户数据库操作类接口实现类
 * @author wangyong
 * @date 2014年3月3日下午2:27:45
 */
@Repository
public class SysResourcesDaoImpl extends BaseDaoImpl<SysResources> implements SysResourcesDao {

	@Override
	public List<SysResourcesVo> queryResources() {
		Map params = new HashMap();
		
		List<SysResourcesVo> list = sqlSessionTemplate.selectList("selectResources", params);
		return list;
	}



}
