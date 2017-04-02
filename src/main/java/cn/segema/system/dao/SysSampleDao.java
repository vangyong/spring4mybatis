package cn.segema.system.dao;

import java.util.List;

import cn.segema.frame.core.dao.BaseDao;
import cn.segema.system.domain.SysSample;

/**
 * 样品操作类接口
 * @author wangyong
 * @date 2014年3月3日下午1:30:20
 */
public interface SysSampleDao extends BaseDao<SysSample> {
	
	public List<SysSample> testSelectList(String id); 
	

}
