package personal.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import personal.entity.Person;
import personal.entity.PersonExample;
import personal.util.Page;

public interface PersonMapper {
    int countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    
    //条件分页查询
    List<Person> getPageList(Page<Person> page);
}