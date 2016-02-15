package personal.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import personal.entity.VoteAdvertising;
import personal.entity.VoteAdvertisingExample;
import personal.util.Page;

public interface VoteAdvertisingMapper {
    int countByExample(VoteAdvertisingExample example);

    int deleteByExample(VoteAdvertisingExample example);

    int deleteByPrimaryKey(Long advId);

    int insert(VoteAdvertising record);

    int insertSelective(VoteAdvertising record);

    List<VoteAdvertising> selectByExample(VoteAdvertisingExample example);

    VoteAdvertising selectByPrimaryKey(Long advId);

    int updateByExampleSelective(@Param("record") VoteAdvertising record, @Param("example") VoteAdvertisingExample example);

    int updateByExample(@Param("record") VoteAdvertising record, @Param("example") VoteAdvertisingExample example);

    int updateByPrimaryKeySelective(VoteAdvertising record);

    int updateByPrimaryKey(VoteAdvertising record);
    //获取全部数据
    List<VoteAdvertising> getList(Page<VoteAdvertising> page);
}