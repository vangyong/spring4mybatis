package cn.segema.customer.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.segema.customer.domain.CsOrder;
import cn.segema.customer.domain.query.CsOrderQuery;
import cn.segema.customer.domain.vo.CsOrderVo;
import cn.segema.frame.core.service.BaseService;

/**
 * 用户基础服务类
 * @author wangyong
 * @date 2014年3月7日下午2:25:54
 */
public interface CsOrderService extends BaseService<CsOrder> {
	
	public Page<CsOrderVo> queryOrdersByPage(CsOrderQuery query,Pageable pageable);
	
	public List<CsOrderVo> queryOrderByUserId(String userId);

}
