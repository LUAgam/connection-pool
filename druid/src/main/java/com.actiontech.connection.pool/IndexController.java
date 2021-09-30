package com.actiontech.connection.pool;

import com.alibaba.druid.pool.DruidPooledConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    ThreadLocal<Connection> context = new ThreadLocal();

    @Resource
    JdbcTemplate jdbcTemplate;

    @GetMapping("/userList")
    public String userList() throws SQLException {
        jdbcTemplate.execute("select 2222222222222");
        return "1";
    }
}
