package com.dianping.ba.es.demo.daoTest;

import com.dianping.ba.es.demo.TestBase;
import com.dianping.ba.es.demo.dao.AccountDao;
import com.dianping.ba.es.demo.dao.po.AccountPO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qianyuhang on 7/15/15.
 */
public class AccountDaoTest extends TestBase {
    @Autowired
    private AccountDao accountDao;

    @Test
    public void query(){
        AccountPO accountPO = new AccountPO();
        accountPO.setEmployeeNumber("0009562");
        System.out.println(accountDao.query(accountPO));
    }
}
