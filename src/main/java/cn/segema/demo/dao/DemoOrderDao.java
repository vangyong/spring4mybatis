package cn.segema.demo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.segema.demo.domain.DemoOrder;
import cn.segema.demo.domain.query.DemoOrderQuery;
import cn.segema.demo.domain.vo.DemoOrderVo;
import cn.segema.frame.core.dao.BaseDao;

/**
 * 订单操作类接口
 * @author wangyong
 */
public interface DemoOrderDao extends BaseDao<DemoOrder> {
	
	public Page<DemoOrderVo> queryOrdersByPage(DemoOrderQuery query,Pageable pageable);
	
	public List<DemoOrderVo> queryOrderByUserId(String userId);

}
