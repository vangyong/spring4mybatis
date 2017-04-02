package cn.segema.business.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.segema.business.domain.BsUser;
import cn.segema.business.domain.query.BsUserQuery;
import cn.segema.business.domain.vo.BsUserVo;
import cn.segema.business.parameter.BsUserParameter;
import cn.segema.business.service.BsUserService;
import cn.segema.frame.core.service.BaseService;
import cn.segema.frame.core.web.controller.BaseControllerImpl;
import cn.segema.frame.core.web.domain.Result;
import cn.segema.frame.core.web.domain.Result.Status;

/**
 * 订单的基本操作
 * @author wangyong
 * @date 2014年3月5日上午10:30:16
 */
@Controller
@RequestMapping("/business/order")
public class BsUserController extends BaseControllerImpl<BsUser, BsUserQuery> {
	
	private Logger log = LoggerFactory.getLogger(BsUserController.class);
	
	@Autowired
	private BsUserService bsUserService;

	@Override
	protected BaseService<BsUser> getBaseService() {
		return bsUserService;
	}
	
	@ResponseBody
	@RequestMapping(value = "/queryOrdersByPage",
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					headers="Content-Type=application/json")
	public Result queryOrdersByPage(@RequestBody BsUserQuery query,@PageableDefault Pageable pageable) {
		Page<BsUserVo> orders = bsUserService.queryOrdersByPage(query, pageable);
		return new Result(Status.OK,"成功！", orders);
	}
	
	@ResponseBody
	@RequestMapping(value = "/queryOrderByUserId",
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					headers="Content-Type=application/json")
	public Result queryOrderByUserId(@RequestBody BsUserParameter parameter) {
		String userId = parameter.getUserId();
		List<BsUserVo> orders = bsUserService.queryOrderByUserId(userId);
		if(null!=orders){
			return new Result(Status.OK,"成功！", orders);
		}else{
			return new Result(Status.ERROR,"失败！");
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/add",
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					headers="Content-Type=application/json")
	public Result add(@RequestBody BsUserParameter parameter) {
		
		BsUser order = new BsUser();
		order.setName(parameter.getName());
		order.setPrice(parameter.getPrice());
		bsUserService.insert(order);
		return new Result(Status.OK,"成功！", order);
	}

}
