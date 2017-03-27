package com.dianping.ba.es.demo.dao;

import com.dianping.ba.es.demo.dao.po.AccountPO;
import org.apache.ibatis.annotations.Param;

public interface AccountDao {
    AccountPO query(@Param("accountPO") AccountPO accountPO);
}
