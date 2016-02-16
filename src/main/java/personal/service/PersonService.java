package personal.service;

import personal.entity.Person;
import personal.util.Page;

public interface PersonService {
	public Page<Person> getList(Page<Person> page);
	public Person getById(Integer id);
}
