package com.govind.demo.service;

import java.util.Objects;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.govind.demo.entity.Department;
import com.govind.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
		
	}

	@Override
	public List fetchDepartmentList() {
		return (List) departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department updateDepartmentById(Long departmentId, Department department) {

		Department depDB = departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getEmployeeName()) &&
		!"".equalsIgnoreCase(department.getEmployeeName())){
			depDB.setEmployeeName(department.getEmployeeName());
		}

		
		if(Objects.nonNull(department.getEmployeeAddress()) &&
				!"".equalsIgnoreCase(department.getEmployeeAddress())){
			depDB.setEmployeeAddress(department.getEmployeeAddress());
		}

		
		if(Objects.nonNull(department.getEmployeeCode()) &&
				!"".equalsIgnoreCase(department.getEmployeeCode())){
			depDB.setEmployeeCode(department.getEmployeeCode());
		}
		
		
		return departmentRepository.save(depDB);
	}



	

}
