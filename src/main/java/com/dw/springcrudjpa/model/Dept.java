package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="crud_dept")
public class Dept {
    @Id
    @Column
    private long deptNum;
    @Column
    private String deptName;
    @Column
    private String deptClass;
    @Column
    private String deptDate;
    @Column
    private String deptTeacher;
}
