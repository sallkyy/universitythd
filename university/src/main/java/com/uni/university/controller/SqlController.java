package com.uni.university.controller;

import com.uni.university.Service.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String executeSQL(@RequestParam("sqlQuery") String sqlQuery, Model model) {
        List<Map<String, Object>> results = sqlService.executeSQL(sqlQuery);
        model.addAttribute("results", results);
        model.addAttribute("sqlQuery", sqlQuery); // Чтобы отобразить запрос на странице
        return "sqlForm"; // Возвращаем тот же шаблон
    }
}

