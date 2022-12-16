package com.dw.springcrudjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dw.springcrudjpa.model.Student;

public  interface StudentRepo extends JpaRepository<Student, Long> {
  
   // Dept findBystudentNum(String userId);

//     SELECT * FROM dw_member WHERE user_id = 'dw' AND user_password = '123';
//     Dept findByuserIdAndUserPassword(String userId, String password);

//     SELECT * FROM dw_member WHERE name = '홍길동';
//     Dept findByname(String name);
}
