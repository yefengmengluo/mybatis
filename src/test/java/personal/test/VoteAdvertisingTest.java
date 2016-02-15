package personal.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import personal.entity.VoteAdvertising;
import personal.service.VoteAdvertisingService;
import personal.util.Page;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/applicationContext.xml"})
public class VoteAdvertisingTest {
	
	@Autowired
	private VoteAdvertisingService service;
	
	@Test
	public void getById() {
		VoteAdvertising advertising = service.getById(4200l);
		System.out.println(advertising);
	}

	@Test
	public void getList() {
		Page<VoteAdvertising> page = new Page<VoteAdvertising>();
		page.setPageNo(2);
		Page<VoteAdvertising> list = service.getList(page);
		List<VoteAdvertising> advertisings = list.getResults();
		if(!CollectionUtils.isEmpty(advertisings)){
			for(VoteAdvertising advertising : advertisings){
				System.out.println(advertising);
			}
		}
	}

}
