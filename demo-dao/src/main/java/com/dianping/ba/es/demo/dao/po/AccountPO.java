package com.dianping.ba.es.demo.dao.po;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * Created by justin on 7/23/15.
 */
@Data
@Alias("Account")
public class AccountPO {
    private String employeeNumber;
    private String name;

}
