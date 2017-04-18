package com.dianping.ba.es.demo.generate.dao;

import com.dianping.ba.es.demo.generate.dao.po.MailGroup;
import com.dianping.ba.es.demo.generate.dao.po.MailGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailGroupMapper {
    int countByExample(MailGroupExample example);

    int deleteByExample(MailGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MailGroup record);

    int insertSelective(MailGroup record);

    List<MailGroup> selectByExample(MailGroupExample example);

    MailGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MailGroup record, @Param("example") MailGroupExample example);

    int updateByExample(@Param("record") MailGroup record, @Param("example") MailGroupExample example);

    int updateByPrimaryKeySelective(MailGroup record);

    int updateByPrimaryKey(MailGroup record);
}