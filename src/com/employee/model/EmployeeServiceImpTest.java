package com.employee.model;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.employee.model.service.EmployeeService;
import com.employee.model.vo.EmployeeVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class EmployeeServiceImpTest
{

	@Autowired
	@Qualifier("employeeService")
	private EmployeeService srv;
	

	@Test
	public void testSave()
	{
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setName("uxx");
		employeeVO.setAge(25);
		srv.save(employeeVO);
	}

	@Test
	public void testUpdate()
	{
//		EmployeeVO newEmployeeVO = new EmployeeVO();
//		newEmployeeVO.setName("Peter");
//		newEmployeeVO.setAge(16);
//		newEmployeeVO.setId(24);
//		srv.update(newEmployeeVO);	
	}

	@Test
	public void testDelete()
	{
//		srv.delete(24);
	}

	@Test
	public void testGetById()
	{
//		System.out.println(srv.getById(1));
	}

	@Test
	public void testFindAll()
	{
//		List<EmployeeVO> list = srv.findAll();
//		for (EmployeeVO employeeVO : list)
//		{
//			System.out.println(employeeVO);
//		}
	}

}
