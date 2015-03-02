package com.syntel.isap.provisioning.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.jms.JMSException;
import javax.servlet.http.HttpServletResponse;
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
import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.EnvironmentVDC;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.Identity;
import com.syntel.isap.provisioning.bean.ServiceReqMst;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.constants.OpenStackCredentials;
import com.syntel.isap.provisioning.service.ILaunchService;
import com.syntel.isap.provisioning.soap.SecurityRules;

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
     * @throws Exception 
	   */
	 @RequestMapping(value="/customLaunch", method=RequestMethod.POST)
	  public ModelAndView  customLaunch(HttpServletResponse resp,HttpSession session,@ModelAttribute("customVM") CustomVM customVM,
			  @RequestParam("network")String network,@RequestParam("image")String image, @RequestParam("keypair")String keypair,
			  @RequestParam("flavor")String flavor,@RequestParam("security")String security,			
			  @ModelAttribute("serviceReqMst") ServiceReqMst serviceReqMst) throws Exception {
			  List<CustomVM> customList=new ArrayList<CustomVM>();
			  LOGGER.info("Inside customLaunch()- Post");
			  User userSession= (User) session.getAttribute("userValue");
			  int userId=userSession.getUsr_id();
			  customVM.setUsr_id(userId);
			  ModelAndView model = new ModelAndView();
		      launchService.customLaunch(keypair,image,network,security,flavor,customVM,serviceReqMst);
		      customList=launchService.getCustomList(userId);
		      String view="provision/customUserServiceList";
		      model.addObject("list", customList);
		      model.setViewName(view);	
			  return model;
		  }
	 
	  /**
	   * param 
	   * @param @RequestParam instId 
	   * @return model
       * @throws Exception 
	   */
	 @RequestMapping(value="/terminateInstance", method=RequestMethod.POST)
	  public ModelAndView  terminateInstance(HttpSession session,@RequestParam("instId")String instId) throws Exception {
			  List<CustomVM> customList=new ArrayList<CustomVM>();
			  LOGGER.info("Inside terminateInstance()- POST");
			  
			  launchService.terminateInstance(instId);
			  
			  ModelAndView model = new ModelAndView();
			  User user= (User) session.getAttribute("userValue");
			  customList=launchService.getCustomList(user.getUsr_id());
		      String view="provision/customUserServiceList";
		      model.addObject("list", customList);
		      model.setViewName(view);
			  return model;
		  }
	 
	 
	 
	 /**
	   * param 
	   * @param @RequestParam instId 
	   * @return model
      * @throws Exception 
	   */
	 @RequestMapping(value="/addFloatingIP", method=RequestMethod.POST)
	  public ModelAndView  addFloatingIP(HttpSession session,@RequestParam("instId")String instId) throws Exception {
			  List<CustomVM> customList=new ArrayList<CustomVM>();
			  LOGGER.info("Inside associateFloatingIP()- POST");
			  
			  launchService.addFloatingIP(instId);
			  
			  ModelAndView model = new ModelAndView();
			  User user= (User) session.getAttribute("userValue");
			  customList=launchService.getCustomList(user.getUsr_id());
		      String view="provision/customUserServiceList";
		      model.addObject("list", customList);
		      model.setViewName(view);
			  return model;
		  }
	 
	 /**
	   * param 
	   * @param @RequestParam instId 
	   * @return model
     * @throws Exception 
	   */
	 @RequestMapping(value="/removeFloatingIP", method=RequestMethod.POST)
	  public ModelAndView  removeFloatingIP(HttpSession session,@RequestParam("instId")String instId) throws Exception {
			  List<CustomVM> customList=new ArrayList<CustomVM>();
			  LOGGER.info("Inside removeFloatingIP()- POST");
			  
			  launchService.removeFloatingIP(instId);
			  
			  ModelAndView model = new ModelAndView();
			  User user= (User) session.getAttribute("userValue");
			  customList=launchService.getCustomList(user.getUsr_id());
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
			List<EnvironmentVDC> envVDCList=null;
			
			  LOGGER.info("Inside getTemplateList()- Get");
			  User user=(User)session.getAttribute("userValue");
			  ModelAndView model = new ModelAndView();
			  if(user!=null){
				  envVDCList=launchService.getEnvVdcListById(user.getUsr_id());
			 
			  }
			  
		    /* 
			 List<EnvironmentVDC> envVDCList=launchService.getEnvVdcList();
		      session.setAttribute("envVDCList", envVDCList);*/

			  session.setAttribute("envVDCList", envVDCList);
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
     * @throws Exception 
		*/
	   @RequestMapping(value="/customUserServiceList", method=RequestMethod.GET)
	   public ModelAndView  customUserServiceList(HttpSession session) throws Exception {
			  List<CustomVM> customList=new ArrayList<CustomVM>();
			  LOGGER.info("Inside customUserServiceList()- Get");
			  ModelAndView model = new ModelAndView();
			  User user= (User) session.getAttribute("userValue");
			  if(user!=null){
			  customList=launchService.getCustomList(user.getUsr_id());
			  }
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
		   @RequestMapping(value="/userKeyPairList", method=RequestMethod.GET)
		   public ModelAndView  userKeyPairList(HttpSession session) {
				  List<Identity> keyPairList=new ArrayList<Identity>();
				  LOGGER.info("Inside userKeyPairList()- Get");
				  ModelAndView model = new ModelAndView();
				  User user= (User) session.getAttribute("userValue");
				  if(user!=null){
				  keyPairList=launchService.getKeyPairList(user.getUsr_id());
				  }
			      String view="provision/userKeyPairList";
			      model.addObject("keyPairList", keyPairList);
			      model.setViewName(view);
				return model;
			  }
	   
		   /**
			* param 
			* @param @param name
			* @return pem file
			*/
		   @RequestMapping(value="/addKeyPair", method=RequestMethod.POST)
		   public @ResponseBody void addKeyPair(HttpServletResponse resp,HttpSession session,
				   @RequestParam("name") String name) throws Exception {
				  User user= (User) session.getAttribute("userValue");
				  LOGGER.info("Inside addKeyPair()- POST");
				  String downloadFileName= name+".pem";
				  try {
					   String data=openStackServices.createOpenStackKeyPair(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME,name);
					   OutputStream out = resp.getOutputStream();
					   resp.setContentType("text/plain; charset=utf-8");
					   resp.addHeader("Content-Disposition","attachment; filename=\"" + downloadFileName + "\"");
					   out.write(data.getBytes(Charset.forName("UTF-8")));
					   launchService.addKeyPair(name,data,user.getUsr_id());
					   out.flush();
					   out.close();
					  } catch (IOException e) {
					  }
				  LOGGER.info("Inside addKeyPair()- END");
			  }
		   		
		   /**
			* param 
			* @param @param name
			* @return int 
			*/
		   @RequestMapping(value="/checkKeyPair", method=RequestMethod.POST)
		   public @ResponseBody int checkKeyPair(HttpSession session,@RequestParam("name") String name) {
                  int check=0;
				  LOGGER.info("Inside checkKeyPair()- POST");
				  check= launchService.checkKeyPair(name);
				  return check;
			  }
	   
		   /**
		     * param 
		     * @param @param name
			 * @return pem file
			 */
		   @RequestMapping(value="/downloadkeyPair", method=RequestMethod.GET)
		   public @ResponseBody void downloadkeyPair(HttpServletResponse resp,HttpSession session,
				   @RequestParam("keyId") int keyId) throws Exception {
				  LOGGER.info("Inside downloadkeyPair()- POST");
			      Identity identity=launchService.getIdentity(keyId);
			      String data=identity.getContent();
			      String name=identity.getName();
				  String downloadFileName= name+".pem";
				  try {
					   OutputStream out = resp.getOutputStream();
					   resp.setContentType("text/plain; charset=utf-8");
					   resp.addHeader("Content-Disposition","attachment; filename=\"" + downloadFileName + "\"");
					   out.write(data.getBytes(Charset.forName("UTF-8")));
					   out.flush();
					   out.close();
					  } catch (IOException e) {
					  }
				  LOGGER.info("Inside downloadkeyPair()- END");
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
			  * @param  session
			  * @return json
			  */ 
			 @RequestMapping(value="/getKeyPairs", method = RequestMethod.GET)
				public @ResponseBody List<String> getKeyPairsInJSON(HttpSession session) {
				 LOGGER.info("Inside getKeyPairsInJSON()- Get");
				  User user= (User) session.getAttribute("userValue");
				  return launchService.getKeyPairs(user.getUsr_id());
				} 
		   
			/**
			  * param 
			  * @param  @no param
			  * @return json
			  */ 
			 @RequestMapping(value="/getFlavors", method = RequestMethod.GET)
				public @ResponseBody LinkedHashMap<String, String> getFlavorsInJSON() {
				 LOGGER.info("Inside getFlavorsInJSON()- Get");
				  return openStackServices.getFlavors(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME);
				} 
			 
			 
			 /**
			  * param 
			  * @param  @PathVariable flavorId
			  * @return json
			  */ 
			 @RequestMapping(value="/getFlavorDetails/{flavorId}", method = RequestMethod.GET)
				public @ResponseBody GetOpenstackFlavorResp getFlavorDetailsInJSON(@PathVariable String flavorId) {
				 LOGGER.info("Inside getFlavorDetailsInJSON()- Get");
				 return openStackServices.getFlavorDetails(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME,flavorId);
			 
				}
			 
				/**
				  * param 
				  * @param  @no param
				  * @return json
				  */ 
				 @RequestMapping(value="/getImages", method = RequestMethod.GET)
					public @ResponseBody LinkedHashMap<String, String> getImagesInJSON() {
					  return openStackServices.getImages(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME);
					} 
				 
					/**
				  * param 
				  * @param  @no param
				  * @return json
				  */ 
				 @RequestMapping(value="/getNetworks", method = RequestMethod.GET)
					public @ResponseBody LinkedHashMap<String, String> getNetworksInJSON() {
					  return openStackServices.getNetworks(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME);
					} 
	   
					/**
				  * param 
				  * @param  @no param
				  * @return json
				  */ 
				 @RequestMapping(value="/getSecurityGroups", method = RequestMethod.GET)
					public @ResponseBody LinkedHashMap<String, String> getGroupsInJSON() {
					  return openStackServices.getSecurityGroups(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME);
					} 
				 
				 /**
				  * param 
				  * @param  @PathVariable securityGroupId
				  * @return json
				  */ 
				 @RequestMapping(value="/getSecurityGroupDetails/{securityGroupId}", method = RequestMethod.GET)
					public @ResponseBody List<SecurityRules> getSecurityGroupDetailsInJSON(@PathVariable String securityGroupId) {
					 LOGGER.info("Inside getSecurityGroupDetailsInJSON()- Get");
					 return openStackServices.getSecurityGroupDetails(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME,securityGroupId);
				 
					}
	
       }
