package cn.segema.customer.web.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.segema.customer.domain.CsAccount;
import cn.segema.customer.domain.query.CsAccountQuery;
import cn.segema.customer.domain.vo.CsAccountVo;
import cn.segema.customer.parameter.CsRegistParameter;
import cn.segema.customer.service.CsAccountService;
import cn.segema.frame.core.service.BaseService;
import cn.segema.frame.core.web.controller.BaseControllerImpl;
import cn.segema.frame.core.web.domain.Result;
import cn.segema.frame.core.web.domain.Result.Status;
import cn.segema.system.domain.SysUser;
import cn.segema.system.domain.query.SysGroupUserQuery;
import cn.segema.system.domain.query.SysUserQuery;
import cn.segema.system.domain.vo.SysGroupUserVo;
import cn.segema.system.domain.vo.SysUserVo;
import cn.segema.system.parameter.LoginParameter;
import cn.segema.system.parameter.RegisterParameter;

/**
 * 客户端账号控制器
 * @author wangyong
 * @date 2014年3月5日上午10:30:16
 */
@Controller
@RequestMapping("/customer/account")
public class CsAccountController extends BaseControllerImpl<CsAccount, CsAccountQuery> {
	
	private Logger log = LoggerFactory.getLogger(CsAccountController.class);
	
	@Autowired
	private CsAccountService csAccountService;

	@Override
	protected BaseService<CsAccount> getBaseService() {
		return csAccountService;
	}

	@ResponseBody
	@RequestMapping(value = "/regist",
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					headers="Content-Type=application/json")
	public Result regist(@RequestBody CsRegistParameter parameter) {
		CsAccount csAccount = new CsAccount();
		csAccount.setLoginName(parameter.getMobileNumber());
		csAccount.setMobileNumber(parameter.getMobileNumber());
		csAccount.setPassword(parameter.getPassword());
		csAccount.setCreateTime(Timestamp.valueOf(LocalDateTime.now()));
		getBaseService().insert(csAccount);
		return new Result(Status.OK,"成功！", csAccount);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "/login",
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					headers="Content-Type=application/json")
	public Result login(@RequestBody LoginParameter parameter) {
		CsAccountQuery csAccountrQuery = new CsAccountQuery();
		csAccountrQuery.setLoginName(parameter.getLoginName());
		csAccountrQuery.setPassword(parameter.getPassword());
		CsAccountVo csAccountVo = getBaseService().queryOne(csAccountrQuery);
		if(null!=csAccountVo){
			return new Result(Status.OK,"成功！", csAccountVo);
		}else{
			return new Result(Status.ERROR,"失败！");
		}
	}

}
