package com.dianping.ba.es.demo.daoTest;

import com.dianping.ba.es.demo.TestBase;
import com.dianping.ba.es.demo.dao.AccountDao;
import com.dianping.ba.es.demo.generate.dao.DPAccountMapper;
import com.dianping.ba.es.demo.dao.po.AccountPO;
import com.dianping.ba.es.demo.generate.dao.po.DPAccountExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qianyuhang on 7/15/15.
 */
public class AccountDaoTest extends TestBase {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private DPAccountMapper dpAccountMapper;

    @Test
    public void query(){
        AccountPO accountPO = new AccountPO();
        accountPO.setEmployeeNumber("0009562");
        System.out.println(accountDao.query(accountPO));

        DPAccountExample example = new DPAccountExample();
        example.createCriteria().andEmployeenumberEqualTo("0009562");
        System.out.println(dpAccountMapper.selectByExample(example));

    }

}
