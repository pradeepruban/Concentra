package com.syntel.isap.provisioning.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.syntel.isap.provisioning.bean.Monitor;
import com.syntel.isap.provisioning.bean.Vdc;
import com.syntel.isap.provisioning.bean.SCM;
import com.syntel.isap.provisioning.service.IVdcService;

@Controller
public class VdcController {
	
	@Autowired
	private IVdcService registerService;
	
	private static final Logger LOGGER = Logger.getLogger(VdcController.class.getName());
	
     @RequestMapping("/register")
      public ModelAndView register(HttpSession req){ 	
    	 ModelAndView model=new ModelAndView("admin/registerVdcAdmin");
    	 List<Vdc> vdcList= registerService.getUserOpenstack();
    	 List<SCM> scmList=registerService.getscm();
    	 List<Monitor> monitor=registerService.getMonitorDetails();   
   	     model.addObject("list1",vdcList);	     
   	     model.addObject("monitor",monitor);
   	     model.addObject("scm",scmList);
   	     return model;
     }
     
     @RequestMapping("/insert")
	  public ModelAndView  login(@ModelAttribute("openstack") Vdc openstack) {	
    	 LOGGER.info("Inside insert()- ");	 
    	 ModelAndView model=new ModelAndView("admin/registerVdcAdmin");  
		 int ostack=registerService.setOpenstack(openstack);
         int  scmdetails=registerService.getScmid(openstack.getScm_name());
         openstack.setScm_id(scmdetails);
         int  mondetails=registerService.getMonid(openstack.getMon_name());
         openstack.setMon_id(mondetails);    
         registerService.setMap(openstack);
         List<Vdc> vdcList= registerService.getUserOpenstack();
         List<SCM> scmList=registerService.getscm();
         List<Monitor> monitor=registerService.getMonitorDetails();   
         model.addObject("list1",vdcList);	     
       	 model.addObject("monitor",monitor);
       	 model.addObject("scm",scmList);
       	 return model;
  
  }
     
     @RequestMapping(value="/checkUrlAvailability", method = RequestMethod.GET)
		public @ResponseBody int getKeystone(@ModelAttribute(value = "Instance") Vdc instance,BindingResult result){
    	 String keystone_endpoint=instance.getKeystone_endpoint();
    	 LOGGER.info("inside ajax()-");
    	 int ostack=registerService.getKeystone(keystone_endpoint);
    	 return ostack; 
  }
       
     @RequestMapping(value="/checkSubnetAddressAvailability", method = RequestMethod.GET)
		public @ResponseBody int getSubnetAddress(@ModelAttribute(value = "Instance") Vdc instance,BindingResult result) {
            String subnet_address=instance.getSubnet_address();
    	    LOGGER.info("inside ajax()-");
    	    int ostack=registerService.getSubnetAddress(subnet_address); 	       	 
    	    return ostack;  	 
       }   
     
     @RequestMapping(value="/getOpenstack/{vdc_id}", method = RequestMethod.GET)
		public @ResponseBody Vdc getProjectInJSON(@PathVariable Integer vdc_id) {
		 LOGGER.info("Inside getProjectInJSON()- GET");	    
		 Vdc project = new Vdc();
		 project =registerService.getDetails(vdc_id);
		 return project;
		}
 
     @RequestMapping("/edit")
     public ModelAndView  UpdateOpenstack(@ModelAttribute("openstack") Vdc openstack) {	
    	 ModelAndView model=new ModelAndView("admin/registerVdcAdmin"); 
    	 int update=registerService.updateOpenstack(openstack);
    	 System.out.println(update);
    	 List<Vdc> vdcList= registerService.getUserOpenstack();
    	 List<SCM> scmList=registerService.getscm();
    	 List<Monitor> monitor=registerService.getMonitorDetails();   
   	     model.addObject("list1",vdcList);	     
   	     model.addObject("monitor",monitor);
   	     model.addObject("scm",scmList);
   	     return model;
    	 
     }
     
     
     @RequestMapping(value ="/deleteOpenstack", method = RequestMethod.GET)
		public ModelAndView deleteOpenstack(@RequestParam(value = "vdc_id") Integer vdc_id,HttpSession session ) 
	  {
		  LOGGER.info("Inside deleteProject()- GET");
		  
		  registerService.deleteOpenstack(vdc_id);
		  LOGGER.info("Inside deleteProject()- GET");
		  ModelAndView model = new ModelAndView();
		  String view = "admin/registerVdcAdmin";
		  List<Vdc> vdcList= registerService.getUserOpenstack();
	    	 List<SCM> scmList=registerService.getscm();
	    	 List<Monitor> monitor=registerService.getMonitorDetails();   
	   	     model.addObject("list1",vdcList);	     
	   	     model.addObject("monitor",monitor);
	   	     model.addObject("scm",scmList);
		  model.setViewName(view);
	      return model;
		
		}
     
