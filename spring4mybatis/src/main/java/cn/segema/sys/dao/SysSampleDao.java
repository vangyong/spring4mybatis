package cn.segema.sys.dao;

import java.util.List;

import cn.segema.frame.core.dao.BaseDao;
import cn.segema.sys.domain.SysSample;

/**
 * 样品操作类接口
 * @author wangyong
 * @date 2014年3月3日下午1:30:20
 */
public interface SysSampleDao extends BaseDao<SysSample> {
	
	public List<SysSample> testSelectList(String id); 
	

}
