package cn.segema.business.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import cn.segema.business.dao.BsUserDao;
import cn.segema.business.domain.BsUser;
import cn.segema.business.domain.query.BsUserQuery;
import cn.segema.business.domain.vo.BsUserVo;
import cn.segema.frame.core.dao.impl.BaseDaoImpl;
import cn.segema.frame.core.exception.DaoException;

/**
 * 订单接口实现类
 * @author wangyong
 */
@Repository
public class BsUserDaoImpl extends BaseDaoImpl<BsUser> implements BsUserDao {

	@Override
	public List<BsUserVo> queryOrderByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Page<BsUserVo> queryOrdersByPage(BsUserQuery query,Pageable pageable) {
		try {
			List<BsUserVo>  contentList =  sqlSessionTemplate.selectList("queryOrdersByPage",getParams(query, pageable));
			return new PageImpl<BsUserVo>(contentList, pageable, this.selectCount(query));
		} catch (Exception e) {
			throw new DaoException(String.format("根据分页对象查询列表出错！语句:%s", "queryOrdersByPage"), e);
		}
	}

	

}
