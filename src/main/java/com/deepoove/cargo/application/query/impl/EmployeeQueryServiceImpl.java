package com.deepoove.cargo.application.query.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.deepoove.cargo.application.query.EmployeeQueryService;
import com.deepoove.cargo.application.query.assembler.EmployeeDTOAssembler;
import com.deepoove.cargo.application.query.dto.EmployeeDTO;
import com.deepoove.cargo.application.query.qry.EmployeeFindByNameQry;
import com.deepoove.cargo.application.query.qry.EmployeeFindByTitleQry;
import com.deepoove.cargo.infrastructure.db.dataobject.EmployeeDO;
import com.deepoove.cargo.infrastructure.db.mapper.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeQueryServiceImpl implements EmployeeQueryService {

  @Autowired
  private EmployeeMapper employeeMapper;

  @Autowired
  private EmployeeDTOAssembler converter;

  @Override
  public List<EmployeeDTO> queryEmployees() {
    List<EmployeeDO> employees = employeeMapper.all();
    return employees.stream().map(converter::apply).collect(Collectors.toList());
  }

  @Override
  public List<EmployeeDTO> queryEmployees(EmployeeFindByNameQry qry) {
    List<EmployeeDO> employees = employeeMapper.selectByName(qry.getName());
    return employees.stream().map(converter::apply).collect(Collectors.toList());
  }

  @Override
  public EmployeeDTO getEmployee(int id) {
    EmployeeDO employeeDO = employeeMapper.select(id);
    return converter.apply(employeeDO);
  }

  @Override
  public List<EmployeeDTO> queryEmployees(EmployeeFindByTitleQry qry) {
    List<EmployeeDO> employees = employeeMapper.selectByTitle(qry.getTitle());
    return employees.stream().map(converter::apply).collect(Collectors.toList());
  }

}
