package cn.gezhi.mapper;

import cn.gezhi.po.Auditor;
import cn.gezhi.po.AuditorExample;
import java.util.List;

import cn.gezhi.po.Customer;
import org.apache.ibatis.annotations.Param;

public interface AuditorMapper {
    int countByExample(AuditorExample example);

    int deleteByExample(AuditorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Auditor record);

    int insertSelective(Auditor record);

    List<Customer> selectByAuditor(Integer id);

    List<Auditor> selectByExample(AuditorExample example);

    Auditor selectByUsername(String username);

    Auditor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Auditor record, @Param("example") AuditorExample example);

    int updateByExample(@Param("record") Auditor record, @Param("example") AuditorExample example);

    int updateByPrimaryKeySelective(Auditor record);

    int updateByPrimaryKey(Auditor record);
}