package cn.segema.system.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.segema.frame.core.web.domain.Result;
import cn.segema.frame.core.web.domain.Result.Status;
import cn.segema.system.domain.SysUser;
import cn.segema.system.domain.query.SysUserQuery;
import cn.segema.system.domain.vo.SysUserVo;
import cn.segema.system.parameter.LoginParameter;
import cn.segema.system.parameter.RegisterParameter;
import cn.segema.system.service.SysUserService;

@Controller
@RequestMapping("/system/login")
public class SysLoginController {
	private Logger log = LoggerFactory.getLogger(SysLoginController.class);
	@Autowired
	private SysUserService sysUserService;

	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, headers = "Content-Type=application/json")
	public Result register(@RequestBody RegisterParameter parameter) {
		SysUser sysUser = new SysUser();
		sysUser.setLoginName(parameter.getMobileNumber());
		sysUser.setMobileNumber(parameter.getMobileNumber());
		sysUser.setPassword(parameter.getPassword());
		sysUserService.insert(sysUser);
		return new Result(Status.OK, "成功！", sysUser);
	}
	
	@ResponseBody
	@RequestMapping(value = "/login", 
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE, 
					consumes = MediaType.APPLICATION_JSON_VALUE, 
					headers = "Content-Type=application/json")
	public Result login(@RequestBody LoginParameter parameter) {
		SysUserQuery sysUserQuery = new SysUserQuery();
		sysUserQuery.setLoginName(parameter.getLoginName());
		sysUserQuery.setPassword(parameter.getPassword());
		SysUserVo sysUserVo = sysUserService.queryOne(sysUserQuery);
		if (null != sysUserVo) {
			return new Result(Status.OK, "成功！", sysUserVo);
		} else {
			return new Result(Status.ERROR, "失败！");
		}
	}
	
}
