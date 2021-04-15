# connection-pool


* [Druid](https://github.com/alibaba/druid/wiki/%E9%A6%96%E9%A1%B5)
阿里出品的一个功能比较全面，且扩展性较好的数据库连接池，比较方便对jdbc接口进行监控跟踪等。
* [HikariCP](https://github.com/brettwooldridge/HikariCP)
HiKariCP是数据库连接池的一个后起之秀，号称性能最好，可以完美地PK掉其他连接池，是一个高性能的JDBC连接池，基于BoneCP做了不少的改进和优化，spring data jdbc默认连接池。
* [Tomcat-jdbc](https://tomcat.apache.org/tomcat-7.0-doc/jdbc-pool.html)
JDBC 连接池 org.apache.tomcat.jdbc.pool 是 Apache Commons DBCP 连接池的一种替换或备选方案。
* [DBCP](https://commons.apache.org/dbcp/configuration.html)
DBCP(DataBase connection pool)数据库连接池是 apache 上的一个Java连接池项目。DBCP通过连接池预先同数据库建立一些连接放在内存中(即连接池中)，应用程序需要建立数据库连接时直接到从接池中申请一个连接使用，用完后由连接池回收该连接，从而达到连接复用，减少资源消耗的目的。
* [C3P0](https://www.mchange.com/projects/c3p0/)
c3p0是成熟的，高度并发的JDBC连接池库，支持缓存和重用PreparedStatements。您可以选择根据LGPL v.2.1 或EPL v.1.0许可它 。
