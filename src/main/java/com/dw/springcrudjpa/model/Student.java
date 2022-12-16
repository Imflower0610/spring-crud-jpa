package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="crud_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long studentNum;
    @Column
    private String studentName;
    @Column
    private int studentAge;
    @Column
    private String studentPhone;
    @Column
    private String studentAddr;

    @ManyToOne
	@JoinColumn(name="deptNum")
	private Dept dept;

}
