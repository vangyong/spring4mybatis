package cn.segema.customer.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.segema.customer.domain.CsOrder;
import cn.segema.customer.domain.query.CsOrderQuery;
import cn.segema.customer.domain.vo.CsOrderVo;
import cn.segema.frame.core.dao.BaseDao;

/**
 * 订单操作类接口
 * @author wangyong
 */
public interface CsOrderDao extends BaseDao<CsOrder> {
	
	public Page<CsOrderVo> queryOrdersByPage(CsOrderQuery query,Pageable pageable);
	
	public List<CsOrderVo> queryOrderByAccountId(String accountId);

}
