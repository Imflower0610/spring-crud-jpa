package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Student;
import com.dw.springcrudjpa.model.Dept;
import com.dw.springcrudjpa.repository.DeptRepo;
import com.dw.springcrudjpa.repository.StudentRepo;

@RestController
public class DeptController {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    DeptRepo deptRepo;

//  dept 전체조회
	@GetMapping("api/v1/dept")
    public List<Dept> callAllCrudDept() {
        return deptRepo.findAll();
    }

// student 전체조회
	@GetMapping("api/v1/index")
    public List<Student> callAllCrudStudent() {
        return studentRepo.findAll();
    }


}
