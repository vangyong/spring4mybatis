package cn.segema.business.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.segema.business.domain.BsUser;
import cn.segema.business.domain.query.BsUserQuery;
import cn.segema.business.domain.vo.BsUserVo;
import cn.segema.frame.core.dao.BaseDao;
import cn.segema.system.domain.query.SysGroupUserQuery;
import cn.segema.system.domain.vo.SysGroupUserVo;

/**
 * 订单操作类接口
 * @author wangyong
 */
public interface BsUserDao extends BaseDao<BsUser> {
	
	public Page<BsUserVo> queryOrdersByPage(BsUserQuery query,Pageable pageable);
	
	public List<BsUserVo> queryOrderByUserId(String userId);

}
