package com.SpringBoot_thymeleaf_7.SpringBoot_thymeleaf_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class UserController {
	
	
	 @Autowired
	 private UserRepository userRepository;
	
	
	 @Autowired
	 private UserService userService;
	 
	
	 
	 
	 @GetMapping("/")	
	 public String index(Model model) {
	     UserEntity userEntity = new UserEntity();
	     model.addAttribute("user", userEntity);			
	     return "new_employee"; // Return the name of the Thymeleaf template
	 }

			
	  @PostMapping("/saveEmployee")
	    public String saveEmployee(@ModelAttribute("user") UserEntity userEntity,Model model) {
	      
		   String name=userEntity.getName();
		   int id=userEntity.getId();			   		   
		   System.out.println("Running");  
		   
		   System.out.println("The name is"+name);		   
		   System.out.println("The id is"+id);
		   
//		   userService.save(userEntity);	 
		   userRepository.save(userEntity);	
		   
		   
		   
		   model.addAttribute("name",name);
		   model.addAttribute("id",id);
		   
		   model.addAttribute("userEntity",userEntity);
		   
//	        model.addAttribute("userEntity", userService.getAllEntities());

		   
		   
//	        return "new_employee";
		   
		   return "user-data";
	    }

}
