package cn.segema.business.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.segema.business.domain.BsUser;
import cn.segema.business.domain.query.BsUserQuery;
import cn.segema.business.domain.vo.BsUserVo;
import cn.segema.frame.core.service.BaseService;
import cn.segema.system.domain.SysUser;
import cn.segema.system.domain.query.SysGroupUserQuery;
import cn.segema.system.domain.vo.SysGroupUserVo;

/**
 * 用户基础服务类
 * @author wangyong
 * @date 2014年3月7日下午2:25:54
 */
public interface BsUserService extends BaseService<BsUser> {
	
	public Page<BsUserVo> queryOrdersByPage(BsUserQuery query,Pageable pageable);
	
	public List<BsUserVo> queryOrderByUserId(String userId);

}
