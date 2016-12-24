package com.employee.model;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.employee.model.dao.EmployeeDAO;
import com.employee.model.vo.EmployeeVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class EmployeeDAOImpTest
{

	@Autowired
	@Qualifier("employeeDAO")
	private EmployeeDAO dao;
	
	@Test
	public void testSave()
	{
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setName("ooo");
		employeeVO.setAge(38);
		dao.save(employeeVO);
	}

	@Test
	public void testUpdate()
	{
//		EmployeeVO newEmployeeVO = new EmployeeVO();
//		newEmployeeVO.setName("Lin");
//		newEmployeeVO.setAge(22);
//		newEmployeeVO.setId(8);
//		dao.update(newEmployeeVO);	
	}

	@Test
	public void testDelete()
	{
//		dao.delete(8);
	}

	@Test
	public void testGetById()
	{
//		System.out.println(dao.getById(1));
	}

	@Test
	public void testFindAll()
	{
//		List<EmployeeVO> list = dao.findAll();
//		for (EmployeeVO employeeVO : list)
//		{
//			System.out.println(employeeVO);
//		}
	}

}
