package cn.segema.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.segema.customer.dao.CsOrderDao;
import cn.segema.customer.domain.CsOrder;
import cn.segema.customer.domain.query.CsOrderQuery;
import cn.segema.customer.domain.vo.CsOrderVo;
import cn.segema.customer.service.CsOrderService;
import cn.segema.frame.core.dao.BaseDao;
import cn.segema.frame.core.service.impl.BaseServiceImpl;

/**
 * 用户信息服务类接口实现
 * @author wangyong
 * @date 2014年3月7日下午2:27:08
 */
@Service
public class CsOrderServiceImpl extends BaseServiceImpl<CsOrder> implements CsOrderService {
	@Autowired
	private CsOrderDao orderDao;
	

	@Override
	protected BaseDao<CsOrder> getBaseDao() {
		return orderDao;
	}

	@Override
	public Page<CsOrderVo> queryOrdersByPage(CsOrderQuery query,Pageable pageable) {
		return orderDao.queryOrdersByPage(query, pageable);
	}

	@Override
	public List<CsOrderVo> queryOrderByUserId(String userId) {
		return orderDao.queryOrderByUserId(userId);
	}
	
	

}
