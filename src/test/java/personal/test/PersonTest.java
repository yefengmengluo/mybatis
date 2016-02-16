package personal.test;

import java.util.List;

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
		Page<Person> page = new Page<Person>();
		page.setPageNo(2);
		Page<Person> list = service.getList(page);
		List<Person> advertisings = list.getResults();
		if(!CollectionUtils.isEmpty(advertisings)){
			for(Person person : advertisings){
				System.out.println(person);
			}
		}
	}

}
