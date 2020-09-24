package com.deepoove.cargo.web.controller;

import java.util.List;

import com.deepoove.cargo.application.command.EmployeeCmdService;
import com.deepoove.cargo.application.command.cmd.EmployeeDeleteCommand;
import com.deepoove.cargo.application.command.cmd.EmployeeSaveCommand;
import com.deepoove.cargo.application.query.EmployeeQueryService;
import com.deepoove.cargo.application.query.dto.EmployeeDTO;
import com.deepoove.cargo.application.query.qry.EmployeeFindByNameQry;
import com.deepoove.cargo.application.query.qry.EmployeeFindByTitleQry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

  @Autowired
  private EmployeeCmdService employeeCmdService;

  @Autowired
  private EmployeeQueryService employeeQueryService;

  @GetMapping(value = "/ping")
  public String ping() {
    return "pong";
  }

  @GetMapping()
  public List<EmployeeDTO> queryEmployees(@RequestParam(value = "name", required = false) String name) {
    if (!StringUtils.isEmpty(name)) {
      EmployeeFindByNameQry qry = EmployeeFindByNameQry.builder().name(name).build();
      return employeeQueryService.queryEmployees(qry);
    }
    return employeeQueryService.queryEmployees();
  }

  @GetMapping(value = "/t")
  public List<EmployeeDTO> queryEmployeesByTitle(@RequestParam(value = "title", required = false) String title) {
    EmployeeFindByTitleQry qry = EmployeeFindByTitleQry.builder().title(title).build();
    return employeeQueryService.queryEmployees(qry);
  }

  @GetMapping(value = "/{id}")
  public EmployeeDTO getEmployee(@PathVariable(name = "id", required = true) int id) {
    return employeeQueryService.getEmployee(id);
  }

  @PostMapping()
  public void save(@RequestBody EmployeeSaveCommand employeeSaveCommand) {
    employeeCmdService.save(employeeSaveCommand);
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable(name = "id", required = true) int id) {
    EmployeeDeleteCommand command = EmployeeDeleteCommand.builder().id(id).build();
    employeeCmdService.delete(command);
  }

}
