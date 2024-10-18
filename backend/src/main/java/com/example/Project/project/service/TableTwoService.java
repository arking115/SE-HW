package com.example.Project.project.service;

import com.example.Project.project.controller.TableTwoController;
import com.example.Project.project.model.Table_two;
import com.example.Project.project.repo.TableTwoRepository;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableTwoService {
    private final TableTwoRepository tableTwoRepository;

    @Autowired
    public TableTwoService(TableTwoRepository tableTwoRepository) {
        this.tableTwoRepository = tableTwoRepository;
    }
    public List<Table_two> getTableOnes() {
        return tableTwoRepository.findAll();
    }
}
