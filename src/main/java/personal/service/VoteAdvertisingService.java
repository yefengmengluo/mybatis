package personal.service;

import personal.entity.VoteAdvertising;
import personal.util.Page;

public interface VoteAdvertisingService {
	public VoteAdvertising getById(Long id);
	public Page<VoteAdvertising> getList(Page<VoteAdvertising> page);
}
