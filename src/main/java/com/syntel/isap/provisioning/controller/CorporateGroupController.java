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

import com.isap.core.responses.xsd.GetOpenstackHypervisorDetailsResp;
import com.isap.core.responses.xsd.GetOpenstackQuotaResp;
import com.syntel.isap.provisioning.bean.AvailableVdcQuota;
import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Flag;
//import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcCgQuotaMap;
import com.syntel.isap.provisioning.bean.VdcExtension;
import com.syntel.isap.provisioning.bean.VdcMaster;
import com.syntel.isap.provisioning.bean.VmProvCredential;
import com.syntel.isap.provisioning.service.ICorporateGroupService;
import com.syntel.isap.provisioning.soap.OpenStackServices;

@Controller
public class CorporateGroupController {

	@Autowired
	private ICorporateGroupService corporateGroupService;
	
	@Autowired
	private OpenStackServices openStackServices;
	
	private static final Logger LOGGER = Logger.getLogger(CorporateGroupController.class.getName());
	
	 
	
	/**
	 * 
	 * @param session
	 * @return model
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
	 * @param user
	 * @param session
	 * @return model
	 */
	@RequestMapping(value ="/addcorporategroup" ,method=RequestMethod.POST)
		public ModelAndView insertCorporateGroup(@ModelAttribute("corpGroup") CorporateGroups corpGroup,
										@ModelAttribute("user") User user,
										HttpSession session) {
			List<CorporateGroups> corporateGroupList = new ArrayList<CorporateGroups>();
			LOGGER.info("Inside addCorporate()- Post");
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
	 * @param user
	 * @return model
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
	 * @return model
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
	  *
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
	  *  
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
	  * @param session
	  * @return json
	  */ 
	 @RequestMapping(value="/getCorpUsers", method = RequestMethod.GET)
		public @ResponseBody List<User> getCorpUsersInJSON(HttpSession session) {
		 
		 List<User> usersList = new ArrayList<User>();
		 User user=new User();
		 usersList =  corporateGroupService.getUsersByCgIdAndRoleID(user);
		 return usersList;
		} 
	 /**
	  * 
	  * @param session
	  * @return
	  */
	 @RequestMapping(value="/getAvailableVdcList", method = RequestMethod.GET)
		public @ResponseBody List<VdcMaster> getAvailableVdcList(HttpSession session) {
		 List<VdcMaster> vdcList = new ArrayList<VdcMaster>();
		 vdcList = corporateGroupService.getVdcListFromVdcMaster();
		 
		 return vdcList;
		 
		} 
	
	 /**
	  * 
	  * @param vdcCgQuotaMapBean
	  * @param session
	  * @return
	  */
	 @RequestMapping(value ="/allocateVdcToCorporateGroup" ,method=RequestMethod.GET)
	 public ModelAndView allocateVdcToCorporateGroups(@ModelAttribute VdcCgQuotaMap vdcCgQuotaMapBean,HttpSession session) {
			String view = "admin/corporateGroups";
			List<CorporateGroups> corporateGroupList = new ArrayList<CorporateGroups>();
			ModelAndView model = new ModelAndView();
			User user= (User) session.getAttribute("userValue");
			vdcCgQuotaMapBean.setFree_mem(vdcCgQuotaMapBean.getTotal_mem());
			vdcCgQuotaMapBean.setFree_vcpu(vdcCgQuotaMapBean.getTotal_vcpu());
			vdcCgQuotaMapBean.setFree_disk_storage(vdcCgQuotaMapBean.getTotal_disk_storage());
			vdcCgQuotaMapBean.setCreated_by(user.getUsr_name());
			corporateGroupService.allocateVdcToCorporateGroup(vdcCgQuotaMapBean);
			corporateGroupList = corporateGroupService.getcorporateGroupList();
			model.addObject("corpgrplist", corporateGroupList);
			model.setViewName(view);
			return  model;
		}
	 
	 /**
	  * 
	  * @param session
	  * @param selectedVdcId
	  * @return
	  */
	 @RequestMapping(value="/getVdcDetailsFromService/{selectedVdcId}", method = RequestMethod.GET)
	 public @ResponseBody GetOpenstackHypervisorDetailsResp getVdcDetailsFromServices(HttpSession session,@PathVariable int selectedVdcId) {
		 String ipAddress = "0.0.0.0";
		 String openStackUserName = null;
		 String openStackPassword = null;
		 String openStackTenantName = null;
		 VdcMaster vdcMasterBean = new VdcMaster();
		 //User user= (User) session.getAttribute("userValue");
		 GetOpenstackHypervisorDetailsResp openstackHypervisorDetailsResp = new GetOpenstackHypervisorDetailsResp();
		 VmProvCredential vmProvCredentialbean = new  VmProvCredential();
		 vmProvCredentialbean = corporateGroupService.getVdcCredentialByVdcId(selectedVdcId);
		 openStackUserName = vmProvCredentialbean.getUsername();
		 openStackPassword = vmProvCredentialbean.getPassword();
		 ipAddress = corporateGroupService.getIpAddressControllerEndpointByVdcIdFromVdcExtension(selectedVdcId);
		 openStackTenantName = corporateGroupService.getTenantNameAdminTenantByVdcIdFromVdcExtension(selectedVdcId);
		 openstackHypervisorDetailsResp = openStackServices.getOpenstackHypervisorDetails(ipAddress,openStackUserName,openStackPassword,openStackTenantName);
		 vdcMasterBean.setVdc_id(selectedVdcId);
		 //vdcMasterBean.setModified_by(user.getUsr_name());
		 vdcMasterBean.setTotal_mem(openstackHypervisorDetailsResp.getMemoryMb());
		 vdcMasterBean.setTotal_vcpu(openstackHypervisorDetailsResp.getVcpus());
		 vdcMasterBean.setTotal_disk_storage(openstackHypervisorDetailsResp.getLocalGb());
		 vdcMasterBean.setFree_mem(openstackHypervisorDetailsResp.getFreeRamMb());
		 int free_vcpu = openstackHypervisorDetailsResp.getVcpus() - openstackHypervisorDetailsResp.getVcpusUsed();
		 vdcMasterBean.setFree_vcpu(free_vcpu);
		 vdcMasterBean.setFree_disk_storage(openstackHypervisorDetailsResp.getFreeDiskGb());
		 corporateGroupService.updateVdcDetailInVdcMaster(vdcMasterBean);
		 return openstackHypervisorDetailsResp;
		} 
	 
	 /**
	  * 
	  * @param session
	  * @return
	  */
	 @RequestMapping(value="/getVdcDetailsFromCgQuotaTable/{cgId}/{selectedVdcId}/{totalMem}/{totalVcpu}/{totalDiskStorage}", method = RequestMethod.GET)
	 public @ResponseBody AvailableVdcQuota getVdcDetailsFromCgQuotaTables(HttpSession session,@PathVariable int cgId,@PathVariable int selectedVdcId,@PathVariable int totalMem,@PathVariable int totalVcpu,@PathVariable int totalDiskStorage) {
		 AvailableVdcQuota availableVdcQuota = new AvailableVdcQuota();
		 int availableMem = 0;
		 int availableVcpu = 0;
		 int availableDiskStorage = 0;
		 
		 int totalAllocatedCgMem = 0;
		 int totalAllocatedCgVcpu = 0;
		 int totalAllocatedCgDiskStorage = 0;
		 
		 List<VdcCgQuotaMap> vdcCgQuotaMapBeanList = new ArrayList<VdcCgQuotaMap>();
		 vdcCgQuotaMapBeanList = corporateGroupService.getRowsFromCgQuotaMapTable();
		 		
		 if(!vdcCgQuotaMapBeanList.isEmpty()){
		 totalAllocatedCgMem = corporateGroupService.getSumOfTotalAllocatedMemoryToCg(selectedVdcId);
		 totalAllocatedCgVcpu = corporateGroupService.getSumOfTotalAllocatedVcpuToCg(selectedVdcId);
		 totalAllocatedCgDiskStorage = corporateGroupService.getSumOfTotalAllocatedDiskStorageToCg(selectedVdcId);
		 }
		 
		 availableMem = totalMem - totalAllocatedCgMem;
		 availableVcpu = totalVcpu - totalAllocatedCgVcpu;
		 availableDiskStorage = totalDiskStorage - totalAllocatedCgDiskStorage;
		 		 
		 availableVdcQuota.setAvailableMem(availableMem);
		 availableVdcQuota.setAvailableVcpu(availableVcpu);
		 availableVdcQuota.setAvailableDiskStorage(availableDiskStorage);
		 
		 return availableVdcQuota;
		 
		} 
	 @RequestMapping(value="/checkPreviousdbpk/{cgId}/{vdcId}", method = RequestMethod.GET)
	 public @ResponseBody Flag checkPreviousdbpk(HttpSession session,@PathVariable int cgId,@PathVariable int vdcId) {
		 LOGGER.info("Inside checkPreviousdbpk()- Get");
		 Flag flag = new Flag();
		 flag.setFlag(1);
		 VdcCgQuotaMap vdcCgQuotaMapBean = new VdcCgQuotaMap();
		 vdcCgQuotaMapBean = corporateGroupService.getCgIdVdcIdFromCgQuotaMap(cgId,vdcId);
		 if(vdcCgQuotaMapBean==null){
			 flag.setFlag(0);
		 }
		 else
			 System.out.println("+++vdcCgQuotaMapBean+++++++++++++++++++++++++++++"+vdcCgQuotaMapBean);
		 LOGGER.info("Inside checkPreviousdbpk()- Get");
		 return flag;
	 }
	 /**
	  * 
	  * @param session
	  * @return
	  */
	 @RequestMapping(value="/listCgQuotaDetails", method=RequestMethod.GET)
		public ModelAndView listCgQuotaDetails(HttpSession session) {
			LOGGER.info("Inside CorporateGroupsQuota GET");
			String view = "admin/corporateGroupsQuota";
			ModelAndView model = new ModelAndView();
			List<String> corpGrpNames = new ArrayList<String>();
			User user= (User) session.getAttribute("userValue");
			List<VdcCgQuotaMap> vdcCgQuotaMapBeanList = new ArrayList<VdcCgQuotaMap>();
			vdcCgQuotaMapBeanList = corporateGroupService.getRowsFromCgQuotaMapTable();
			for(VdcCgQuotaMap vdcCgQuotaMapBean :vdcCgQuotaMapBeanList)
			{
				int cgId = vdcCgQuotaMapBean.getCg_id();
				CorporateGroups CorpGrp = corporateGroupService.getCorpGrpByID(cgId);
				vdcCgQuotaMapBean.setCorpbean(CorpGrp);
			}
			model.addObject("vdcCgQuotaMapBeanList",vdcCgQuotaMapBeanList);
			model.addObject("corpGrpNames",corpGrpNames);
			model.setViewName(view);
			return model;
		}
}
