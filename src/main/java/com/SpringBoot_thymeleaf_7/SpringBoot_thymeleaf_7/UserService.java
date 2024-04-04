package com.SpringBoot_thymeleaf_7.SpringBoot_thymeleaf_7;

import java.util.List;

public interface  UserService {
	
	
	 List < UserEntity > getAllEntities();
	    void save(UserEntity user);
	    UserEntity getEmployeeById(long id);
	    void deleteEmployeeById(long id);

}