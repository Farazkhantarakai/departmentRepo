package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Department;

import jakarta.persistence.Access;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    public Department findByDepartmentName(String departmentName);


// @Query(value = "",nativeQuery = true)


    public Department findDepartmentNameIgnoreCase(String departmentName);
}
