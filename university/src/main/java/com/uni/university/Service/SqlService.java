package com.uni.university.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SqlService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> executeSQL(String sqlQuery) {
        return jdbcTemplate.queryForList(sqlQuery);
    }

    public int executeCrud(String sqlQuery) {
        return jdbcTemplate.update(sqlQuery);
    }
}
