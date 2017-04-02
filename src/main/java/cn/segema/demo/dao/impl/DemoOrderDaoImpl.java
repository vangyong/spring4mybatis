package cn.segema.demo.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import cn.segema.demo.dao.DemoOrderDao;
import cn.segema.demo.domain.DemoOrder;
import cn.segema.demo.domain.query.DemoOrderQuery;
import cn.segema.demo.domain.vo.DemoOrderVo;
import cn.segema.frame.core.dao.impl.BaseDaoImpl;
import cn.segema.frame.core.exception.DaoException;

/**
 * 订单接口实现类
 * @author wangyong
 */
@Repository
public class DemoOrderDaoImpl extends BaseDaoImpl<DemoOrder> implements DemoOrderDao {

	@Override
	public List<DemoOrderVo> queryOrderByUserId(String userId) {
		return null;
	}
	
	@Override
	public Page<DemoOrderVo> queryOrdersByPage(DemoOrderQuery query,Pageable pageable) {
		try {
			List<DemoOrderVo>  contentList =  sqlSessionTemplate.selectList("queryOrdersByPage",getParams(query, pageable));
			return new PageImpl<DemoOrderVo>(contentList, pageable, this.selectCount(query));
		} catch (Exception e) {
			throw new DaoException(String.format("根据分页对象查询列表出错！语句:%s", "queryOrdersByPage"), e);
		}
	}

	

}
