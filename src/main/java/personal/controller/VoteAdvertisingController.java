package personal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import personal.entity.VoteAdvertising;
import personal.service.VoteAdvertisingService;
import personal.util.Page;

@Controller
@RequestMapping("advertising")
public class VoteAdvertisingController {
	
	@Autowired
	private VoteAdvertisingService service;
	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/list")
	public String getList(HttpServletRequest request){
		Page<VoteAdvertising> page = new Page<VoteAdvertising>();
		page.setPageNo(2);
		Page<VoteAdvertising> list = service.getList(page);
		request.setAttribute("list", list);
		return "list";
	}

	//使用@ResponseBody注解，返回json格式
	@RequestMapping("/list")
	@ResponseBody
	public List<VoteAdvertising> getList2(){
		Page<VoteAdvertising> page = new Page<VoteAdvertising>();
		page.setPageNo(2);
		List<VoteAdvertising> list = service.getList(page).getResults();
		return list;
	}

	//rest 风格的请求方式
	@RequestMapping(value = "/getById/{id}")
	public String getList(@PathVariable Long id){
		System.out.println(id);
		VoteAdvertising adv = service.getById(id);
		return "list";
	}
}
