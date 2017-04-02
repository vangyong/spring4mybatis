package cn.segema.system.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.segema.frame.core.constants.SqlId;
import cn.segema.frame.core.dao.impl.BaseDaoImpl;
import cn.segema.system.dao.SysSampleDao;
import cn.segema.system.domain.SysSample;

/**
 * 样品操作类接口实现类
 * @author wangyong
 * @date 2014年3月3日下午2:27:45
 */
@Repository
public class SysSampleDaoImpl extends BaseDaoImpl<SysSample> implements SysSampleDao {

	@Override
	public List<SysSample> testSelectList(String id) {
		Map params = new HashMap();
		params.put("sampleId", id);
		
		List<SysSample> list = sqlSessionTemplate.selectList("testSelectList", params);
		return list;
	}

	
}