     @RequestMapping("/addpuppet")
     public ModelAndView  addpuppet(@ModelAttribute("scm") SCM scm) {
    	 
    	 LOGGER.info("Inside insert()- ");
		  ModelAndView model=new ModelAndView("admin/registerVdcAdmin");
		  int i=registerService.setscmpuppet(scm);
		  System.out.println(i);
		  
		  List<Vdc> vdcList= registerService.getUserOpenstack();
	    	 List<SCM> scmList=registerService.getscm();
	    	 List<Monitor> monitor=registerService.getMonitorDetails();   
	   	     model.addObject("list1",vdcList);	     
	   	     model.addObject("monitor",monitor);
	   	     model.addObject("scm",scmList);
	   	     return model;
     }
     
    @RequestMapping("/addchef")
     public ModelAndView  addchef(@ModelAttribute("scm") SCM scm) {
    	 
    	 LOGGER.info("Inside insert()- ");
		  ModelAndView model=new ModelAndView("admin/registerVdcAdmin");
		  int i=registerService.setscmchef(scm);
		  System.out.println(i);
		  List<Vdc> vdcList= registerService.getUserOpenstack();
	    	 List<SCM> scmList=registerService.getscm();
	    	 List<Monitor> monitor=registerService.getMonitorDetails();   
	   	     model.addObject("list1",vdcList);	     
	   	     model.addObject("monitor",monitor);
	   	     model.addObject("scm",scmList);
	   	     return model;
     }
     
   

    @RequestMapping(value="/editscm/{scmid}", method = RequestMethod.GET)
	public @ResponseBody SCM getscmInJSON(@PathVariable Integer scmid) {
	 LOGGER.info("Inside getscmInJSON()- GET");
	
	 SCM scmedit=new SCM();
	 scmedit=registerService.editScm(scmid);
	 return scmedit;
	}
     
    @RequestMapping(value="/updateScm",method=RequestMethod.POST)
	public ModelAndView getEditScmDetails(HttpSession session, @RequestParam int scm_id,@RequestParam String scm_endpoint,@RequestParam String host_name,@RequestParam String scm_name,@RequestParam String admin_user,@RequestParam String admin_pass)
	{
    	
		SCM scm=new SCM();
		scm.setAdmin_pass(admin_pass);
		scm.setAdmin_user(admin_user);
		scm.setScm_name(scm_name);
		scm.setScm_id(scm_id);
		scm.setHost_name(host_name);
		scm.setScm_endpoint(scm_endpoint);

	      System.out.println("inside getEditWorkflow1"+scm.getScm_id()+":"+scm.getScm_endpoint()+":"+scm.getAdmin_pass()+":"+scm.getAdmin_user());
	 
	  	  //registerService.updateScm(scm);		

	  	  registerService.update(scm);
	  	  
		  ModelAndView model = new ModelAndView();
		  String view = "admin/registerVdcAdmin";
		  List<Vdc> vdcList= registerService.getUserOpenstack();
	    	 List<SCM> scmList=registerService.getscm();
	    	 List<Monitor> monitor=registerService.getMonitorDetails();   
	   	     model.addObject("list1",vdcList);	     
	   	     model.addObject("monitor",monitor);
	   	     model.addObject("scm",scmList);
	   	 
		    model.setViewName(view);
		  return model;
	}
    
    
    @RequestMapping(value ="/deleteScm", method = RequestMethod.GET)
	public ModelAndView deleteProject(@RequestParam(value = "scm_id") Integer scm_id,HttpSession session ) 
    {
    	registerService.deleteProject(scm_id);
	  
       
	  LOGGER.info("Inside deleteProject()- GET");
	  ModelAndView model = new ModelAndView();
	  
	  String view = "admin/registerVdcAdmin";
	  List<Vdc> vdcList= registerService.getUserOpenstack();
 	 List<SCM> scmList=registerService.getscm();
 	 List<Monitor> monitor=registerService.getMonitorDetails();   
	     model.addObject("list1",vdcList);	     
	     model.addObject("monitor",monitor);
	     model.addObject("scm",scmList);
		 model.setViewName(view);
	 
      return model;
	
	}
    
