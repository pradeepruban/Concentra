package com.syntel.isap.provisioning.controller;

import java.util.ArrayList;
import java.util.Iterator;
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

import com.syntel.isap.provisioning.bean.CorporateGroups;
//import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.service.ICorporateGroupService;

@Controller
public class CorporateGroupController {

	@Autowired
	private ICorporateGroupService corporateGroupService;
	
	private static final Logger LOGGER = Logger.getLogger(CorporateGroupController.class.getName());
	
	 /**
	 * param 
	 * @param @ModelAttribute("userLogin")		 
	 * @return model
	 */
	
	/**
	 * no params	 
	 * @return Jsp page
	 */
	
	@RequestMapping(value="/corporategroups", method=RequestMethod.GET)
		public ModelAndView corporateGroupLists(HttpSession session) {
			
			
			List<CorporateGroups> corporateGroupList = new ArrayList<CorporateGroups>();
			String view = "admin/corporateGroups";
			LOGGER.info("Inside CorporateGroups GET");
			ModelAndView model = new ModelAndView();
			User user= (User) session.getAttribute("userValue");
			
			corporateGroupList = corporateGroupService.getcorporateGroupList();
			LOGGER.info("user Session Values"+user.getCg_id());
			model.addObject("corpgrplist", corporateGroupList);
			System.out.println("Corporate Groups List details:-" + corporateGroupList);
			model.setViewName(view);
			return model;
	  }
	/**
	 * 
	 * @param corpGroup
	 * @return Jsp page
	 */
	@RequestMapping(value ="/addcorporategroup" ,method=RequestMethod.POST)
		public ModelAndView insertCorporateGroup(@ModelAttribute("corpGroup") CorporateGroups corpGroup,
										@ModelAttribute("user") User user,
										HttpSession session) {
			List<CorporateGroups> corporateGroupList = new ArrayList<CorporateGroups>();
			LOGGER.info("Inside addDepartment()- Post");
			ModelAndView model = new ModelAndView();
			String view = "admin/corporateGroups";
			if(corpGroup!=null)
				corporateGroupService.insertAddCorporateGroupData(corpGroup,user);
			
			corporateGroupList = corporateGroupService.getcorporateGroupList();
			model.addObject("corpgrplist", corporateGroupList);
			model.setViewName(view);
			return  model;
		}
	
	
	
	/**
	 * 
	 * @param corpgrp
	 * @return Jsp page
	 */
	@RequestMapping(value ="/editcorporategroup" ,method=RequestMethod.POST)
	public ModelAndView editData(@ModelAttribute(value="corpgrp") CorporateGroups corpgrp,@ModelAttribute("user") User user) {
		
		
		List<CorporateGroups> corporateGroupList = new ArrayList<CorporateGroups>();
		ModelAndView model = new ModelAndView();
		if (corpgrp != null)
			corporateGroupService.updateCorpGrpData(corpgrp,user);
		
		String view = "admin/corporateGroups";
		corporateGroupList = corporateGroupService.getcorporateGroupList();
		model.addObject("corpgrplist", corporateGroupList);
		model.setViewName(view);
		return  model;
	}
	
	
	/**
	 * 
	 * @param cg_id
	 * @return Jsp page
	 */
	@RequestMapping(value ="/deletecorporategroup1" ,method=RequestMethod.POST)
	public ModelAndView deleteCorporateGroup(@RequestParam int cg_id) {
		
		String view = "admin/corporateGroups";
		List<CorporateGroups> corporateGroupList = new ArrayList<CorporateGroups>();
		ModelAndView model = new ModelAndView();
				
		corporateGroupService.deleteCorporateGroups(cg_id);
				
		corporateGroupList = corporateGroupService.getcorporateGroupList();
		model.addObject("corpgrplist", corporateGroupList);
		model.setViewName(view);
		return  model;
	}
	
	/**
	  * param 
	  * @param  @PathVariable deptId,session 
	  * @return json
	  */ 
	 @RequestMapping(value="/getcorporate/{corpId}", method = RequestMethod.GET)
		public @ResponseBody CorporateGroups getCorporateGroupInJSON(@PathVariable Integer corpId) {
		 
		 System.out.println(" In get corporate method");
		 CorporateGroups corporategrp = new CorporateGroups();
		 corporategrp =corporateGroupService.getCorpGrpByID(corpId);	
		 return corporategrp;
		}
	 
	/**
	  * param 
	  * @param  @PathVariable deptId,session 
	  * @return json
	  */ 
	 @RequestMapping(value="/getOwner/{userName}", method = RequestMethod.GET)
		public @ResponseBody User getOwnersInJSON(@PathVariable String userName,HttpSession session) {
        
		 System.out.println(" In get owner method"); 
		 User user=new User();
         user=corporateGroupService.getOwnerByName(userName);
		 return user;
	 
		}
	 
	/**
	  * param 
	  * @param  session
	  * @return json
	  */ 
	 @RequestMapping(value="/getCorpUsers", method = RequestMethod.GET)
		public @ResponseBody List<User> getDeptUsersInJSON(HttpSession session) {
		 
		 System.out.println(" In get corporate users method");
		 int cgId = 11; // cgId for Corporate pool users is 11 in database
		 List<User> usersList = new ArrayList<User>();
		 //User user= (User) session.getAttribute("userValue");
		 // LOGGER.info("Inside user getDeptUsers Session Values"+user.getCg_id());
		 /* List<User> usersList=corporateGroupService.getUsersByCorporate(user);*/
		 User user=new User();
		 user.setCg_id(cgId);
		 
		usersList =  corporateGroupService.getUsersByCgIdAndRoleID(user);
		// usersList =  corporateGroupService.getUsersByCgId(cgId);
		  return usersList;
		} 
}
