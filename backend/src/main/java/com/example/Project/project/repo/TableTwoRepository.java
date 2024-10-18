package com.example.Project.project.repo;

import com.example.Project.project.model.Table_two;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableTwoRepository extends JpaRepository<Table_two, Long> {}
