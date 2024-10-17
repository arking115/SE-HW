package com.example.Project.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableOneService {
    private final TableOneRepository tableOneRepository;

    @Autowired
    public TableOneService(TableOneRepository tableOneRepository) {
        this.tableOneRepository = tableOneRepository;
    }
    public List<Table_one> getTableOnes() {
        return tableOneRepository.findAll();
    }
}
