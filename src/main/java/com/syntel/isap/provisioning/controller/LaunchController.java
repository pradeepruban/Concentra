package com.syntel.isap.provisioning.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.jms.JMSException;
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
import com.isap.cloudmanager.responses.xsd.GetOpenstackFlavorResp;
import com.isap.cloudmanager.responses.xsd.Rules;
import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.ServiceReqMst;
import com.syntel.isap.provisioning.service.ILaunchService;

/**
 * @author KK5007843
 *
 */

@Controller
public class LaunchController {

	@Autowired
	private ILaunchService launchService;
	
	@Autowired
	private com.syntel.isap.provisioning.soap.OpenStackServices openStackServices;
	
	private static final Logger LOGGER = Logger.getLogger(LaunchController.class.getName());
	
	
    /**
	   * param 
	   * @param @RequestParam network ,image,security,flavor @ModelAttribute serviceReqMst and customVM
	   * @return model
	   * throws JMSException
	   */
	 @RequestMapping(value="/customLaunch", method=RequestMethod.POST)
	  public ModelAndView  customLaunch(@RequestParam("network")String network,@RequestParam("image")String image, 
										@RequestParam("flavor")String flavor,@RequestParam("security")String security,
				             			@ModelAttribute("customVM") CustomVM customVM,
				             			@ModelAttribute("serviceReqMst") ServiceReqMst serviceReqMst) throws JMSException {
			  List<CustomVM> customList=new ArrayList<CustomVM>();
			  LOGGER.info("Inside customLaunch()- Post");
			  ModelAndView model = new ModelAndView();
		      launchService.customLaunch(image,network,security,flavor,customVM,serviceReqMst);
			  customList=launchService.getCustomList();
		      String view="provision/customUserServiceList";
		      model.addObject("list", customList);
		      model.setViewName(view);
			return model;
		  }
	
	  /**
		* param 
		* @param @no params
		* @return model
		*/
		@RequestMapping(value="/customLaunch", method=RequestMethod.GET)
		public ModelAndView  customGetLaunch() {
			  LOGGER.info("Inside customLaunch()- Get");
			  ModelAndView model = new ModelAndView();
		      String view="provision/customTenantUser";
		      model.setViewName(view);
			return model;
		  }
		  
		@RequestMapping(value="/templateList", method=RequestMethod.GET)
		public ModelAndView  getTemplateList(HttpSession session) {
			  LOGGER.info("Inside getTemplateList()- Get");
			  ModelAndView model = new ModelAndView();
			  List<EnvironmentVM> envVMList=launchService.getEnvVmDetails();
		      session.setAttribute("envVMList", envVMList);
		      String view="department/templateListPage";
		      model.setViewName(view);
			return model;
		  }
		
		
		@RequestMapping(value="/addTemplate", method=RequestMethod.GET)
		public ModelAndView addTemplate(HttpSession session) {
			  LOGGER.info("Inside getTemplateList()- Get");
			  ModelAndView model = new ModelAndView();
			  
			  /*List<EnvironmentVM> envVMList=launchService.getEnvVmDetails();
		      session.setAttribute("envVMList", envVMList);*/
			  
		      String view="department/bespokeTemplate";
		      model.setViewName(view);
			return model;
		  }
		
	  /**
		* param 
		* @param @param @no params	
		* @return model
	    */
		@RequestMapping(value="/bespokeTenantUser", method=RequestMethod.GET)
	    public ModelAndView  bespokeTenantUser(HttpSession session) {
			  LOGGER.info("Inside bespokeTenantUser()- Get");
			  ModelAndView model = new ModelAndView();
			  List<EnvironmentVM> envVMList=launchService.getEnvVmDetails();
		      List<EnvironmentVMExt> envVMExtList=launchService.getVMExtParams();
		      session.setAttribute("envVMList", envVMList);
		      session.setAttribute("envVMExtList", envVMExtList);
		      String view="provision/bespokeTenantUser";
		      model.setViewName(view);
			return model;
		  }
		  
		
		@RequestMapping(value="/bespokeLaunch/{envVMid}", method=RequestMethod.GET)
		  public String  bespokeLaunch(HttpSession session,@PathVariable Integer envVMid,@ModelAttribute("envVM") EnvironmentVM envVM,
       			@ModelAttribute("envVMExt") EnvironmentVMExt envVMExt) throws JMSException {
			ModelAndView model = new ModelAndView();
			System.out.println("envVM"+envVM.toString());
			EnvironmentVM envVMDet=launchService.getEnvVmDetailsByID(envVMid);
			List<EnvironmentVMExt> envVMExtDet=launchService.getVMExtParamsByID(envVMid);
			System.out.println("envVM"+envVMDet.toString());
			System.out.println("envVMExtDet"+envVMExtDet.toString());
			
			
		/*	launchService.customLaunch(image,network,security,flavor,customVM,serviceReqMst);*/
			
			
			
			 String view="provision/bespokeTenantUser";
		      model.setViewName(view);
			return "provision/bespokeTenantUser";
		}
		
