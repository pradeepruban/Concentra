package com.syntel.isap.provisioning.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.service.IIsapAdminUserService;


@Controller
public class IsapAdminUserController {
	
		@Autowired
		private IIsapAdminUserService isapAdminUserService;
		
		private static final Logger LOGGER = Logger.getLogger(IsapAdminUserController.class.getName());
		
	   @RequestMapping(value="/getCorps", method=RequestMethod.GET)
	   public @ResponseBody List<CorporateGroups>  getCorpsJSON() {
			
			return isapAdminUserService.getCorps();
			
		  }
	   
	  @RequestMapping(value="/getDepts", method=RequestMethod.GET)
	   public @ResponseBody List<Department>  getDeptsJSON() {
			
			return isapAdminUserService.getDepts();
			
		  }
	  
	 @RequestMapping(value="/getDeptsJson/{cgId}", method=RequestMethod.GET)
	   public @ResponseBody List<Department>  getDeptsByIdJSON(@PathVariable Integer cgId) {
			
			LOGGER.info("insidegetDeptsByIdJSON "+cgId);
			return isapAdminUserService.getDeptsJsonById(cgId);
			
		  }
	  
	 @RequestMapping(value="/getProj", method=RequestMethod.GET)
	   public @ResponseBody List<Project>  getProjJSON() {
			
			return isapAdminUserService.getProj();
			
		  }
	 
	@RequestMapping(value="/getProjsJson/{dptId}", method=RequestMethod.GET)
	 public @ResponseBody List<Project>  getProjsByIdJSON(@PathVariable Integer dptId) {
		
		LOGGER.info("insidegetProjsByIdJSON "+dptId);
		return isapAdminUserService.getProjsJsonById(dptId);
			
		  }
	 
	 @RequestMapping(value="/getUser", method=RequestMethod.GET)
	   public @ResponseBody List<User>  getUserJSON() {
			
			return isapAdminUserService.getUser();
			
		  }
	   
	 @RequestMapping(value="/ListUsers", method=RequestMethod.GET)
  public ModelAndView allUserLists(HttpSession session) {
	  System.out.println("ProjectController");
	  String view = "admin/UserManagement";
	  List<User> userList=new ArrayList<User>();
	 
	 
	  LOGGER.info("Inside allUserLists()- GET");
	  ModelAndView model = new ModelAndView();
	  userList =  isapAdminUserService.getUser();
	  model.addObject("usrlist", userList);
	
	  model.setViewName(view);
      return model;
  }

	   
	 @RequestMapping("/add")
 public ModelAndView  update(@ModelAttribute("User") User usr)
 {
	 
		 ModelAndView model = new ModelAndView();
	 int i=isapAdminUserService.update(usr);
	   if(i>0)
	    {
		 List<User> user= isapAdminUserService.getUser();
		   model.addObject("list",user);
	     }

	   String view = "admin/UserManagement";
		  List<User> userList=new ArrayList<User>();
		 
		 
		  LOGGER.info("Inside allUserLists()- GET");
		 
		  userList =  isapAdminUserService.getUser();
		  model.addObject("usrlist", userList);
		
		  model.setViewName(view);
	      return model;

 }
	
	

}
