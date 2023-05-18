package com.greatlearning.ems.employeems.service;

import java.util.List;

import com.greatlearning.ems.employeems.entity.Employee;
import com.greatlearning.ems.employeems.entity.Role;
import com.greatlearning.ems.employeems.entity.User;



public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(Integer theId);

	public List<Employee> searchByFirstName(String firstName);

	public List<Employee> sortByFirstNameAsc();

	public User saveUser(User user);

	public Role saveRole(Role role);
}
