package personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import personal.entity.VoteAdvertising;
import personal.service.VoteAdvertisingService;

@Controller
@RequestMapping("advertising")
public class VoteAdvertisingController {
	
	@Autowired
	private VoteAdvertisingService service;
	
//	@RequestMapping(value = "/list")
//	public String getList(){
//		service.getList();
//		return "list";
//	}

	//使用@ResponseBody注解，返回json格式
//	@RequestMapping("/list")
//	@ResponseBody
//	public List<VoteAdvertising> getList(){
//		List<VoteAdvertising> list = service.getList();
//		return list;
//	}

	//rest 风格的请求方式
	@RequestMapping(value = "/getById/{id}")
	public String getList(@PathVariable Long id){
		System.out.println(id);
		VoteAdvertising adv = service.getById(id);
		return "list";
	}
}
