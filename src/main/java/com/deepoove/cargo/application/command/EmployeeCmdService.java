package com.deepoove.cargo.application.command;

import com.deepoove.cargo.application.command.cmd.EmployeeDeleteCommand;
import com.deepoove.cargo.application.command.cmd.EmployeeSaveCommand;

public interface EmployeeCmdService {
  void save(EmployeeSaveCommand employeeSaveCommand);

  void delete(EmployeeDeleteCommand employeeDeleteCommand);
}
