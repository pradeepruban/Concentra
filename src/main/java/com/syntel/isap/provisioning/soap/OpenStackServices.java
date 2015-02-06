package com.syntel.isap.provisioning.soap;


import java.util.LinkedHashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;

import com.isap.cloudmanager.requests.xsd.GetOpenstackFlavorDetailsReq;
import com.isap.cloudmanager.requests.xsd.GetOpenstackSecurityGroupDetailsReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackFlavorsReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackImagesReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackNetworksReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackSecurityGroupsReq;
import com.isap.cloudmanager.responses.xsd.GetOpenstackFlavorResp;
import com.isap.cloudmanager.responses.xsd.Rules;
import com.isap.core.IsapCoreWebservices;
import com.isap.core.IsapCoreWebservicesPortType;
import com.isap.core.responses.xsd.ArrayOfString;
import com.isap.core.responses.xsd.GetOpenstackSecurityGroupDetailsResp;
import com.isap.core.responses.xsd.ListOpenstackFlavors;
import com.isap.core.responses.xsd.ListOpenstackImagesResp;
import com.isap.core.responses.xsd.ListOpenstackNetworksResp;
import com.isap.core.responses.xsd.ListOpenstackSecurityGroupsResp;


/**
 * @author KK5007843
 *
 */

@Service("openStackServices")
public class OpenStackServices {
	
	
	  /**
	   * param 
	   * @param openstack ip, username,password,tenant, 
	   * @return LinkedHashMap<String, String>
	   */
	
	public LinkedHashMap<String, String> getFlavors(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName){
		LinkedHashMap<String, String> flavourList=new LinkedHashMap<String,String>();
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();		
		ListOpenstackFlavorsReq req=new ListOpenstackFlavorsReq();
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opesusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName);
		 
		 req.setIp(ip);	 	
		 req.setOpesusername(opesUsername);	
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);		 
		 ListOpenstackFlavors response=isapCoreWebservicesPortType.listOpenstackFlavors(req);
		 
		 List<ArrayOfString> flavors=response.getFlavors();
		 for(ArrayOfString flavor:flavors){
			 List<String> data=flavor.getArray();
			 flavourList.put(data.get(0), data.get(1));
		 } 
		 return flavourList;
	}

	
	 /**
	   * param 
	   * @param openstack ip, username,password,tenant, flavorid
	   * @return GetOpenstackFlavorResp
	   */
	
	public GetOpenstackFlavorResp getFlavorDetails(String flavorId,String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName){
		LinkedHashMap<String, String> flavourList=new LinkedHashMap<String,String>();
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();		
		GetOpenstackFlavorDetailsReq req=new GetOpenstackFlavorDetailsReq();
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opesusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName);
		 JAXBElement<String> flavor = 
				    new JAXBElement(new QName("http://core.isap.com", "flavor_id"), String.class, flavorId);
		 req.setIp(ip);	 	
		 req.setOpesusername(opesUsername);	
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);
		 req.setFlavorId(flavor);	 
		 GetOpenstackFlavorResp response=isapCoreWebservicesPortType.getOpenstackFlavorDetails(req); 
		 return response;
	}
	
	
	 /**
	   * param 
	   * @param openstack ip, username,password,tenant, 
	   * @return LinkedHashMap<String, String>
	   */
	
	public LinkedHashMap<String, String> getImages(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName){
		LinkedHashMap<String, String> imagesList=new LinkedHashMap<String,String>();
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();		
		ListOpenstackImagesReq req=new ListOpenstackImagesReq();
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opesusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName);
		 
		 req.setIp(ip);	 	
		 req.setOpesusername(opesUsername);	
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);		 
		 ListOpenstackImagesResp response=isapCoreWebservicesPortType.listOpenstackImages(req);
		 
		 List<ArrayOfString> images=response.getImages();
		 for(ArrayOfString image:images){
			 List<String> data=image.getArray();
			 imagesList.put(data.get(0), data.get(1));
		 } 
		 return imagesList;
	}
	
	 /**
	   * param 
	   * @param openstack ip, username,password,tenant, 
	   * @return LinkedHashMap<String, String>
	   */
	
	public LinkedHashMap<String, String> getNetworks(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName){
		LinkedHashMap<String, String> networksList=new LinkedHashMap<String,String>();
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();		
		ListOpenstackNetworksReq req=new ListOpenstackNetworksReq();
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opesusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName);
		 
		 req.setIp(ip);	 	
		 req.setOpesusername(opesUsername);	
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);	
		 
		 ListOpenstackNetworksResp response=isapCoreWebservicesPortType.listOpenstackNetworks(req);
		 
		 List<ArrayOfString> networks=response.getNetworks();
		 for(ArrayOfString network:networks){
			 List<String> data=network.getArray();
			 
			 if(!(data.get(0)==null && data.get(0)==null) ){
				 networksList.put(data.get(0), data.get(1));
			 }
	
		 } 
		 return networksList;
	}
	
	
	 /**
	   * param 
	   * @param openstack ip, username,password,tenant, 
	   * @return LinkedHashMap<String, String>
	   */
	
	public LinkedHashMap<String, String> getSecurityGroups(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName){
		LinkedHashMap<String, String> networksList=new LinkedHashMap<String,String>();
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();		
		ListOpenstackSecurityGroupsReq req=new ListOpenstackSecurityGroupsReq();
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opesusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName);
		 
		 req.setIp(ip);	 	
		 req.setOpesusername(opesUsername);	
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);	
		 
		 ListOpenstackSecurityGroupsResp response=isapCoreWebservicesPortType.listOpenstackSecurityGroups(req);
		 
		 List<ArrayOfString> networks=response.getSecurityGroups();
		 for(ArrayOfString network:networks){
			 List<String> data=network.getArray();
			 networksList.put(data.get(0), data.get(1));
		 } 
		 return networksList;
	}
	
	
	
	 /**
	   * param 
	   * @param openstack ip, username,password,tenant,securityId 
	   * @return List<Rules>
	   */
	
	public List<Rules> getSecurityGroupDetails(String secGpId,String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName){
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();		
		GetOpenstackSecurityGroupDetailsReq req=new GetOpenstackSecurityGroupDetailsReq();
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opesusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName);
		 JAXBElement<String> secId = 
				    new JAXBElement(new QName("http://core.isap.com", "sec_gp_id"), String.class, secGpId);
		 req.setIp(ip);	 	
		 req.setOpesusername(opesUsername);	
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);
		 req.setSecGpId(secId);	 
		 GetOpenstackSecurityGroupDetailsResp response=isapCoreWebservicesPortType.getOpenstackSecurityGroupDetails(req); 
		 return  response.getSecGrpDetails();
	}
	
	

}


