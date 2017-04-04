package cn.segema.customer.web.controller;

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

import cn.segema.customer.domain.CsOrder;
import cn.segema.customer.domain.query.CsOrderQuery;
import cn.segema.customer.domain.vo.CsOrderVo;
import cn.segema.customer.parameter.CsOrderParameter;
import cn.segema.customer.service.CsOrderService;
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
@RequestMapping("/customer/order")
public class CsOrderController extends BaseControllerImpl<CsOrder, CsOrderQuery> {
	
	private Logger log = LoggerFactory.getLogger(CsOrderController.class);
	
	@Autowired
	private CsOrderService csOrderService;

	@Override
	protected BaseService<CsOrder> getBaseService() {
		return csOrderService;
	}
	
	@ResponseBody
	@RequestMapping(value = "/queryOrdersByPage",
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					headers="Content-Type=application/json")
	public Result queryOrdersByPage(@RequestBody CsOrderQuery query,@PageableDefault Pageable pageable) {
		Page<CsOrderVo> orders = csOrderService.queryOrdersByPage(query, pageable);
		return new Result(Status.OK,"成功！", orders);
	}
	
	@ResponseBody
	@RequestMapping(value = "/queryOrderByUserId",
					method = RequestMethod.POST, 
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					headers="Content-Type=application/json")
	public Result queryOrderByUserId(@RequestBody CsOrderParameter parameter) {
		String userId = parameter.getUserId();
		List<CsOrderVo> orders = csOrderService.queryOrderByAccountId(userId);
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
	public Result add(@RequestBody CsOrderParameter parameter) {
		
		CsOrder order = new CsOrder();
		order.setName(parameter.getName());
		order.setPrice(parameter.getPrice());
		csOrderService.insert(order);
		return new Result(Status.OK,"成功！", order);
	}

}
