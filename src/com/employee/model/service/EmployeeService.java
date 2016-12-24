package com.employee.model.service;

import java.util.List;

import com.employee.model.vo.EmployeeVO;

public interface EmployeeService
{
	public void save(EmployeeVO employeeVO);
	
	public void update(EmployeeVO newEmployeeVO);
	
	public void delete(Integer id);
	
	public EmployeeVO getById(Integer id);
	
	public List<EmployeeVO> findAll();

}
