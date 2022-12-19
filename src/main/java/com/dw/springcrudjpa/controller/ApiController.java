package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Dept;
import com.dw.springcrudjpa.model.Student;
import com.dw.springcrudjpa.repository.DeptRepo;
import com.dw.springcrudjpa.repository.StudentRepo;


@RestController
public class ApiController {

	@Autowired
	StudentRepo studentRepo;

	// student 전체조회
	@GetMapping("api/v1/index")
	public List<Student> callAllCrudStudent() {
		return studentRepo.findAll();
	}

	// student 상세조회
	@GetMapping("api/v1/index/{studentNum}")
	public Student callStudentById(@PathVariable long studentNum) {
		return studentRepo.findById(studentNum).get();
	}

	//student 수정
	@PatchMapping("api/v1/index/modify")
	public Student updateStudent(@RequestBody Student student) {
		student = studentRepo.save(student);
		return student;
	}
	// student 추가
	@PostMapping("api/v1/index/add")
	public Student callSaveStudent(@RequestBody Student student) {
		student = studentRepo.save(student);
		return student;
	}
	// student 삭제
	@DeleteMapping("api/v1/index/{studentNum}")
	public boolean callDeleteStudent(@PathVariable long studentNum) {
		try {
			studentRepo.deleteById(studentNum);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Autowired
	DeptRepo deptRepo;
	
	//  dept 전체조회
	@GetMapping("api/v1/dept")
	public List<Dept> callAllCrudDept() {
		return deptRepo.findAll();
	}
	// dept 상세조회
	@GetMapping("api/v1/dept/{deptNum}")
	public Dept callDeptById(@PathVariable long deptNum) {
		return deptRepo.findById(deptNum).get();
	}

	//dept 수정
	@PatchMapping("api/v1/dept/modify")
	public Dept updateDept(@RequestBody Dept dept) {
		dept = deptRepo.save(dept);
		return dept;
	}


	// dept 추가
	@PostMapping("api/v1/dept/add")
	public Dept callSaveDept(@RequestBody Dept dept) {
		dept = deptRepo.save(dept);
		return dept;
	}
	// dept 삭제
	@DeleteMapping("api/v1/dept/{deptNum}")
	public boolean callDeleteDept(@PathVariable long deptNum) {
		try {
			deptRepo.deleteById(deptNum);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}

