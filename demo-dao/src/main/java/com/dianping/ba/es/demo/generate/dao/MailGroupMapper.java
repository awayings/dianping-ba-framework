package com.dianping.ba.es.demo.generate.dao;

import com.dianping.ba.es.demo.generate.dao.po.MailGroup;
import com.dianping.ba.es.demo.generate.dao.po.MailGroupCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailGroupMapper {
    int countByExample(MailGroupCriteria example);

    int deleteByExample(MailGroupCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MailGroup record);

    int insertSelective(MailGroup record);

    List<MailGroup> selectByExample(MailGroupCriteria example);

    MailGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MailGroup record, @Param("example") MailGroupCriteria example);

    int updateByExample(@Param("record") MailGroup record, @Param("example") MailGroupCriteria example);

    int updateByPrimaryKeySelective(MailGroup record);

    int updateByPrimaryKey(MailGroup record);
}