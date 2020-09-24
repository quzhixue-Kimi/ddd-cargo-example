package com.deepoove.cargo.domain.aggregate.employee;

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
public class Employee {
  private int id;
  private String name;
  private int age;
  private String gender;
  private String title;
  private int yearsOfService;
}
