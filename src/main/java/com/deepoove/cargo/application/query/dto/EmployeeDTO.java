package com.deepoove.cargo.application.query.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EmployeeDTO {
  private int id;
  private String name;
  private int age;
  private String gender;
  private String title;
  private int yearsOfService;
}
