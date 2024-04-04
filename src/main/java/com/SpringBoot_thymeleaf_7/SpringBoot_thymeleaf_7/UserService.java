package com.SpringBoot_thymeleaf_7.SpringBoot_thymeleaf_7;

import java.util.List;

public interface  UserService {
	
	
	 List < UserEntity > getAllEntities();
	    void save(UserEntity user);
	    UserEntity getStudentById(int id);
	    void deleteStudentById(int id);

}