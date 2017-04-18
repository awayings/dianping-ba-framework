package com.dianping.ba.es.demo.dao;

import com.dianping.ba.es.demo.generate.dao.DPAccountMapper;
import com.dianping.ba.es.demo.generate.dao.po.DPAccount;
import com.dianping.ba.es.demo.generate.dao.po.DPAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DPAccountDao extends DPAccountMapper {

    List<DPAccount> query(@Param("accountPO") DPAccount dpAccount);
}