package cn.segema.customer.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.segema.customer.domain.CsAccount;
import cn.segema.customer.domain.query.CsAccountQuery;
import cn.segema.customer.domain.vo.CsAccountVo;
import cn.segema.frame.core.service.BaseService;

/**
 * 账号服务类
 * @author wangyong
 * @date 2014年3月7日下午2:25:54
 */
public interface CsAccountService extends BaseService<CsAccount> {
	
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
