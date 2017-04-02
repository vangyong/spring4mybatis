package cn.segema.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.segema.frame.core.dao.BaseDao;
import cn.segema.frame.core.service.impl.BaseServiceImpl;
import cn.segema.system.dao.SysSampleDao;
import cn.segema.system.domain.SysSample;
import cn.segema.system.service.SysSampleService;

/**
 * 字典信息服务类接口实现
 * @author wangyong
 * @date 2014年3月7日下午2:27:08
 */
@Service
public class SysSampleServiceImpl extends BaseServiceImpl<SysSample> implements SysSampleService {
	@Autowired
	private SysSampleDao sysSampleDao;

	@Override
	protected BaseDao<SysSample> getBaseDao() {
		return sysSampleDao;
	}

	@Override
	public List<SysSample> testSelectList(String id) {
		List<SysSample> list  = sysSampleDao.testSelectList(id);
		System.out.println("this");
		return list;
	}
	


}
