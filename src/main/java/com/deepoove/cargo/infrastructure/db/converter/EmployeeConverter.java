package com.deepoove.cargo.infrastructure.db.converter;

import com.deepoove.cargo.domain.aggregate.employee.Employee;
import com.deepoove.cargo.infrastructure.db.dataobject.EmployeeDO;

public class EmployeeConverter {

  public static EmployeeDO serialize(Employee employee) {
    EmployeeDO target = EmployeeDO.builder().id(employee.getId()).name(employee.getName()).gender(employee.getGender())
        .title(employee.getTitle()).age(employee.getAge()).yearsOfService(employee.getYearsOfService()).build();
    return target;
  }

  public static Employee deserialize(EmployeeDO employeeDO) {
    Employee target = Employee.builder().age(employeeDO.getAge()).id(employeeDO.getId()).title(employeeDO.getTitle())
        .gender(employeeDO.getGender()).yearsOfService(employeeDO.getYearsOfService()).build();
    return target;
  }

}