    @RequestMapping(value="/checkEndpointAvailabilty", method = RequestMethod.GET)
  	public @ResponseBody int getEndpoint(@ModelAttribute(value = "Instance") SCM instance,BindingResult result)
      {
  	 String scm_endpoint=instance.getScm_endpoint();
  	 
  	 System.out.println("====="+scm_endpoint);
  	    LOGGER.info("inside ajax()-");
  	        
  	  int ostack=registerService.getScmEndpoint(scm_endpoint);
  	      
  	    System.out.println(ostack);
  	 
  	    return ostack;
  	 
     }
       
    
    
    @RequestMapping(value ="/deleteMonitor", method = RequestMethod.GET)
  	public ModelAndView deleteMonitor(@RequestParam(value = "mon_id") Integer mon_id,HttpSession session ) 
      {
      	registerService.deleteMonitor(mon_id);
  	 
  	  LOGGER.info("Inside deleteProject()- GET");
  	  ModelAndView model = new ModelAndView();
  	  
  	  String view = "admin/registerVdcAdmin";
  	  
  	 List<Vdc> vdcList= registerService.getUserOpenstack();
	 List<SCM> scmList=registerService.getscm();
	 List<Monitor> monitor=registerService.getMonitorDetails();   
	     model.addObject("list1",vdcList);	     
	     model.addObject("monitor",monitor);
	     model.addObject("scm",scmList); 
  	    model.setViewName(view);
 
        return model;
  	
  	}
       
      @RequestMapping(value="/editmon/{mon_id}", method = RequestMethod.GET)
     	public @ResponseBody Monitor getmonInJSON(@PathVariable Integer mon_id) {
     	 LOGGER.info("Inside getmonInJSON()- GET");
     	 System.out.println("monitor"+mon_id);
     	 Monitor monedit=new Monitor();
     	 monedit=registerService.editMon(mon_id);
     	 System.out.println("list"+monedit);
     	 System.out.println(monedit.getAdmin_pass() +monedit.getAdmin_user()+monedit.getMon_name());
     	 return monedit;
     	}
          
      
      @RequestMapping(value="/updateMonitor")
     	public ModelAndView getEditMonitorDetails(HttpSession session, @ModelAttribute("monitor") Monitor monitor)
     	{
         	
     		System.out.println("========="+"inside updatemonitor");
          System.out.println(monitor.getMon_name());
     	  	  registerService.updateMonitor(monitor);
     	  	  
     		  ModelAndView model = new ModelAndView();
     		  String view = "admin/registerVdcAdmin";
     		 List<Vdc> vdcList= registerService.getUserOpenstack();
        	 List<SCM> scmList=registerService.getscm();
        	 List<Monitor> monitor1=registerService.getMonitorDetails();   
       	     model.addObject("list1",vdcList);	     
       	     model.addObject("monitor",monitor1);
       	     model.addObject("scm",scmList);
       	  
     		 
     		  model.setViewName(view);
     		  return model;
     	}
       
       
      @RequestMapping("/addnagios")
      public ModelAndView  addnagios(@ModelAttribute("monitor") Monitor monitor) {
     	 
     	 LOGGER.info("Inside insert()- ");
  		  ModelAndView model=new ModelAndView("admin/registerVdcAdmin");
  		  int i=registerService.setMonNagio(monitor);
  		  System.out.println(i);
  		  
  		 List<Vdc> vdcList= registerService.getUserOpenstack();
    	 List<SCM> scmList=registerService.getscm();
    	 List<Monitor> monitor1=registerService.getMonitorDetails();   
   	     model.addObject("list1",vdcList);	     
   	     model.addObject("monitor",monitor1);
   	     model.addObject("scm",scmList);
   	     return model;
   	  

      }

       
       
