package cn.segema.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.segema.customer.dao.CsAccountDao;
import cn.segema.customer.domain.CsAccount;
import cn.segema.customer.domain.query.CsAccountQuery;
import cn.segema.customer.domain.vo.CsAccountVo;
import cn.segema.customer.service.CsAccountService;
import cn.segema.frame.core.dao.BaseDao;
import cn.segema.frame.core.service.impl.BaseServiceImpl;

/**
 * 用户信息服务类接口实现
 * @author wangyong
 * @date 2014年3月7日下午2:27:08
 */
@Service
public class CsAccountServiceImpl extends BaseServiceImpl<CsAccount> implements CsAccountService {
	@Autowired
	private CsAccountDao accountDao;
	

	@Override
	protected BaseDao<CsAccount> getBaseDao() {
		return accountDao;
	}

	@Override
	public Page<CsAccountVo> queryAccountsByPage(CsAccountQuery query,Pageable pageable) {
		return accountDao.queryAccountsByPage(query, pageable);
	}

	@Override
	public CsAccountVo queryAccountById(String accountId) {
		return accountDao.queryAccountById(accountId);
	}
	
	

}
