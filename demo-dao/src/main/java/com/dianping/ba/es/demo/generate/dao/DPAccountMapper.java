package com.dianping.ba.es.demo.generate.dao;

import com.dianping.ba.es.demo.generate.dao.po.DPAccount;
import com.dianping.ba.es.demo.generate.dao.po.DPAccountCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DPAccountMapper {
    int countByExample(DPAccountCriteria example);

    int deleteByExample(DPAccountCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DPAccount record);

    int insertSelective(DPAccount record);

    List<DPAccount> selectByExample(DPAccountCriteria example);

    DPAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DPAccount record, @Param("example") DPAccountCriteria example);

    int updateByExample(@Param("record") DPAccount record, @Param("example") DPAccountCriteria example);

    int updateByPrimaryKeySelective(DPAccount record);

    int updateByPrimaryKey(DPAccount record);
}