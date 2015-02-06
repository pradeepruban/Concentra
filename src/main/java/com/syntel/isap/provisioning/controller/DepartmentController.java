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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.service.IDepartmentService;

/**
 * @author KK5007843
 *
 */
@Controller
public class DepartmentController {
	
	@Autowired
	private IDepartmentService departmentService;
	
	private static final Logger LOGGER = Logger.getLogger(DepartmentController.class.getName());
	
   /**
	 * param 
	 * @param  session 
	 * @return model
	 */
	@RequestMapping(value="/departmentList", method=RequestMethod.GET)
	  public ModelAndView  departmentList(HttpSession session) {
		  List<Department> departments=new ArrayList<Department>();
	      String view="department/departmentList";
		  LOGGER.info("Inside departmentList()- Get");
		  ModelAndView model = new ModelAndView();
		  User user= (User) session.getAttribute("userValue");
		  departments=departmentService.getDepartmentList(user.getCg_id());
		
		  LOGGER.info("user Session Values"+user.getCg_id());
		  List<User> usersList=departmentService.getUsersByCorporate(user);
		  model.addObject("userList", usersList);
	      model.addObject("list", departments);
	      model.setViewName(view);
	    return model;
	  }
	
	/**
	  * param 
	  * @param  session 
	  * @return model
	  */
	 @RequestMapping(value="/addDepartment", method=RequestMethod.GET)
	  public ModelAndView  addDepartmentGet(HttpSession session){
		  List<Department> departments=new ArrayList<Department>();
		  String view="department/departmentList";
		  LOGGER.info("Inside addDepartment()- Get");
		  ModelAndView model = new ModelAndView();
		  User user= (User) session.getAttribute("userValue");
		  departments=departmentService.getDepartmentList(user.getCg_id());
		
		  LOGGER.info("user Session Values"+user.getCg_id());
		  List<User> usersList=departmentService.getUsersByCorporate(user);
		  model.addObject("userList", usersList);
	      model.addObject("list", departments);
	      model.setViewName(view);
		return model;
	  }
	
	/**
	  * param 
	  * @param  @ModelAttribute user and department,session 
	  * @return model
	  */
	
	 @RequestMapping(value="/addDepartment", method=RequestMethod.POST)
	  public ModelAndView  addDepartment( @ModelAttribute("user") User user,
			                              @ModelAttribute("department") Department department,
			                              HttpSession session){
		  List<Department> departments=new ArrayList<Department>();
		  User userSession= (User) session.getAttribute("userValue");
		  user.setCg_id(userSession.getCg_id());
		  LOGGER.info("Inside addDepartment()- Post");
		  ModelAndView model = new ModelAndView();
		  departmentService.addDepartment(department,user);
		  departments=departmentService.getDepartmentList(user.getCg_id());
	      String view="department/departmentList";
	      model.addObject("list", departments);
	      model.setViewName(view);
	    return model;
	  }
	 
	 
	/**
	  * param 
	  * @param  @ModelAttribute user and department,session 
	  * @return model
	  */
	
	 @RequestMapping(value="/editDepartment", method=RequestMethod.POST)
	  public ModelAndView  editDepartment( @ModelAttribute("user") User user,
			                              @ModelAttribute("department") Department department,
			                              HttpSession session){
		  List<Department> departments=new ArrayList<Department>();
		  User userSession= (User) session.getAttribute("userValue");
		  user.setCg_id(userSession.getCg_id());
		  LOGGER.info("Inside editDepartment()- Post");
		  
		  LOGGER.info("Inside editDepartment()- deptId"+department.getDpt_id());
		  ModelAndView model = new ModelAndView();
		  departmentService.editDepartment(department,user);
		  departments=departmentService.getDepartmentList(user.getCg_id());
	      String view="department/departmentList";
	      model.addObject("list", departments);
	      model.setViewName(view);
	    return model;
	  }
	 
	 
	/**
	  * param 
	  * @param  @RequestParam deptId,session 
	  * @return model
	  */ 
	 @RequestMapping(value="/deleteDepartment", method=RequestMethod.GET)
	  public ModelAndView  deleteDepartment( @RequestParam("deptId")Integer deptId,HttpSession session){
		  List<Department> departments=new ArrayList<Department>();
		  User user= (User) session.getAttribute("userValue");
		  LOGGER.info("Inside deleteDepartment()- GET");
		  ModelAndView model = new ModelAndView();
		  departmentService.deleteDepartment(deptId);

		  departments=departmentService.getDepartmentList(user.getCg_id());
	      String view="department/departmentList";
	      model.addObject("list", departments);
	      model.setViewName(view);
	    return model;
	  }
	 
	/**
	  * param 
	  * @param  @PathVariable deptId,session 
	  * @return json
	  */ 
	 @RequestMapping(value="/getDepartment/{deptId}", method = RequestMethod.GET)
		public @ResponseBody Department getDepartmentInJSON(@PathVariable Integer deptId) {
		 Department department = new Department();
		 department =departmentService.getDepartmentById(deptId);	
		 return department;
		}
	 
	/**
	  * param 
	  * @param  @PathVariable deptId,session 
	  * @return json
	  */ 
	 @RequestMapping(value="/getOwners/{userName}", method = RequestMethod.GET)
		public @ResponseBody User getOwnersInJSON(@PathVariable String userName,HttpSession session) {
         User user=new User();
         user=departmentService.getOwnerByName(userName);
		 return user;
	 
		}
	 
	/**
	  * param 
	  * @param  session
	  * @return json
	  */ 
	 @RequestMapping(value="/getDeptUsers", method = RequestMethod.GET)
		public @ResponseBody List<User> getDeptUsersInJSON(HttpSession session) {
		  User user= (User) session.getAttribute("userValue");
		  LOGGER.info("Inside user getDeptUsers Session Values"+user.getCg_id());
		  List<User> usersList=departmentService.getUsersByCorporate(user);
		  return usersList;
		} 
	 
}
