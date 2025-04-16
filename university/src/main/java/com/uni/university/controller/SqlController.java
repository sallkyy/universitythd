package com.uni.university.controller;

import com.uni.university.Service.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@RequestMapping("/university")
@Controller
public class SqlController {

    @Autowired
    private SqlService sqlService;

    @GetMapping("/sql")
    public String sqlForm(Model model) {
        model.addAttribute("results", null);
        return "sqlForm"; // Имя Thymeleaf шаблона
    }

    @PostMapping("/sql")
    public String executeSQL(
            @RequestParam("sqlQuery") String sqlQuery,
            Model model
    ) {
        String toLowerQuery = sqlQuery.trim().toLowerCase();
        if (!toLowerQuery.startsWith("select ")) {
            model.addAttribute("error", "Разрешены только SELECT-запросы");
            model.addAttribute("results", null);
            model.addAttribute("sqlQuery", sqlQuery);
            return "sqlForm";
        }
        try {
            List<Map<String, Object>> results = sqlService.executeSQL(sqlQuery);
            model.addAttribute("results", results);
            model.addAttribute("error", null);
        } catch (DataAccessException e) {  // <- Ловим все ошибки работы с БД
            model.addAttribute("error", "Ошибка SQL: " + e.getMostSpecificCause().getMessage());
            model.addAttribute("results", null);
        }
        model.addAttribute("sqlQuery", sqlQuery);
        return "sqlForm";
    }
}

