package personal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import personal.entity.Person;
import personal.mapper.PersonMapper;
import personal.util.Page;
@Service("voteAdvertisingService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonMapper mapper;
	
	@Override
	public Page<Person> getList(Page<Person> page) {
		List<Person> persons = mapper.getPageList(page);
		page.setResults(persons);
		return page;
	} 

	@Override
	public Person getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
