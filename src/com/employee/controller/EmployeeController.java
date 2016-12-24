package com.employee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.employee.model.vo.EmployeeVO;
import com.employee.model.service.EmployeeService;

@Controller // �i��spring�����O���@��controller(POJO ���qjava��H)
public class EmployeeController
{
	@Autowired
	@Qualifier("employeeService")
	private EmployeeService srv;

	/*
	 * insertEmp
	 */
	@RequestMapping("/emp_controller/insertEmp/{name}/{age}")
	public ModelAndView insertEmp(@PathVariable("name") String name, @PathVariable("age") int age)
	{
		EmployeeVO employeeVO = new EmployeeVO(name, age);
		srv.save(employeeVO);
		return null;
	}

	/*
	 * updateEmpInfo
	 */
	@RequestMapping("/emp_controller/updateEmpInfo/{id}/{name}/{age}")
	public ModelAndView updateEmpInfo(@PathVariable("id") int id, @PathVariable("name") String name, @PathVariable("age") int age)
	{
		EmployeeVO newEmployeeVO = new EmployeeVO(id, name, age);
		srv.update(newEmployeeVO);
		return null;
	}

	/*
	 * delEmpInfo
	 */
	@RequestMapping("/emp_controller/delEmpInfo/{id}")
	public ModelAndView delEmpInfo(@PathVariable("id") int id)
	{
		srv.delete(id);
		return null;
	}

	/*
	 * getEmpInfo
	 */
	@RequestMapping("/emp_controller/getEmpInfo/{id}")
	public ModelAndView getEmpInfo(@PathVariable("id") int id)
	{
		ModelAndView mav = new ModelAndView();
		EmployeeVO employeeVO = srv.getById(id);
		mav.addObject("msg", "Hello data method2!!");
		mav.addObject(employeeVO); // = mav.addObject("user",user);
		mav.setViewName("forward:/jsp/6_data.jsp");
		return mav;
	}

	/*
	 * getAllEmp�A���list
	 */
	@RequestMapping(value = "/emp_controller/showEmpList")
	public ModelAndView showEmpList()
	{
		ModelAndView mav = new ModelAndView();
		List<EmployeeVO> allEmp = srv.findAll();
		mav.getModelMap().addAttribute("list", allEmp);
		mav.setViewName("forward:/jsp/showEmpList.jsp");
		return mav;
	}

	/*
	 * getAllEmp�A�^��json�r��
	 */
	@RequestMapping("/emp_controller/getAllEmp")
	@ResponseBody
	public Object getAllEmp()
	{
		List<EmployeeVO> allEmp = srv.findAll();
		return allEmp;
	}
}