      @RequestMapping("/addzabbix")
      public ModelAndView  addzabbix(@ModelAttribute("monitor") Monitor monitor) {
     	 
     	 LOGGER.info("Inside insert()- ");
  		  ModelAndView model=new ModelAndView("admin/registerVdcAdmin");
  		  int i=registerService.setMonZabbix(monitor);
  		  System.out.println(i);
  		  
  		 List<Vdc> vdcList= registerService.getUserOpenstack();
    	 List<SCM> scmList=registerService.getscm();
    	 List<Monitor> monitor1=registerService.getMonitorDetails();   
   	     model.addObject("list1",vdcList);	     
   	     model.addObject("monitor",monitor1);
   	     model.addObject("scm",scmList);
   	     return model;

      }
       
       
      @RequestMapping(value="/checkMonitorEndpointAvailabilty", method = RequestMethod.GET)
    	public @ResponseBody int getMonitorEndpoint(@ModelAttribute(value = "Instance") Monitor instance,BindingResult result)
        {
    	 String mon_endpoint=instance.getMon_endpoint();
 
    	 System.out.println("====="+mon_endpoint);
    	   
    	 LOGGER.info("inside ajax()-");
    	        
    	 int ostack=registerService.getMonEndpoint(mon_endpoint);
    	      
    	    System.out.println(ostack);
    	 
    	    return ostack;
    	 
       }
      
      @RequestMapping(value="/checkControllerEndpointAvailability", method = RequestMethod.GET)
  	public @ResponseBody int getControllerEndpoint(@ModelAttribute(value = "Instance") Vdc instance,BindingResult result)
      {
  	 String controller_endpoint=instance.getController_endpoint();
  	 
  	 System.out.println("====="+controller_endpoint);
  	   
  	 LOGGER.info("inside ajax()-");
  	        
  	int ostack=registerService.getControllerEndpoint(controller_endpoint);
  	      
  	    System.out.println(ostack);
  	 
  	    return ostack;
  	 
     }
      
      @RequestMapping(value="/checkVdcNameAvailability", method = RequestMethod.GET)
    	public @ResponseBody int getVdcName(@ModelAttribute(value = "Instance") Vdc instance,BindingResult result)
        {
    	 String vdc_name=instance.getVdc_name();
    	
    	 System.out.println("====="+vdc_name);
    	   
    	 LOGGER.info("inside ajax()-");
    	        
    	   int ostack=registerService.getVdcName(vdc_name);
    	      
    	    System.out.println(ostack);
    	 
    	    return ostack;
    	 
       }
      @RequestMapping(value="/checkScmNameAvailability", method = RequestMethod.GET)
  	public @ResponseBody int getScmName(@ModelAttribute(value = "Instance") SCM Instance,BindingResult result)
      {
  	 String scm_name=Instance.getScm_name();
  	
  	 System.out.println("====="+scm_name);
  	   
  	 LOGGER.info("inside ajax()-");
  	        
  	    int ostack=registerService.getScmName(scm_name);
  	      
  	    System.out.println(ostack);
  	 
  	    return ostack;
  	 
     }
      
      @RequestMapping(value="/checkMonNameAvailability", method = RequestMethod.GET)
    	public @ResponseBody int getMonName(@ModelAttribute(value = "Instance") Monitor instance,BindingResult result)
        {
    	 String mon_name=instance.getMon_name();
    	
    	 System.out.println("====="+mon_name);
    	   
    	 LOGGER.info("inside ajax()-");
    	        
    	 int ostack=registerService.getMonName(mon_name);
    	      
    	    System.out.println(ostack);
    	 
    	    return ostack;
    	 
       }
      
      @RequestMapping(value="/testConnection", method = RequestMethod.POST)
  	public @ResponseBody int testConnection(@RequestParam("subnet_address")String subnet_address,@RequestParam("tenant")String tenant
  			                      ,@RequestParam("user")String user,@RequestParam("password")String password) {
  	 LOGGER.info("inside ajax() testConnection-"+subnet_address);      
      int response=0;
      response=registerService.checkConnection(subnet_address,tenant,user,password);
  	  return response;
     }
    
      
      @RequestMapping(value="/getUsage", method = RequestMethod.POST)
  	public @ResponseBody int getUsage(@RequestParam("vdcId")int vdcId) {
  	 LOGGER.info("inside ajax() getUsage-"+vdcId);      
      int response=0;
      registerService.getUsage(vdcId);
  	  return response;
     }
    
      
      
   
}