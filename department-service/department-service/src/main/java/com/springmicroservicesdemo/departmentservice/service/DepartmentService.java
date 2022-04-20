package com.springmicroservicesdemo.departmentservice.service;

import com.springmicroservicesdemo.departmentservice.entity.Department;
import com.springmicroservicesdemo.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside Save department of department service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("InsidefindDepartmentById of department service");

        return departmentRepository.findByDepartmentId(departmentId);
    }
}
