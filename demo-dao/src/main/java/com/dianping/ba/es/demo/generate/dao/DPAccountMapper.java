package com.dianping.ba.es.demo.generate.dao;

import com.dianping.ba.es.demo.generate.dao.po.DPAccount;
import com.dianping.ba.es.demo.generate.dao.po.DPAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DPAccountMapper {
    int countByExample(DPAccountExample example);

    int deleteByExample(DPAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DPAccount record);

    int insertSelective(DPAccount record);

    List<DPAccount> selectByExample(DPAccountExample example);

    DPAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DPAccount record, @Param("example") DPAccountExample example);

    int updateByExample(@Param("record") DPAccount record, @Param("example") DPAccountExample example);

    int updateByPrimaryKeySelective(DPAccount record);

    int updateByPrimaryKey(DPAccount record);

    List<DPAccount> query(@Param("accountPO") DPAccount dpAccount);
}