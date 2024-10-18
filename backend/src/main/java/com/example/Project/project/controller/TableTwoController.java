package com.example.Project.project.controller;

import com.example.Project.project.model.Table_two;
import com.example.Project.project.service.TableTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hello1")
public class TableTwoController {
    private final TableTwoService tableTwoService;

    @Autowired
    public TableTwoController(TableTwoService tableTwoService) {
        this.tableTwoService = tableTwoService;
    }

    @GetMapping
    public List<Table_two> getTableTwoContent() {
        return tableTwoService.getTableOnes();
    }
}
