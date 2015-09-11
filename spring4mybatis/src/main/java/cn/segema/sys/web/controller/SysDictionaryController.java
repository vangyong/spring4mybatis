package cn.segema.sys.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.segema.frame.core.dao.BaseService;
import cn.segema.frame.core.web.controller.BaseControllerImpl;
import cn.segema.sys.domain.SysDictionary;
import cn.segema.sys.domain.query.SysDictionaryQuery;
import cn.segema.sys.service.SysDictionaryService;

/**
 * 字典信息的基本操作
 * @author wangyong
 * @date 2014年3月5日上午10:30:16
 */
@Controller
@RequestMapping("/sys/dictionary")
public class SysDictionaryController extends BaseControllerImpl<SysDictionary, SysDictionaryQuery> {
	@Autowired
	private SysDictionaryService sysDictionaryService;

	@Override
	protected BaseService<SysDictionary> getBaseService() {
		return sysDictionaryService;
	}

}
