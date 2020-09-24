package com.deepoove.cargo.domain.aggregate.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDeleteDomainEvent {
  private int id;
}
