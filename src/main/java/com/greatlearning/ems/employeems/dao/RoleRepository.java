package com.greatlearning.ems.employeems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.ems.employeems.entity.Role;



public interface RoleRepository extends JpaRepository<Role, Integer> {

}
