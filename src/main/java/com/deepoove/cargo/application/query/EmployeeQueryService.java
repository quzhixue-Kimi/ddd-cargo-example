package com.deepoove.cargo.application.query;

import java.util.List;

import com.deepoove.cargo.application.query.dto.EmployeeDTO;
import com.deepoove.cargo.application.query.qry.EmployeeFindByNameQry;
import com.deepoove.cargo.application.query.qry.EmployeeFindByTitleQry;

public interface EmployeeQueryService {
  List<EmployeeDTO> queryEmployees();

  List<EmployeeDTO> queryEmployees(EmployeeFindByNameQry qry);

  List<EmployeeDTO> queryEmployees(EmployeeFindByTitleQry qry);

  EmployeeDTO getEmployee(int id);
}