	  /**
		* param 
		* @param @param @no params	
		* @return model
		*/
		@RequestMapping(value="/stackTenantUser", method=RequestMethod.GET)
	    public ModelAndView  stackTenantUser() {
			  LOGGER.info("Inside stackTenantUser()- Get");
			  ModelAndView model = new ModelAndView();
		      String view="provision/stackTenantUser";
		      model.setViewName(view);
			return model;
		  }
		  
	
      /**
		* param 
		* @param @param @no params	
		* @return model
		*/
	   @RequestMapping(value="/customUserServiceList", method=RequestMethod.GET)
	   public ModelAndView  customUserServiceList() {
			  List<CustomVM> customList=new ArrayList<CustomVM>();
			  LOGGER.info("Inside customUserServiceList()- Get");
			  ModelAndView model = new ModelAndView();
			  customList=launchService.getCustomList();
		      String view="provision/customUserServiceList";
		      model.addObject("list", customList);
		      model.setViewName(view);
			return model;
		  }
	   
	   
	   /**
			* param 
			* @param @param @no params	
			* @return model
			*/
		   @RequestMapping(value="/departmentHome", method=RequestMethod.GET)
		   public ModelAndView  departmentHome() {				
				  ModelAndView model = new ModelAndView();				
			      String view="department/departmentHome";
			      model.setViewName(view);
				return model;
			  }
		   
		   
			/**
			  * param 
			  * @param  @no param
			  * @return json
			  */ 
			 @RequestMapping(value="/getFlavors", method = RequestMethod.GET)
				public @ResponseBody LinkedHashMap<String, String> getFlavorsInJSON() {
				  return openStackServices.getFlavors("192.168.175.153", "pramod_nelavalli@syntelinc.com", "syntel123$", "ISAP-STGMA");
				} 
			 
			 
			 /**
			  * param 
			  * @param  @PathVariable flavorId
			  * @return json
			  */ 
			 @RequestMapping(value="/getFlavorDetails/{flavorId}", method = RequestMethod.GET)
				public @ResponseBody GetOpenstackFlavorResp getFlavorDetailsInJSON(@PathVariable String flavorId) {
				 LOGGER.info("Inside getFlavorDetailsInJSON()- Get");
				 return openStackServices.getFlavorDetails(flavorId, "192.168.175.153", "pramod_nelavalli@syntelinc.com", "syntel123$", "ISAP-STGMA");
			 
				}
			 
				/**
				  * param 
				  * @param  @no param
				  * @return json
				  */ 
				 @RequestMapping(value="/getImages", method = RequestMethod.GET)
					public @ResponseBody LinkedHashMap<String, String> getImagesInJSON() {
					  return openStackServices.getImages("192.168.175.153", "pramod_nelavalli@syntelinc.com", "syntel123$", "ISAP-STGMA");
					} 
				 
					/**
				  * param 
				  * @param  @no param
				  * @return json
				  */ 
				 @RequestMapping(value="/getNetworks", method = RequestMethod.GET)
					public @ResponseBody LinkedHashMap<String, String> getNetworksInJSON() {
					  return openStackServices.getNetworks("192.168.175.153", "pramod_nelavalli@syntelinc.com", "syntel123$", "ISAP-STGMA");
					} 
	   
					/**
				  * param 
				  * @param  @no param
				  * @return json
				  */ 
				 @RequestMapping(value="/getSecurityGroups", method = RequestMethod.GET)
					public @ResponseBody LinkedHashMap<String, String> getGroupsInJSON() {
					  return openStackServices.getSecurityGroups("192.168.175.153", "pramod_nelavalli@syntelinc.com", "syntel123$", "ISAP-STGMA");
					} 
				 
				 /**
				  * param 
				  * @param  @PathVariable securityGroupId
				  * @return json
				  */ 
				 @RequestMapping(value="/getSecurityGroupDetails/{securityGroupId}", method = RequestMethod.GET)
					public @ResponseBody List<Rules> getSecurityGroupDetailsInJSON(@PathVariable String securityGroupId) {
					 LOGGER.info("Inside getSecurityGroupDetailsInJSON()- Get");
					 return openStackServices.getSecurityGroupDetails(securityGroupId, "192.168.175.153", "pramod_nelavalli@syntelinc.com", "syntel123$", "ISAP-STGMA");
				 
					}
				 
				 
				 
	
  }
