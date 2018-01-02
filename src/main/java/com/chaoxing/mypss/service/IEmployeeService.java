package com.chaoxing.mypss.service;

import com.chaoxing.mypss.model.Employee;

public interface IEmployeeService {
    public Employee getOneByLoginUser(Employee loginEmp);
}
