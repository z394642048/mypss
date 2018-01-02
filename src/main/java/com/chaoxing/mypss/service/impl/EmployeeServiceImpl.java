package com.chaoxing.mypss.service.impl;

import com.chaoxing.mypss.mapper.EmployeeMapper;
import com.chaoxing.mypss.model.Employee;
import com.chaoxing.mypss.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public Employee getOneByLoginUser(Employee loginEmp) {
        Employee loginUser = employeeMapper.getOneByLoginUser(loginEmp);
        if (loginUser!=null){
            return loginUser;
        }else{
            return null;
        }
    }
}
