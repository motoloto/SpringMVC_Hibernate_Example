package com.employee.model.service;

import java.util.List;

import com.employee.model.dao.EmployeeDAO;
import com.employee.model.vo.EmployeeVO;

public class EmployeeServiceImp implements EmployeeService
{
	private EmployeeDAO dao;
	
	public void setDao(EmployeeDAO dao)
	{
		this.dao = dao;
	}
	
	@Override
	public void save(EmployeeVO employeeVO)
	{
		dao.save(employeeVO);
		//throw new RuntimeException("Error");
	}

	@Override
	public void update(EmployeeVO newEmployeeVO)
	{
		dao.update(newEmployeeVO);
	}

	@Override
	public void delete(Integer id)
	{
		dao.delete(id);
	}

	@Override
	public EmployeeVO getById(Integer id)
	{
		return dao.getById(id);
	}

	@Override
	public List<EmployeeVO> findAll()
	{
		return dao.findAll();
	}

}
