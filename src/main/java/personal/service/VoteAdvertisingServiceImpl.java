package personal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import personal.entity.VoteAdvertising;
import personal.entity.VoteAdvertisingExample;
import personal.mapper.VoteAdvertisingMapper;
import personal.util.Page;
@Service("voteAdvertisingService")
public class VoteAdvertisingServiceImpl implements VoteAdvertisingService {

	@Autowired
	private VoteAdvertisingMapper mapper; 
	
	@Override
	public VoteAdvertising getById(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<VoteAdvertising> getList(Page<VoteAdvertising> page) {
		List<VoteAdvertising> list = mapper.getList(page);
		page.setResults(list);
		return page;
	}

}
