package personal.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import personal.entity.Person;
import personal.service.PersonService;
import personal.util.Page;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/applicationContext.xml"})
public class PersonTest {
	
	@Autowired
	private PersonService service;
	
	@Test
	public void getById() {
	}

	@Test
	public void getList() {
		String keyWord = "刘";
		Page<Person> page = new Page<Person>();
		page.setPageNo(1);
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("keyWord", keyWord);
		page.setParams(params);
		Page<Person> list = service.getList(page);
		List<Person> persons = list.getResults();
		if(!CollectionUtils.isEmpty(persons)){
			for(Person person :persons){
				System.out.println(person);
			}
		}
	}

}
