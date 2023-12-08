package com.example.demo.services;
import java.util.* ;
import com.example.demo.entity.Department;


public interface DepartmentService {
    
public Department saveDepartment(Department department);

public List<Department>  getDepartment();

public Department getDepartmentById(Long departmentId);

public void deleteDepartmentById(Long departmentId);

public Department updateDepartment(Long departmentId,Department department);

public Department findByDepartmentName(String name);

public Department findByDepartmentNameIgnoreCase(String name);


}