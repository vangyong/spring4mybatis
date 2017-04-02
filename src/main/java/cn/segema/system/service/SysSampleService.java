package cn.segema.system.service;

import java.util.List;

import cn.segema.frame.core.service.BaseService;
import cn.segema.system.domain.SysSample;

/**
 * 字典信息基础服务类
 * @author wangyong
 * @date 2014年3月7日下午2:25:54
 */
public interface SysSampleService extends BaseService<SysSample> {
	
	public List<SysSample> testSelectList(String id); 

}
