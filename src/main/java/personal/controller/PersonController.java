package personal.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import personal.entity.Person;
import personal.service.PersonService;
import personal.util.Page;

@Controller
@RequestMapping("person")
public class PersonController {

	/**
	 * 注册时间类型的属性编辑器，将String转化为Date
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

	@Autowired
	private PersonService service;

	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/list")
	public String getList(HttpServletRequest request, @RequestParam(required=false,defaultValue="1") Integer pageNo) {
		Page<Person> page = new Page<Person>();
		page.setPageNo(pageNo);
		Page<Person> list = service.getList(page);
		request.setAttribute("list", list);
		return "/person/list";
	}

	// rest 风格的请求方式
	@RequestMapping(value = "/getById/{id}")
	public String getList(@PathVariable Integer id) {
		System.out.println(id);
		Person adv = service.getById(id);
		return "list";
	}
}
