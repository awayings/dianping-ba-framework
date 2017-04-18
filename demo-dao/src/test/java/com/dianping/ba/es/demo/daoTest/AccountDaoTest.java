package com.dianping.ba.es.demo.daoTest;

import com.dianping.ba.es.demo.TestBase;
import com.dianping.ba.es.demo.dao.AccountDao;

import com.dianping.ba.es.demo.dao.DPAccountDao;
import com.dianping.ba.es.demo.dao.po.AccountPO;

import com.dianping.ba.es.demo.generate.dao.DPAccountMapper;
import com.dianping.ba.es.demo.generate.dao.po.DPAccount;
import com.dianping.ba.es.demo.generate.dao.po.DPAccountExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qianyuhang on 7/15/15.
 */
public class AccountDaoTest extends TestBase {
    @Autowired
    private AccountDao accountDao;

//    @Autowired
//    private DPAccountMapper dpAccountMapper;

    @Autowired
    DPAccountDao dpAccountDao;

    @Test
    public void query(){
        AccountPO accountPO = new AccountPO();
        accountPO.setEmployeeNumber("0009562");
        System.out.println("1");
        System.out.println(accountDao.query(accountPO));
//
        DPAccountExample example = new DPAccountExample();
        example.createCriteria().andEmployeeNumberEqualTo("0009562");
        System.out.println("2");
//        System.out.println(dpAccountMapper.selectByExample(example));

        DPAccount dpAccount = new DPAccount();
        dpAccount.setEmployeeNumber("0009562");
        System.out.println("3");
//        System.out.println(dpAccountMapper.query(dpAccount));

        System.out.println("4");
        System.out.println(dpAccountDao.query(dpAccount));
        System.out.println("5");
        System.out.println(dpAccountDao.selectByExample(example));
        System.out.println("6");
        System.out.println(dpAccountDao.countByExample(example));
    }

}
