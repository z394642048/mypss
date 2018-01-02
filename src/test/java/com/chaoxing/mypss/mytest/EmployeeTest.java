package com.chaoxing.mypss.mytest;

import com.chaoxing.mypss.model.Employee;
import com.chaoxing.mypss.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {

	@Autowired
	private IEmployeeService employeeService;

	@Test
	public void contextLoads() {
        Employee employee = new Employee();
        employee.setUsername("z394642048");
        employee.setPassword("666666");
        Employee loginUser = employeeService.getOneByLoginUser(employee);
		System.out.println(loginUser);
	}

}
