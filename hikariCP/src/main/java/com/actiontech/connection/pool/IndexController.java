package com.actiontech.connection.pool;

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


    @Resource
    JdbcTemplate jdbcTemplate;

    ThreadLocal<Connection> context = new ThreadLocal();

    @GetMapping("/userList")
    public List<Map<String, Object>> userList() throws SQLException {
        //get connection
        Connection connection;
        LOGGER.debug("start-context-connection:{}", context.get());
        if (null == (connection = context.get())) {
            connection = jdbcTemplate.getDataSource().getConnection();
            context.set(connection);
        }
        PreparedStatement ps = connection.prepareStatement("select 1");
        ps.executeQuery();
        //reset context
//        connection.close();
//        context.remove();
        LOGGER.debug("end-context-connection:{}", context.get());
        return null;
    }
}
