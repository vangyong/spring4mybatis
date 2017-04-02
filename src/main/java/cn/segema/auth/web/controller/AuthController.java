package cn.segema.auth.web.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.segema.frame.core.web.domain.Result;
import cn.segema.frame.core.web.domain.Result.Status;
import cn.segema.system.domain.SysUser;
import cn.segema.system.parameter.RegisterParameter;
import cn.segema.system.service.SysUserService;
import cn.segema.system.web.controller.SysLoginController;

@Controller
@RequestMapping("/auth/auth")
public class AuthController {
	private Logger log = LoggerFactory.getLogger(SysLoginController.class);
	@Autowired
	private SysUserService sysUserService;

	@ResponseBody
	@RequestMapping(value = "/testPost", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, headers = "Content-Type=application/json")
	public Result testPost(@RequestBody Map<String, String> params) {
		SysUser sysUser = new SysUser();
		//sysUser.setLoginName(parameter.getMobileNumber());
		//sysUser.setMobileNumber(parameter.getMobileNumber());
		//sysUser.setPassword(parameter.getPassword());
		sysUserService.insert(sysUser);
		return new Result(Status.OK, "成功！", sysUser);
	}
}
