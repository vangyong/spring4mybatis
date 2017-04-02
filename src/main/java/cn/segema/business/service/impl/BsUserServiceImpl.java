package cn.segema.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.segema.business.dao.BsUserDao;
import cn.segema.business.domain.BsUser;
import cn.segema.business.domain.query.BsUserQuery;
import cn.segema.business.domain.vo.BsUserVo;
import cn.segema.business.service.BsUserService;
import cn.segema.frame.core.dao.BaseDao;
import cn.segema.frame.core.service.impl.BaseServiceImpl;

/**
 * 用户信息服务类接口实现
 * @author wangyong
 * @date 2014年3月7日下午2:27:08
 */
@Service
public class BsUserServiceImpl extends BaseServiceImpl<BsUser> implements BsUserService {
	@Autowired
	private BsUserDao bsUserDao;
	

	@Override
	protected BaseDao<BsUser> getBaseDao() {
		return bsUserDao;
	}

	@Override
	public Page<BsUserVo> queryOrdersByPage(BsUserQuery query,Pageable pageable) {
		return bsUserDao.queryOrdersByPage(query, pageable);
	}

	@Override
	public List<BsUserVo> queryOrderByUserId(String userId) {
		return bsUserDao.queryOrderByUserId(userId);
	}
	
	

}
