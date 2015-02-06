package com.syntel.isap.provisioning.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.syntel.isap.provisioning.bean.Project;


/**
 * @author SK5004144
 *
 */

@Controller
public class DashboardController {
	
	private static final Logger LOGGER = Logger.getLogger(DashboardController.class.getName());

	  
	  @RequestMapping(value ="/dashboardDeparment", method = RequestMethod.GET)
		public ModelAndView inserData(@ModelAttribute Project project) {
		  ModelAndView model = new ModelAndView();
			
			String view = "department/dashboardDepartment";
			  model.setViewName(view);
			return  model;
		}
	  
	
	
}
