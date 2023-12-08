package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long DepartmentId) {
        return departmentRepository.findById(DepartmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long depId) {
        departmentRepository.deleteById(depId);
    }

    @Override
    public Department updateDepartment(Long depId, Department department) {

        Department dep = departmentRepository.findById(depId).get();

        if (Objects.nonNull(dep.getDepartmentName()) && !"".equalsIgnoreCase(dep.getDepartmentName())) {
            dep.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(dep.getDepartmentCode()) && !"".equalsIgnoreCase(dep.getDepartmentCode())) {
            dep.setDepartmentCode(department.getDepartmentCode());
        }

        return departmentRepository.save(department);
    }

    @Override
    public Department findByDepartmentName(String name) {
        return departmentRepository.findByDepartmentName(name);
    }

    @Override
    public Department findByDepartmentNameIgnoreCase(String name) {
     return  departmentRepository.findDepartmentNameIgnoreCase(name);
    }



    
}