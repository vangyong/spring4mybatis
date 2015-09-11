package cn.segema.sys.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.segema.frame.core.dao.BaseService;
import cn.segema.frame.core.web.controller.BaseControllerImpl;
import cn.segema.frame.core.web.domain.Result;
import cn.segema.frame.core.web.domain.Result.Status;
import cn.segema.sys.domain.SysSample;
import cn.segema.sys.domain.query.SysSampleQuery;
import cn.segema.sys.service.SysSampleService;
import cn.segema.sys.vo.FavUser;

/**
 * 字典信息的基本操作
 * @author wangyong
 * @date 2014年3月5日上午10:30:16
 */
@Controller
@RequestMapping("/sys/sample")
public class SysSampleController extends BaseControllerImpl<SysSample, SysSampleQuery> {
	@Autowired
	private SysSampleService sysSampleService;

	@Override
	protected BaseService<SysSample> getBaseService() {
		return sysSampleService;
	}
	
	@RequestMapping(value ="testSelectList",method = RequestMethod.POST)
	public ModelAndView testSelectList() {
		String id ="123";
		List<SysSample> list = sysSampleService.testSelectList(id);
		ModelAndView mav = new ModelAndView(path.getListViewPath(), "list", list);
		return mav;
	}
	
	@RequestMapping(value ="testSelectList2",method = RequestMethod.POST)
	public String testSelectList2() {
		String id ="123";
		List<SysSample> list = sysSampleService.testSelectList(id);
		return "user/user";
	}
	
	 @RequestMapping(value="/getUserName",method=RequestMethod.POST)
	  public String getUserName(@RequestParam(value="name") String name){
		 System.out.println("测试");
	        return "user/user";
	    }
	
	@RequestMapping("getFavUser")
    public FavUser getFavUser(@RequestParam("userName") String userName,@RequestParam("userId") String userId){
        FavUser favUser = new FavUser();
        favUser.setUserId(userId);
        favUser.setUserName(userName);
       //favUser.setUserAge(userAge);
        List<SysSample> list = sysSampleService.testSelectList(userId);
        
        return favUser;
    }
	
	@RequestMapping("getFavUserBody")
    public FavUser getFavUserBody(@RequestBody String body){
        ObjectMapper mapper = new ObjectMapper();
        FavUser favUser = null;
        try {
            favUser = mapper.readValue(body,  FavUser.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return favUser;
    }

}
