package cn.segema.sys.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.fasterxml.jackson.annotation.JsonView;

import cn.segema.frame.core.dao.BaseService;
import cn.segema.frame.core.web.controller.BaseControllerImpl;
import cn.segema.frame.core.web.domain.Result;
import cn.segema.frame.core.web.domain.Result.Status;
import cn.segema.sys.domain.SysUser;
import cn.segema.sys.domain.query.SysGroupUserQuery;
import cn.segema.sys.domain.query.SysUserQuery;
import cn.segema.sys.domain.vo.SysGroupUserVo;
import cn.segema.sys.domain.vo.SysUserVo;
import cn.segema.sys.parameter.LoginParameter;
import cn.segema.sys.parameter.RegisterParameter;
import cn.segema.sys.service.SysUserService;

/**
 * 字典信息的基本操作
 * @author wangyong
 * @date 2014年3月5日上午10:30:16
 */
@Controller
@RequestMapping("/sys/user")
public class SysUserController extends BaseControllerImpl<SysUser, SysUserQuery> {
	
	private Logger log = LoggerFactory.getLogger(SysUserController.class);
	
	@Autowired
	private SysUserService sysUserService;

	@Override
	protected BaseService<SysUser> getBaseService() {
		return sysUserService;
	}
	
	@ResponseBody
	@RequestMapping(value = "/listGroupUser", method = RequestMethod.GET)
	public ModelAndView listGroupUser(SysGroupUserQuery query, @PageableDefault Pageable pageable) {
		Page<SysGroupUserVo> page = sysUserService.queryGroupUser(query, pageable);
		ModelAndView mav = new ModelAndView("sys/user/listGroupUser", "page", page);
		mav.addObject("query", query);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value = "/testPost",
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					headers="Content-Type=application/json")
	public Result testPost(@RequestBody RegisterParameter parameter) {
		List<SysGroupUserVo> users = sysUserService.queryGroupUser(parameter.getMobileNumber());
		  return new Result(Status.OK, "成功！",users);
	}
	
	@ResponseBody
	@RequestMapping(value = "/testGet/{mobileNumber}/{password}",method = RequestMethod.GET)
	public Result testGet(@PathVariable String mobileNumber,@PathVariable String password) {
		SysUser sysUser = new SysUser();
		sysUser.setLoginName(mobileNumber);
		sysUser.setMobileNumber(mobileNumber);
		sysUser.setPassword(password);
		getBaseService().insert(sysUser);
		return new Result(Status.OK,"成功！", sysUser);
	}
	
	@ResponseBody
	@RequestMapping(value = "/register",
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					headers="Content-Type=application/json")
	public Result register(@RequestBody RegisterParameter parameter) {
		SysUser sysUser = new SysUser();
		sysUser.setLoginName(parameter.getMobileNumber());
		sysUser.setMobileNumber(parameter.getMobileNumber());
		sysUser.setPassword(parameter.getPassword());
		getBaseService().insert(sysUser);
		return new Result(Status.OK,"成功！", sysUser);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "/login",
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					headers="Content-Type=application/json")
	public Result login(@RequestBody LoginParameter parameter) {
		SysUserQuery sysUserQuery = new SysUserQuery();
		sysUserQuery.setLoginName(parameter.getLoginName());
		sysUserQuery.setPassword(parameter.getPassword());
		SysUserVo sysUserVo = getBaseService().queryOne(sysUserQuery);
		return new Result(Status.OK,"成功！", sysUserVo);
	}

}
