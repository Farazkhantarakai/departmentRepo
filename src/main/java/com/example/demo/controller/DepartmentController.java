package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Department;
import com.example.demo.services.DepartmentService;
import java.util.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

@PostMapping(value="/departments")
public Department saveDepartment(@RequestBody Department department){
return departmentService.saveDepartment(department);
}

@GetMapping(value="/getDepartment")
public List<Department> getDepartment(){
     return   departmentService.getDepartment();
}


@GetMapping(value="/getDepartment/{id}")
public Department getDepartmentById(@PathVariable("id")  Long departmentId){

return departmentService.getDepartmentById(departmentId);
}

@DeleteMapping(value = "/deleteDepartment/{id}")
public String deleteDepartment(@PathVariable("id") Long departmentId){

 departmentService.deleteDepartmentById(departmentId);

return "Department Deleted Succefully";
}

@PutMapping(value = "/getDepartment/{id}")
public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department) {
    return departmentService.updateDepartment(departmentId,department);
}


@GetMapping(value = "/getDepartmentByName/name/{name}")
public Department getDepartmentByName(@PathVariable("name")  String name){
    return departmentService.findByDepartmentName(name);
}

@GetMapping(value ="/getDepartmentByName/name/{name}")
public Department getDepartmentByNameIgnoreCase(@PathVariable("name") String name){
    return departmentService.findByDepartmentNameIgnoreCase(name);
}


}
