package com.dianping.ba.es.demo;

import com.dianping.lion.client.Lion;
import com.sankuai.meituan.mybatis.generator.plugins.plugins.ExecuteGenerator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by qianyuhang on 7/15/15.
 */
@Slf4j
public class DaoGeneratorTest extends TestBase {

    @Test
    public void query(){
// Sample
//        new ExecuteGenerator()
//                .setDatabaseUrl(ConfigUtilAdapter.getString("jdbc_url"))
//                .setDatabaseUsername(ConfigUtilAdapter.getString("jdbc_username"))
//                .setDatabasePassword(ConfigUtilAdapter.getString("jdbc_password"))
//                .setJavaCodeBasePath(MtDefaultWebBaseTest.calculateJavaCodeDir())
//                .setResourcesBasePath(MtDefaultWebBaseTest.calculateResourcesDir() + "/base/")
//                .setPageClass(Page.class)
//                .invoke()

        try {
            new ExecuteGenerator()
                    // 数据库的链接方式可以从rds.dp平台上查询到配置名称。比如:dianpingba_account-m3-write
                    // 使用配置名称去lion配置当中搜索到对应的数据的名字。
                    .setDatabaseUrl(Lion.get("ds.dianpingba_account-m3-write.jdbc.url"))
                    .setDatabaseUsername(Lion.get("ds.dianpingba_account-m3-write.jdbc.username"))
                    .setDatabasePassword(Lion.get("ds.dianpingba_account-m3-write.jdbc.password"))
                    .setJavaCodeBasePath(calculateJavaCodeDir())
                    .setResourcesBasePath(calculateResourcesDir())
                    .invoke();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static String calculateJavaCodeDir() {
        String classpathDir = DaoGeneratorTest.class.getResource("/").getFile();
        File javaCode = new File(classpathDir, "../../src/main/java");
        return tryFolder(javaCode, "java源码");
    }

    public static String calculateResourcesDir() {
        String classpathDir = DaoGeneratorTest.class.getResource("/").getFile();
        File resources = new File(classpathDir, "../../src/main/resources");
        return tryFolder(resources, "resources");
    }

    private static String tryFolder(File folder, String folderDesc) {
        try {
            log.info("尝试用[{}]目录作为[{}]目录", folder.getCanonicalPath(), folderDesc);
            if(folder.exists()) {
                return folder.getCanonicalPath();
            }

            log.info("目录[{}]不存在,无法设为[{}]目录", folder.getCanonicalPath(), folderDesc);
        } catch (Exception var3) {
            log.error("不能使用路径[{}{}]作为[{}]目录", folder.getAbsolutePath(), folderDesc, var3);
        }

        return null;
    }

    @Test
    public void testMain(){

        System.out.println("code dir:" + calculateJavaCodeDir());
        System.out.println("ressource dir:" + calculateResourcesDir());
    }

}
