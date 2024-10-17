package com.example.Project.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableOneRepository extends JpaRepository<Table_one, Long> {}
