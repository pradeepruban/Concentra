package com.syntel.isap.provisioning.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.service.ILoginService;

/**
 * @author KK5007843
 *
 */

@Controller
@SessionAttributes("userValue")
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
	
	private static final Logger LOGGER = Logger.getLogger(LoginController.class.getName());
	
	  /**
	    * param 
		* @param @no params	
		* @return model
		*/
		@RequestMapping(value="/logout", method=RequestMethod.GET)
		public String logout() {
			  LOGGER.info("Inside Logout()");
		      return "redirect:index.jsp";
		 }
	  
	  /**
		* param 
		* @param @no params	
		* @return model
		*/
		 @RequestMapping(value="/login", method=RequestMethod.GET)
		 public String login() {
			  LOGGER.info("Inside Login()- GET");
		      return "redirect:index.jsp";
		  }
		  

	   /**
	    * 
		* param 
		* @param @ModelAttribute user	 
		* @return model
		*/
		  @RequestMapping(value="/login", method=RequestMethod.POST)
		  public ModelAndView  login(@ModelAttribute("user") User user) {
			  LOGGER.info("Inside Login()- Post");
			  ModelAndView model = new ModelAndView();
		      String view="index";
			  user=loginService.getUserDetails(user);			  
			  if(user!=null){
				  int roleId = loginService.authenticateUser(user);			
			      if(roleId!=0){
			      model.addObject("userValue", user);
			      }
			      if (roleId==1) {
			    	  
			    	  view="admin/dashboardAdmin";
	
			      }
			      else if(roleId==2){
			 
			    	  view="department/departmentHome";
			      }
			      else if(roleId==3){
			    	  view="department/dashboardDepartment";
			      }	
			      else if(roleId==4){
			    	  //view="department/dashboardDepartment";
			      }
			      else if(roleId==5){
			    	  view="provision/dashboardTenantUser";
			      }
		
			      
			      
			      else {
			    	  model.addObject("error", "Invalid username and password!");
			      }
			  }
			  else{
				  model.addObject("error", "Invalid username and password!");
			  }
		     model.setViewName(view);
			return model;
		  }
		  		  
		 /**
		  * param 
	      * @param @no params		 
		  * @return model 
		  */
		   @RequestMapping(value="/dashboardTenantUser", method=RequestMethod.GET)
			public ModelAndView dashboardTenantUser() {
				  LOGGER.info("Inside dashboardTenantUser()- GET");
				  ModelAndView model = new ModelAndView();
				  model.setViewName("provision/dashboardTenantUser");
			      return model;
			 }
		   
		   
			 /**
			  * param 
		      * @param @no params		 
			  * @return model 
			  */
			   @RequestMapping(value="/dashboardAdmin", method=RequestMethod.GET)
				public ModelAndView dashboardAdminCorporate() {
					  LOGGER.info("Inside dashboardAdminCorporate()- GET");
					  ModelAndView model = new ModelAndView();
					  model.setViewName("admin/dashboardAdmin");
				      return model;
				 }
		   
		   
		   
  }
