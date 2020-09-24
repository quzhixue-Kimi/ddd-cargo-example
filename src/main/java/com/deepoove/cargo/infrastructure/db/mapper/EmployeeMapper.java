package com.deepoove.cargo.infrastructure.db.mapper;

import java.util.List;

import com.deepoove.cargo.infrastructure.db.dataobject.EmployeeDO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeMapper {
  EmployeeDO select(@Param("id") int id);

  List<EmployeeDO> selectByName(@Param("name") String name);

  List<EmployeeDO> all();

  List<EmployeeDO> selectByTitle(@Param("title") String title);

  void save(EmployeeDO employeeDO);

  void delete(int id);
}
