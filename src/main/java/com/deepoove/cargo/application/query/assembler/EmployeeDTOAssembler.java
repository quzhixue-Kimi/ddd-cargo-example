package com.deepoove.cargo.application.query.assembler;

import com.deepoove.cargo.application.query.dto.EmployeeDTO;
import com.deepoove.cargo.infrastructure.db.dataobject.EmployeeDO;
import com.google.common.base.Function;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDTOAssembler implements Function<EmployeeDO, EmployeeDTO> {

  @Override
  public EmployeeDTO apply(EmployeeDO input) {
    if (input == null)
      return EmployeeDTO.builder().build();
    EmployeeDTO target = EmployeeDTO.builder().name(input.getName()).id(input.getId()).age(input.getAge())
        .gender(input.getGender()).title(input.getTitle()).yearsOfService(input.getYearsOfService()).build();
    return target;
  }

}
