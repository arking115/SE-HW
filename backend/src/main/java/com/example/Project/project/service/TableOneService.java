package com.example.Project.project.service;

import com.example.Project.project.model.Table_one;
import com.example.Project.project.repo.TableOneRepository;
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
