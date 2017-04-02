package cn.segema.customer.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import cn.segema.customer.dao.CsOrderDao;
import cn.segema.customer.domain.CsOrder;
import cn.segema.customer.domain.query.CsOrderQuery;
import cn.segema.customer.domain.vo.CsOrderVo;
import cn.segema.frame.core.dao.impl.BaseDaoImpl;
import cn.segema.frame.core.exception.DaoException;

/**
 * 订单接口实现类
 * @author wangyong
 */
@Repository
public class CsOrderDaoImpl extends BaseDaoImpl<CsOrder> implements CsOrderDao {

	@Override
	public List<CsOrderVo> queryOrderByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Page<CsOrderVo> queryOrdersByPage(CsOrderQuery query,Pageable pageable) {
		try {
			List<CsOrderVo>  contentList =  sqlSessionTemplate.selectList("queryOrdersByPage",getParams(query, pageable));
			return new PageImpl<CsOrderVo>(contentList, pageable, this.selectCount(query));
		} catch (Exception e) {
			throw new DaoException(String.format("根据分页对象查询列表出错！语句:%s", "queryOrdersByPage"), e);
		}
	}

	

}
