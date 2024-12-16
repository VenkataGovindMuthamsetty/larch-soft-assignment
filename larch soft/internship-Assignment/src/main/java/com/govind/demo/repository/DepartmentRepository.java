package com.govind.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.govind.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}

