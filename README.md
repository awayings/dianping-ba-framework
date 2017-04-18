# dianping-ba-framework
基于Java的web项目框架。

## 尝试解决的
### 目前较多冗余的依赖，和不用的jar包。
ba-es-middleware,  
platform-sdk,
ba-es-loggit,

### 公司共有组件包快速更新。
inf-bom

## 项目进度
1. Spring core/aop
2. 接入mybatis数据层。
  * 数据层分离，做更好的测试。
  * 代码生成。生成逻辑和后增代码做隔离。
3. 接入业务逻辑 
  * org
  * sso
  * squirrel 
  * permission 
  * swagger
  * pigeon
  * mobile-oauth
  * lion
  * cat
  * log
  * ehcache
  * mybatis-generator; 
      * 生成代码做分离
      * 配置文件放入git，人人可以重新生成。
  * mafka/crane
4. 常用工具类打包。
  * 字符串，日期，文件，excel， 下载。
  * 类型转换
