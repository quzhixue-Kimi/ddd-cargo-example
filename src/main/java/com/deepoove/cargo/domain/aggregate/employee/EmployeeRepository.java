package com.deepoove.cargo.domain.aggregate.employee;

public interface EmployeeRepository {
  void save(Employee employee);

  void delete(int id);
}
