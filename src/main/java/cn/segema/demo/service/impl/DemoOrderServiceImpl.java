package cn.segema.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.segema.customer.domain.vo.CsOrderVo;
import cn.segema.demo.dao.DemoOrderDao;
import cn.segema.demo.domain.DemoOrder;
import cn.segema.demo.domain.query.DemoOrderQuery;
import cn.segema.demo.domain.vo.DemoOrderVo;
import cn.segema.demo.service.DemoOrderService;
import cn.segema.frame.core.dao.BaseDao;
import cn.segema.frame.core.service.impl.BaseServiceImpl;

/**
 * 用户信息服务类接口实现
 * @author wangyong
 * @date 2014年3月7日下午2:27:08
 */
@Service
public class DemoOrderServiceImpl extends BaseServiceImpl<DemoOrder> implements DemoOrderService {
	@Autowired
	private DemoOrderDao demoOrderDao;
	

	@Override
	protected BaseDao<DemoOrder> getBaseDao() {
		return demoOrderDao;
	}

	@Override
	public Page<DemoOrderVo> queryOrdersByPage(DemoOrderQuery query,Pageable pageable) {
		return demoOrderDao.queryOrdersByPage(query, pageable);
	}

	@Override
	public List<DemoOrderVo> queryOrderByUserId(String userId) {
		return demoOrderDao.queryOrderByUserId(userId);
	}
	
	

}
