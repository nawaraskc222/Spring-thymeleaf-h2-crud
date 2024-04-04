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
        return repository.findAll();

	}

	@Override
	public void save(UserEntity user) {
		// TODO Auto-generated method stub
		
		this.repository.save(user);
		
	}

	@Override
	public UserEntity getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		
	}

	

}
