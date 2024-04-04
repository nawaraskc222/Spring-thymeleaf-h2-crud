package com.SpringBoot_thymeleaf_7.SpringBoot_thymeleaf_7;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}