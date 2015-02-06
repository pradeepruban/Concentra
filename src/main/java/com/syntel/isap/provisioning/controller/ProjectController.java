package com.syntel.isap.provisioning.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.dao.IProjectDao;
import com.syntel.isap.provisioning.service.IDepartmentService;
import com.syntel.isap.provisioning.service.IProjectService;


/**
 * @author SK5004144
 *
 */
@Controller
public class ProjectController {
	
		@Autowired
		private IProjectService projectService;
		@Autowired
		private IDepartmentService departmentService;
		
		private static final Logger LOGGER = Logger.getLogger(ProjectController.class.getName());
	
	  
		  

	    /**
		 * param 
		 * @param @ModelAttribute("userLogin")		 
		 * @return model
		 */
	  
			  @RequestMapping(value="/projects", method=RequestMethod.GET)
			  public ModelAndView projectLists(HttpSession session) {
				  LOGGER.info("Inside projectLists()- GET");
				  String view = "department/projects";
				  List<Project> projectList=new ArrayList<Project>();
				  User user = (User) session.getAttribute("userValue");
				  
				  LOGGER.info("Inside ServiceImpl addDepartment"+user.getDpt_id());
				  ModelAndView model = new ModelAndView();
				  projectList =  projectService.getprojectLists(user.getDpt_id());
				  model.addObject("prolist", projectList);
				
				  model.setViewName(view);
			      return model;
			  }
		
			  
			  
			  @RequestMapping(value ="/addProject" ,method=RequestMethod.POST)
				public ModelAndView inserProject(HttpSession session, @ModelAttribute(value="user") User userData,@ModelAttribute(value="project") Project project, HttpServletRequest request
						 ) {
				  
				  LOGGER.info("Inside inserProject()- POST");
				  ModelAndView model = new ModelAndView();
				  List<Project> projectList=new ArrayList<Project>();
				  /*List<Department> departmentList=new ArrayList<Department>();*/
				  
					if (project != null){
						
					  User user = (User) session.getAttribute("userValue");
					  project.setDpt_id(user.getDpt_id());
					  project.setCg_id(user.getCg_id());
					  
					  // userData.setUsr_id(user.getUsr_id());
			         
			           
					
					  LOGGER.info("Project owner name"+project.getOwner());
					  Department department = new Department();
					 department =departmentService.getDepartmentById(user.getDpt_id());
				     //project.setCreated_by(department.getDpt_name());
				     LOGGER.info("Department name for the project"+department.getDpt_name());
					projectService.insertData(project,userData.getUsr_id());	
					projectList =  projectService.getprojectLists(user.getDpt_id());
					String view = "department/projects";
					  model.addObject("prolist", projectList);
					  model.setViewName(view);
					}
					return  model;
				}
			  
			  
			  
			  @RequestMapping(value ="/deleteProject", method = RequestMethod.GET)
				public ModelAndView deleteProject(@RequestParam(value = "proj_id") Integer proj_id,HttpSession session ) 
			  {
				  LOGGER.info("Inside deleteProject()- GET");
				  
				  projectService.deleteProject(proj_id);
				  
                    List<Project> projectList=new ArrayList<Project>();
				  LOGGER.info("Inside deleteProject()- GET");
				  ModelAndView model = new ModelAndView();
				  
				  String view = "department/projects";
				  User user = (User) session.getAttribute("userValue");
					projectList =  projectService.getprojectLists(user.getDpt_id());
				  model.addObject("prolist", projectList);
				
				  model.setViewName(view);
			      return model;
				
				}
		
			  
			  
			  @RequestMapping(value ="/editProjectList",method=RequestMethod.GET)
				public ModelAndView editProject(@RequestParam(value = "proj_id") Integer proj_id, Project project,HttpSession session ) {
					
			
				  LOGGER.info("Inside editProject()- GET");
				  project = projectService.editProject(proj_id);
				  
				
				  
				  System.out.println(project.getProj_name());
				  
				  session.setAttribute("ProjectEditList", project);
				  
				  ModelAndView model = new ModelAndView();
				  
				  String view = "department/editProject";
				 
				  model.setViewName(view);
			      return model;
				
				}
			  
			  
			  @RequestMapping(value="/editProjectDetails",method=RequestMethod.POST)
				public ModelAndView getEditWorkflow(HttpSession session, @ModelAttribute(value="project") Project project)
				{
					
				  
				  LOGGER.info("Inside getEditWorkflow()- GET");
				  
				  System.out.println("inside getEditWorkflow");
				  List<Project> projectList=new ArrayList<Project>();
					
				  System.out.println(project.getProj_desc());
				  System.out.println(project.getProj_id());
				  System.out.println(project.getStatus());
					projectService.updateProject(project);		
					  ModelAndView model = new ModelAndView();
					  String view = "department/projects";
					  User user = (User) session.getAttribute("userValue");
						projectList =  projectService.getprojectLists(user.getDpt_id());
					  model.addObject("prolist", projectList);
					
				
					  model.setViewName(view);
					return model;
				}
				
				
			  
			  /**
				  * param 
				  * @param  @PathVariable deptId,session 
				  * @return json
				  */ 
				 @RequestMapping(value="/getProject/{projId}", method = RequestMethod.GET)
					public @ResponseBody Project getProjectInJSON(@PathVariable Integer projId) {
					 LOGGER.info("Inside getProjectInJSON()- GET");
					 System.out.println("Project Controller inside");
					 Project project = new Project();
					 project =projectService.editProject(projId);
					 
					System.out.println("inside the project projectname"+project.getProj_desc()); 
					 return project;
					}
			  
			  
				 
				 /**
				  * param 
				  * @param  session
				  * @return json
				  */ 
				 @RequestMapping(value="/getDeptUsersList", method = RequestMethod.GET)
					public @ResponseBody List<User> getDeptUsersListInJSON(HttpSession session) {
					  User user= (User) session.getAttribute("userValue");
					  LOGGER.info("Inside user getDeptUsers Session Values"+user.getCg_id());
					  List<User> usersList=projectService.getUsersByCorporate(user);
			       
					  return usersList;
					} 
				
			 
			  
		

}
