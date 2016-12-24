package com.employee.model.dao;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.employee.model.vo.EmployeeVO;

public class EmployeeDAOImp extends HibernateDaoSupport implements EmployeeDAO
{

	@Override
	public void save(EmployeeVO employeeVO)
	{
		super.getHibernateTemplate().save(employeeVO);
		// super.getHibernateTemplate().saveOrUpdate(employeeVO);
	}

	@Override
	public void update(EmployeeVO newEmployeeVO)
	{
		super.getHibernateTemplate().update(newEmployeeVO);
	}

	@Override
	public void delete(Integer id)
	{
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setId(id);
		super.getHibernateTemplate().delete(employeeVO);
	}

	@Override
	public EmployeeVO getById(Integer id)
	{
		return super.getHibernateTemplate().get(EmployeeVO.class, id);
	}

	@Override
	public List<EmployeeVO> findAll()
	{
		String hql = "from EmployeeVO order by id";

		return (List<EmployeeVO>) super.getHibernateTemplate().find(hql);
	}
}
