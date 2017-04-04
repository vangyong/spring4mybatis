package cn.segema.customer.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import cn.segema.customer.dao.CsAccountDao;
import cn.segema.customer.domain.CsAccount;
import cn.segema.customer.domain.query.CsAccountQuery;
import cn.segema.customer.domain.vo.CsAccountVo;
import cn.segema.frame.core.dao.impl.BaseDaoImpl;
import cn.segema.frame.core.exception.DaoException;

/**
 * 订单接口实现类
 * @author wangyong
 */
@Repository
public class CsAccountDaoImpl extends BaseDaoImpl<CsAccount> implements CsAccountDao {

	@Override
	public CsAccountVo queryAccountById(String accountId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Page<CsAccountVo> queryAccountsByPage(CsAccountQuery query,Pageable pageable) {
		try {
			List<CsAccountVo>  contentList =  sqlSessionTemplate.selectList("queryOrdersByPage",getParams(query, pageable));
			return new PageImpl<CsAccountVo>(contentList, pageable, this.selectCount(query));
		} catch (Exception e) {
			throw new DaoException(String.format("根据分页对象查询列表出错！语句:%s", "queryOrdersByPage"), e);
		}
	}

	

}
