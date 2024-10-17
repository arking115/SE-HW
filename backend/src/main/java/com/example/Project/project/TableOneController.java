package com.example.Project.project;

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
