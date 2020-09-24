package com.deepoove.cargo.infrastructure.db.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDO {
  private int id;
  private String name;
  private int age;
  private String gender;
  private String title;
  private int yearsOfService;
}
