package com.example.Project.project.repo;

import com.example.Project.project.model.Table_one;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableOneRepository extends JpaRepository<Table_one, Long> {}
