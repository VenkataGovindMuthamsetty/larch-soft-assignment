package com.govind.demo.service;

import org.hibernate.mapping.List;

import com.govind.demo.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartmentById(Long departmentId, Department department);

	

}
