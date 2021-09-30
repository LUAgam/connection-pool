package com.actiontech.connection.pool;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
public class IndexController {

    @Resource
    JdbcTemplate jdbcTemplate;

    @GetMapping("/userList")
    public List<Map<String, Object>> userList() throws SQLException {

        for (int i = 0; i < 100; i++) {
            String sql = "select " + new Random().nextInt(10);
            List<String> query = jdbcTemplate.query(sql, (rs, rowNum) -> rs.getString(1));
            System.out.println(query);
        }
        return null;
    }
}
