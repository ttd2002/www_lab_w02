package vn.edu.iuh.fit.lab_w02.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.lab_w02.enums.EmployeeStatus;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name =  "emp_id")
    private long id;
    @Column(name = "full_name", length = 150, nullable = false)
    private  String fullname;
    @Column(name = "dob",nullable = false)

    private LocalDateTime dob;
    @Column(name = "full_name", length = 150, unique = true)

    private  String email;
    private  String phone;
    private  String address;
    private EmployeeStatus status;


}
