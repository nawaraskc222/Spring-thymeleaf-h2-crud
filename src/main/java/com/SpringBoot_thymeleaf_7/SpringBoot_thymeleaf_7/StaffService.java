package com.SpringBoot_thymeleaf_7.SpringBoot_thymeleaf_7;

import java.util.List;


public interface StaffService {
	void save(Staff staff);
	List<Staff> getAll();
	Staff getById(Integer id);
	void delete(Staff staff);
}