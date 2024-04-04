package com.SpringBoot_thymeleaf_7.SpringBoot_thymeleaf_7;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl  implements UserService {

	
	 @Autowired
	UserRepository repository;
	
	
	@Override
	public List<UserEntity> getAllEntities() {
		// TODO Auto-generated method stub
		
		
		  List<UserEntity> users = repository.findAll();
		  
        return users;

	}

	@Override
	public void save(UserEntity user) {
		// TODO Auto-generated method stub
		
		this.repository.save(user);
		
	}

	@Override
	public UserEntity getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
	}



	

}
