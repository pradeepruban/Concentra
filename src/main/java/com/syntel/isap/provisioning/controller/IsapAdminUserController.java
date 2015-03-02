package com.syntel.isap.provisioning.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.UserRoleMap;
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
	   
	 
	 @RequestMapping(value="/getAdminDetails/{id}", method=RequestMethod.GET)
	 public @ResponseBody UserRoleMap getAdminUserRole(@PathVariable Integer id) {
		
		 
		 UserRoleMap userrolemap = new UserRoleMap();
		 
		 userrolemap= isapAdminUserService.getAdminDetailsJsonById(id);
		 
		LOGGER.info("insidegetProjsByIdJSON "+id);
		return userrolemap;
			
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
 public ModelAndView addNewUser(@ModelAttribute("User") User usr)
     {
		 LOGGER.info("Inside allUserLists()- GET");
		 String view = "admin/UserManagement";
		 List<User> userList=new ArrayList<User>();
		 ModelAndView model = new ModelAndView();
		 
		 isapAdminUserService.addUserInUserTable(usr);
		 
		 
		 userList =  isapAdminUserService.getUser();
		 model.addObject("usrlist", userList);
		 model.setViewName(view);
	     return model;

 }
	 
	 @RequestMapping(value ="/deleteUser")
		public ModelAndView deleteUser(@RequestParam(value = "usr_id") Integer usr_id,HttpSession session ) 
	  {
		/* System.out.println(""+usr_id);*/
		 ModelAndView model = new ModelAndView();
		  String view = "admin/UserManagement";
		  
		 LOGGER.info("Inside deleteUser()- GET");
		  isapAdminUserService.deleteUser(usr_id);
		 List<User> userList=new ArrayList<User>();
		  LOGGER.info("Inside deleteUser()- GET");
		  
		  
		  userList =  isapAdminUserService.getUser();
		  model.addObject("usrlist", userList);
		  model.setViewName(view);
	      return model;
		
		}
	 @RequestMapping(value="/getUserInEditTable/{userId}", method = RequestMethod.GET)
		public @ResponseBody User getUserInJSON(@PathVariable Integer userId) {
		 
		 LOGGER.info("Inside getUserInEditTable()- GET");
		 System.out.println("user Controller inside");
		 
		 User useredit = new User();
		 useredit =isapAdminUserService.getUserById(userId);	
		 System.out.println("inside the getUserInEditTable username"+useredit.getUsr_name()); 
		 
		 System.out.println("inside the getUserInEditTable corpratid"+useredit.getCg_id()); 
		 return useredit;
		}
	 
	 @RequestMapping(value="/getUsersToEdit", method = RequestMethod.GET)
		public @ResponseBody List<User> getUsersListInJSON(HttpSession session) {
		  User user= (User) session.getAttribute("userValue");
		  LOGGER.info("Inside user getUsers Session Values"+user.getCg_id());
		  List<User> usersList=isapAdminUserService.getUsersByuser(user);
 
		  return usersList;
		} 
	 
	 @RequestMapping(value="/editUserDetails", method=RequestMethod.POST)
	  public ModelAndView  editUserDetails( @ModelAttribute("user") User user,HttpSession session){
		  List<User> userList=new ArrayList<User>();
		  String view = "admin/UserManagement";
		 /* User userSession= (User) session.getAttribute("userValue");*/
		  
		 /* user.setUsr_id(userSession.getUsr_id());*/
		  System.out.println(user.getUsr_name());
		  ModelAndView model = new ModelAndView();
		  
		  LOGGER.info("Inside editUserDetails()- Post");
		  
		 isapAdminUserService.getUserFromUserTable(user);
		  
	    
	     userList =  isapAdminUserService.getUser();
		 model.addObject("usrlist", userList);
		 model.setViewName(view);
	     return model;
	  }
	 
	 
	/* 
	 @RequestMapping(value="/getNewDeptUsers{userId}", method = RequestMethod.GET)
	 public @ResponseBody User geNewDeptUsersInJSON(@PathVariable Integer userId ){
		
		  List<User> usersList=isapAdminUserService.getUsersByuser(userId);

		  return usersList;
		} */
	 @RequestMapping(value="/getNonAdminUsers/", method=RequestMethod.GET)
	   public @ResponseBody List<UserRoleMap>  getNonAdminUsersInJSON() {
			
			
			return isapAdminUserService.getNonAdminUsers();
			
		  }
	 
	 @RequestMapping(value="/getNewDeptUsers/{dptId}", method=RequestMethod.GET)
	   public @ResponseBody List<User>  geNewDeptUsersInJSON(@PathVariable Integer dptId) {
			
			
			
			LOGGER.info("insidegetDeptsByIdJSON "+dptId);
			
			
			return isapAdminUserService.getNewDeptsUseById(dptId);
			
		  }

	 
	 @RequestMapping(value="/getNewCorpUsers/{cgId}", method=RequestMethod.GET)
	   public @ResponseBody List<User>  geNewCoprUsersInJSON(@PathVariable Integer cgId) {
			
			
			
			LOGGER.info("insidegetDeptsByIdJSON "+cgId);
		
			return isapAdminUserService.getNewCoprUsersInJSONId(cgId);
			
		  }
	 
	 @RequestMapping(value="/getNewProjUsers/{projId}", method=RequestMethod.GET)
	   public @ResponseBody List<User>  getNewProjUsersInJSON(@PathVariable Integer projId) {
			
		
			LOGGER.info("insidegetDeptsByIdJSON "+projId);
		
			return isapAdminUserService. getNewProjUsersJSON(projId);
			
		  }
	 
	 
	 @RequestMapping(value="/updateNewAdmin", method=RequestMethod.POST)
	  public ModelAndView  updateNewAdmin( @ModelAttribute("user") User user,HttpSession session){
		 
		 System.out.println("inside update new controller");
		  List<User> userList=new ArrayList<User>();
		  String view = "admin/UserManagement";
		 
		  System.out.println(user.getUsr_name());
		  ModelAndView model = new ModelAndView();
		  
		  LOGGER.info("Inside updateNewAdmin()- Post");
		  
		 isapAdminUserService.updateDeptadminDetails(user);
		  
	     userList =  isapAdminUserService.getUser();
		 model.addObject("usrlist", userList);
		 model.setViewName(view);
	     return model;
	  }
	 
	 
	 
	 @RequestMapping(value="/updateNewCorpAdmin", method=RequestMethod.POST)
	  public ModelAndView  updateNewCorpAdmin( @ModelAttribute("user") User user,HttpSession session){
		 
		 System.out.println("inside update new controller");
		  List<User> userList=new ArrayList<User>();
		  String view = "admin/UserManagement";
		 
		  System.out.println(user.getUsr_name());
		  ModelAndView model = new ModelAndView();
		  
		  LOGGER.info("Inside updateNewAdmin()- Post");
		  
		 isapAdminUserService.updateCorpAdminDetails(user);
		  
	     userList =  isapAdminUserService.getUser();
		 model.addObject("usrlist", userList);
		 model.setViewName(view);
	     return model;
	  }
	 @RequestMapping(value="/updateNewProjAdmin", method=RequestMethod.POST)
	  public ModelAndView  updateNewProjAdmin( @ModelAttribute("user") User user,HttpSession session){
		 
		 System.out.println("inside update new controller");
		  List<User> userList=new ArrayList<User>();
		  String view = "admin/UserManagement";
		 
		  System.out.println(user.getUsr_name());
		  ModelAndView model = new ModelAndView();
		  
		  LOGGER.info("Inside updateNewAdmin()- Post");
		  
		 isapAdminUserService.updateProjAdminDetails(user);
		  
	     userList =  isapAdminUserService.getUser();
		 model.addObject("usrlist", userList);
		 model.setViewName(view);
	     return model;
	  }
	 
	 

     @RequestMapping(value="/checkVdcNameAvailability", method = RequestMethod.POST)
		public @ResponseBody int getUsr_name(@RequestParam("usr_name") String usr_name)
        {
    	  int check =0;
    	 
    	 System.out.println("====="+usr_name);
    	    LOGGER.info("inside ajax()-");
   	        
    	    check = isapAdminUserService.getUsr_name(usr_name);
   	      
    	    return check;
    	 
       }
    

	 
	 
}
