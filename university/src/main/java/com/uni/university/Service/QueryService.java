package com.uni.university.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QueryService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> executeSelectQuery(String sql) {
        //Валидация sql, чтобы не было Insert, Delete, Update и тд.
        if (!sql.toLowerCase().trim().startsWith("select")) {
            throw new IllegalArgumentException("Only SELECT queries are allowed.");
        }

        return jdbcTemplate.queryForList(sql);
    }
}

