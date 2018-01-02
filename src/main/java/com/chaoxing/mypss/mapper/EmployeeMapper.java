package com.chaoxing.mypss.mapper;

import com.chaoxing.mypss.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmployeeMapper {
    Employee getOneByLoginUser(Employee loginEmp);
}
