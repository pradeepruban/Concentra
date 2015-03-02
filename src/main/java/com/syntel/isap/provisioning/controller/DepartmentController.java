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

import com.isap.core.responses.xsd.GetOpenstackQuotaResp;
import com.syntel.isap.provisioning.bean.AvailableVdcQuota;
import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcCgQuotaMap;
import com.syntel.isap.provisioning.bean.VdcDeptQuotaMap;
import com.syntel.isap.provisioning.bean.VmProvCredential;
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
		   List<User> usersList=null;
		  List<Department> departments=new ArrayList<Department>();
	      String view="department/departmentList";
		  LOGGER.info("Inside departmentList()- Get");
		  ModelAndView model = new ModelAndView();
		  User user= (User) session.getAttribute("userValue");
		 
		  if(user!=null){
		  departments=departmentService.getDepartmentList(user.getCg_id());
		  LOGGER.info("user Session Values"+user.getCg_id());
		   usersList=departmentService.getUsersByCorporate(user);
		  }
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
	  public ModelAndView  addDepartment( @ModelAttribute("user") User user, HttpSession session,
			                              @ModelAttribute("department") Department department){
		  List<Department> departments=new ArrayList<Department>();
		  User userSession= (User) session.getAttribute("userValue");
		  user.setCg_id(userSession.getCg_id());
		  LOGGER.info("Inside addDepartment()- Post");
		  ModelAndView model = new ModelAndView();
		  String corporateAdminName = userSession.getUsr_name();
		  departmentService.addDepartment(department,user,corporateAdminName);
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
	  public ModelAndView  editDepartment( @ModelAttribute("user") User user,HttpSession session,
			                              @ModelAttribute("department") Department department){
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
		 LOGGER.info("Inside getDepartmentInJSON()- GET");
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
		 LOGGER.info("Inside getOwnersInJSON()- GET");
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
	 
	 
	 @RequestMapping(value="/getVdcDetailsFromCorporateTable/{selectedVdcId}/{cgId}", method = RequestMethod.GET)
	 public @ResponseBody VdcCgQuotaMap getVdcDetailsFromServices(HttpSession session,@PathVariable int selectedVdcId,@PathVariable int cgId) {
		
		 VdcCgQuotaMap vdcCgQuotaMap = new  VdcCgQuotaMap();
	
		 vdcCgQuotaMap = departmentService.vdcCgQuotaByVdcIDandcgID(selectedVdcId,cgId);
		
		 LOGGER.info("----------------Inside user getVdcDetailsFromCorporateTable Values-------------------"+vdcCgQuotaMap.getFree_disk_storage());
		 LOGGER.info("----------------Inside user getVdcDetailsFromCorporateTable Values-------------------"+vdcCgQuotaMap.getFree_mem());
		 LOGGER.info("----------------Inside user getVdcDetailsFromCorporateTable Values-------------------"+vdcCgQuotaMap.getFree_vcpu());
		 return vdcCgQuotaMap;
		} 
	 


		 @RequestMapping(value ="/allocateVdcToDepartmentGroup" ,method=RequestMethod.GET)
		 public ModelAndView allocateVdcToCorporateGroups(@ModelAttribute VdcDeptQuotaMap vdcDeptQuotaMapBean,HttpSession session) {
			 List<Department> departments=new ArrayList<Department>();
			 String view="department/departmentList";
			  User user= (User) session.getAttribute("userValue");
			  LOGGER.info("Inside deleteDepartment()- GET");
			  ModelAndView model = new ModelAndView();
			  
			  
			 
			  vdcDeptQuotaMapBean.setFree_mem(vdcDeptQuotaMapBean.getTotal_mem());
			  vdcDeptQuotaMapBean.setFree_vcpu(vdcDeptQuotaMapBean.getTotal_vcpu());
			  vdcDeptQuotaMapBean.setFree_disk_storage(vdcDeptQuotaMapBean.getTotal_disk_storage());
			  vdcDeptQuotaMapBean.setCreated_by(user.getUsr_name());
			  
			 
				 
				 int cgID = user.getCg_id();
			  
			  departmentService.allocateVdcToDepaertmentGroup(vdcDeptQuotaMapBean,cgID);
			  
			  
			  
			  
			  departments=departmentService.getDepartmentList(user.getCg_id());
		      
		      model.addObject("list", departments);
		      model.setViewName(view);
		      return model;

				
			}
		 
		 
		/*  @RequestMapping(value="/checkTotalCgvcpuAvailability", method = RequestMethod.POST)
			public @ResponseBody VdcDeptQuotaMap getAvailableVdcList(@RequestParam("total_cg_vcpu") String total_cg_vcpu,HttpSession session)
	        {
			  User user= (User) session.getAttribute("userValue");
			  
			 int cg_id = user.getCg_id();
			  
	    	  int check =0;
	    	 
	    	  
	    	  
	    	  
	    	 //System.out.println("====="+usr_name);
	    	    LOGGER.info("inside ajax()-");
	   	        
	    	    check = departmentService.getAvaliableVcpuAllocated(total_cg_vcpu,cg_id);
	   	      
	    	    return check;
	    	 
	       }*/
		  
		  
		  @RequestMapping(value="/checkTotalCgvcpuAvailability", method = RequestMethod.POST)
			public @ResponseBody int getAllocatedVDCforDpt(@RequestParam("total_cg_vcpu") String total_cg_vcpu,HttpSession session)
	        {
			  User user= (User) session.getAttribute("userValue");
			  
			 int cg_id = user.getCg_id();
			  
	    	  int check =0;
	    	 
	    	  
	    	  
	    	  
	    	 //System.out.println("====="+usr_name);
	    	    LOGGER.info("inside ajax()-");
	   	        
	    	    check = departmentService.getAvaliableVcpuAllocated(total_cg_vcpu,cg_id);
	   	      
	    	    return check;
	    	 
	       }
		  
		
		     @RequestMapping(value="/checkVdcAllocates", method = RequestMethod.POST)
				public @ResponseBody int getVDCdetails(@RequestParam("selectedVdcId") int selectedVdcId,@RequestParam("dptId")  int dptId)
		        {
		    	 
		    	 LOGGER.info("inside ajax() of checkVDCAllocated-----------------------------------------");
		    	  int check =0;
		    	 
		    	// System.out.println("====="+usr_name);
		    	    LOGGER.info("inside ajax()--------------------");
		   	        
		    	    
		    	   // int selectedVdcIdint = Integer.parseInt(selectedVdcId);
		    	   // int  selecteddptID  = Integer.parseInt(dptId);
		    	    check = departmentService.getVdcdetails(selectedVdcId,dptId);
		   	      
		    	    return check;
		    	 
		       }
		  
		  
		 /* 
		  @RequestMapping(value="/checkAllocatedVDCforDpt", method = RequestMethod.POST)
			public @ResponseBody VdcDeptQuotaMap getTotalCgvcpuAl(@RequestParam("total_cg_vcpu") String total_cg_vcpu,HttpSession session)
	        {
			  VdcCgQuotaMap vdcCgQuotaMap = new  VdcCgQuotaMap();
			  vdcCgQuotaMap = departmentService.getVdcDetailsByDptID();
	    	    return vdcCgQuotaMap;
	    	 
	       }*/
	 
	 
	 
}
