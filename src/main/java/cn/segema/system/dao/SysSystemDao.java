package cn.segema.system.dao;

import java.util.List;

import cn.segema.system.domain.vo.SysSystemVo;

/**
 * 用户数据库操作类接口
 * @author wangyong
 * @date 2014年3月3日下午1:30:20
 */
public interface SysSystemDao  {
	
	public List<SysSystemVo> querySystems();

}
