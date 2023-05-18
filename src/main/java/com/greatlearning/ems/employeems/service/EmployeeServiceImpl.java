package com.greatlearning.ems.employeems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.greatlearning.ems.employeems.dao.EmployeeRepository;
import com.greatlearning.ems.employeems.dao.RoleRepository;
import com.greatlearning.ems.employeems.dao.UserRepository;
import com.greatlearning.ems.employeems.entity.Employee;
import com.greatlearning.ems.employeems.entity.Role;
import com.greatlearning.ems.employeems.entity.User;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	BCryptPasswordEncoder bcryptEncoder;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);

		Employee theEmployee = null;

		if (result.isPresent()) {
			theEmployee = result.get();
		} else {
		   
		  throw new RuntimeException("Did not find employee id - " + theId);
		}

		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);
	}

	@Override
	public void deleteById(Integer theId) {
		employeeRepository.deleteById(theId);

	}

	@Override
	public List<Employee> searchByFirstName(String firstName) {
		return employeeRepository.findByFirstNameContainsAllIgnoreCase(firstName);
	}

	@Override
	public List<Employee> sortByFirstNameAsc() {
		return employeeRepository.findAllByOrderByFirstNameAsc();
	}

	/*@Override
	public User saveUser(User user) {
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}*/

	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

}
