package cn.segema.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.segema.frame.core.dao.BaseDao;
import cn.segema.frame.core.service.impl.BaseServiceImpl;
import cn.segema.system.dao.SysDictionaryDao;
import cn.segema.system.domain.SysDictionary;
import cn.segema.system.service.SysDictionaryService;

/**
 * 字典信息服务类接口实现
 * @author wangyong
 * @date 2014年3月7日下午2:27:08
 */
@Service
public class SysDictionaryServiceImpl extends BaseServiceImpl<SysDictionary> implements SysDictionaryService {
	@Autowired
	private SysDictionaryDao sysDictionaryDao;

	@Override
	protected BaseDao<SysDictionary> getBaseDao() {
		return sysDictionaryDao;
	}

}
