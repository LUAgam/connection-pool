package com.actiontech.connection.pool;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {

    @Resource
    JdbcTemplate jdbcTemplate;

    @GetMapping("/userList")
    public List<Map<String, Object>> userList() {
        String sql = "select sleep(20)";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }
}
