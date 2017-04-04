package cn.segema.customer.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.segema.customer.domain.CsAccount;
import cn.segema.customer.domain.query.CsAccountQuery;
import cn.segema.customer.domain.vo.CsAccountVo;
import cn.segema.frame.core.dao.BaseDao;

/**
 * 客户端账号操作类接口
 * @author wangyong
 */
public interface CsAccountDao extends BaseDao<CsAccount> {
	
	/**
	 * 分页查询账号
	 * @param query
	 * @param pageable
	 * @return
	 */
	public Page<CsAccountVo> queryAccountsByPage(CsAccountQuery query,Pageable pageable);
	
	/**
	 * 根据账号Id查询账号
	 * @param accountId
	 * @return
	 */
	public CsAccountVo queryAccountById(String accountId);

}
