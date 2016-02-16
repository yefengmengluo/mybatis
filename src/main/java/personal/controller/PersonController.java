package personal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import personal.entity.Person;
import personal.service.PersonService;
import personal.util.Page;

@Controller
@RequestMapping("advertising")
public class PersonController {
	
	@Autowired
	private PersonService service;
	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/list")
	public String getList(HttpServletRequest request){
		Page<Person> page = new Page<Person>();
		page.setPageNo(2);
		Page<Person> list = service.getList(page);
		request.setAttribute("list", list);
		return "list";
	}

	//使用@ResponseBody注解，返回json格式
//	@RequestMapping("/list")
//	@ResponseBody
//	public List<Person> getList2(){
//		Page<Person> page = new Page<Person>();
//		page.setPageNo(2);
//		List<Person> list = service.getList(page).getResults();
//		return list;
//	}

	//rest 风格的请求方式
	@RequestMapping(value = "/getById/{id}")
	public String getList(@PathVariable Integer id){
		System.out.println(id);
		Person adv = service.getById(id);
		return "list";
	}
}
