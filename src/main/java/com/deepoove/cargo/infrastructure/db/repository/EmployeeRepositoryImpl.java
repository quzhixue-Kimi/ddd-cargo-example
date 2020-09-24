package com.deepoove.cargo.infrastructure.db.repository;

import com.deepoove.cargo.domain.aggregate.employee.Employee;
import com.deepoove.cargo.domain.aggregate.employee.EmployeeRepository;
import com.deepoove.cargo.infrastructure.db.converter.EmployeeConverter;
import com.deepoove.cargo.infrastructure.db.dataobject.EmployeeDO;
import com.deepoove.cargo.infrastructure.db.mapper.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {

  @Autowired
  private EmployeeMapper employeeMapper;

  @Override
  public void save(Employee employee) {
    EmployeeDO employeeDO = EmployeeConverter.serialize(employee);
    employeeMapper.save(employeeDO);
  }

  @Override
  public void delete(int id) {
    employeeMapper.delete(id);
  }

}
