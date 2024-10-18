package com.example.Project.project.controller;

import com.example.Project.project.service.TableOneService;
import com.example.Project.project.model.Table_one;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hello")
public class TableOneController {
    private final TableOneService tableOneService;

    @Autowired
    public TableOneController(TableOneService tableOneService) {
        this.tableOneService = tableOneService;
    }

    @GetMapping
    public List<Table_one> getTableOneContent() {
        return tableOneService.getTableOnes();
    }
}
