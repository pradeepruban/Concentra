package com.syntel.isap.provisioning.soap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;

import com.isap.cloudmanager.requests.xsd.AddOpenstackFloatingIpReq;
import com.isap.cloudmanager.requests.xsd.GetOpenstackFlavorDetailsReq;
import com.isap.cloudmanager.requests.xsd.GetOpenstackImageDetailsReq;
import com.isap.cloudmanager.requests.xsd.GetOpenstackSecurityGroupDetailsReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackFlavorsReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackImagesReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackNetworksReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackSecurityGroupsReq;
import com.isap.cloudmanager.requests.xsd.RemoveOpenstackFloatingIpReq;
import com.isap.cloudmanager.responses.xsd.AddOpenstackFloatingIpResp;
import com.isap.cloudmanager.responses.xsd.GetOpenstackFlavorResp;
import com.isap.cloudmanager.responses.xsd.GetOpenstackImageDetailsResp;
import com.isap.cloudmanager.responses.xsd.OpenstackBasicResp;
import com.isap.cloudmanager.responses.xsd.RemoveOpenstackFloatingIpResp;
import com.isap.cloudmanager.responses.xsd.Rules;
import com.isap.core.IsapCoreWebservices;
import com.isap.core.IsapCoreWebservicesPortType;
import com.isap.core.requests.xsd.CreateOpenstackKeypairReq;
import com.isap.core.requests.xsd.CreateOpenstacktenantReq;
import com.isap.core.requests.xsd.GetIsapCloudAuthenticationRequest;
import com.isap.core.requests.xsd.GetOpenstackHypervisorDetailsReq;
import com.isap.core.requests.xsd.GetOpenstackQuotaReq;
import com.isap.core.requests.xsd.TerminateOpensInstanceReq;
import com.isap.core.responses.xsd.ArrayOfString;
import com.isap.core.responses.xsd.CreateOpenstackTenantResp;
import com.isap.core.responses.xsd.CreateOpenstackkeypairResp;
import com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse;
import com.isap.core.responses.xsd.GetOpenstackHypervisorDetailsResp;
import com.isap.core.responses.xsd.GetOpenstackQuotaResp;
import com.isap.core.responses.xsd.GetOpenstackSecurityGroupDetailsResp;
import com.isap.core.responses.xsd.ListOpenstackFlavorsResp;
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
	   * @param openstack ip, username,password,tenant,cloudType
	   * @return int value either 1 or 0
	   */
	public int getIsapCloudAuthentication(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName,String cloudType){
		
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();		
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();				
		GetIsapCloudAuthenticationRequest req= new GetIsapCloudAuthenticationRequest();		
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "opsIp"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opsUsername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opsPassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opsTenantName"), String.class, openStackTenantName);
		 JAXBElement<String> type = 
				    new JAXBElement(new QName("http://core.isap.com", "cloudType"), String.class, cloudType);
		 req.setOpsIp(ip);	 
		 req.setCloudType(type);
		 req.setOpsUsername(opesUsername);
		 req.setOpsPassword(opsPassword);
		 req.setOpsTenantName(opsTenantName);	
		 GetIsapCloudAuthenticationResponse response=isapCoreWebservicesPortType.getIsapCloudAuthentication(req); 
		 return  response.getIsapRetunCode();
	}
	
	 /**
	   * param 
	   * @param openstack ip, username,password,tenant,Pool,openstackInstanceId
	   * @return AddOpenstackFloatingIpResp obj with ReturnCode nd floatingIP
	   */
	public AddOpenstackFloatingIpResp addFloatinIp(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName,String pool,String instanceId){
		
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();				
		AddOpenstackFloatingIpReq req= new AddOpenstackFloatingIpReq();		
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opsusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName);
		 JAXBElement<String> poolName = 
				    new JAXBElement(new QName("http://core.isap.com", "pool"), String.class, pool);
		 JAXBElement<String> serverId = 
				    new JAXBElement(new QName("http://core.isap.com", "serverId"), String.class, instanceId);
		 req.setIp(ip);	 	
		 req.setOpsusername(opesUsername);
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);
		 req.setPool(poolName);
		 req.setServerId(serverId);
		 AddOpenstackFloatingIpResp response=isapCoreWebservicesPortType.addOpenstackFloatingIp(req); 
		 return  response;
	}
	
	/**
	   * param 
	   * @param openstack ip, username,password,tenant,openStackInstanceId
	   * @return int value either 1 or 0
	   */
	public int removeFloatinIp(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName,String pool,String instanceId){
		
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();				
		RemoveOpenstackFloatingIpReq req= new RemoveOpenstackFloatingIpReq();	
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ops_ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "ops_username"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "ops_password"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "ops_tenant_name"), String.class, openStackTenantName);
		 JAXBElement<String> serverId = 
				    new JAXBElement(new QName("http://core.isap.com", "inst_id"), String.class, instanceId);
		 req.setInstId(serverId);
		 req.setOpsIp(ip);	 	
		 req.setOpsUsername(opesUsername);
		 req.setOpsPassword(opsPassword);
		 req.setOpsTenantName(opsTenantName);
		 req.setInstId(serverId);
		 RemoveOpenstackFloatingIpResp response=isapCoreWebservicesPortType.removeOpenstackFloatingIpResp(req); 
		 return  response.getReturnCode();
	}
	
	
	
	 /**
	   * param 
	   * @param openstack ip, username,password,tenant,keyName 
	   * @return privateKey for accessing VM through putty
	   */
	
	public String createOpenStackKeyPair(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName,String keyName){
		
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();		
		CreateOpenstackKeypairReq req=new CreateOpenstackKeypairReq();
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opesusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName);
		 JAXBElement<String> key = 
				    new JAXBElement(new QName("http://core.isap.com", "keypair_name"), String.class, keyName);
		 req.setIp(ip);	 	
		 req.setOpesusername(opesUsername);	
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);
		 req.setKeypairName(key);	 
		 CreateOpenstackkeypairResp response=isapCoreWebservicesPortType.createOpenstackKeypair(req); 
		 return  response.getPublicKey().getValue();
	}
	
	 /**
	   * param 
	   * @param openstack ip, username,password,tenant,tenantName 
	   * @return CreateOpenstackTenantResp object 
	   */
	
	public CreateOpenstackTenantResp createOpenstackTenant(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName,String tenantName){
		
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();		
		CreateOpenstacktenantReq req=new CreateOpenstacktenantReq();
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opsusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName);
		 JAXBElement<String> tenant = 
				    new JAXBElement(new QName("http://core.isap.com", "tenant_name"), String.class, tenantName);
		 req.setIp(ip);	 	
		 req.setOpsusername(opesUsername);	
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);
		 req.setTenantName(tenant);	 
		 CreateOpenstackTenantResp response=isapCoreWebservicesPortType.createOpenstackTenant(req); 
		 return  response;
	}
	
	/**
	   * param 
	   * @param openstack ip, username,password,tenant
	   * @return GetOpenstackQuotaResp object
	   */
	public GetOpenstackQuotaResp getOpenstackQuotaDetails(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName){
		
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();				
		GetOpenstackQuotaReq req= new GetOpenstackQuotaReq();	
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
		 GetOpenstackQuotaResp response=isapCoreWebservicesPortType.getOpenstackQuotaDetails(req); 
		 return  response;
	}
	
	
	/**
	   * param 
	   * @param openstack ip, username,password,tenant
	   * @return GetOpenstackHypervisorDetailsResp object
	   */
	public GetOpenstackHypervisorDetailsResp getOpenstackHypervisorDetails(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName){
		
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();				
		GetOpenstackHypervisorDetailsReq req= new GetOpenstackHypervisorDetailsReq();	
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
		 GetOpenstackHypervisorDetailsResp response=isapCoreWebservicesPortType.getHypervisorDetails(req); 
		 return  response;
	}
	
	
	  /**
	   * param 
	   * @param openstack ip, username,password,tenant
	   * @return LinkedHashMap<String, String> key value pairs
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
		 ListOpenstackFlavorsResp response=isapCoreWebservicesPortType.listOpenstackFlavors(req);		 
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
	   * @return GetOpenstackFlavorResp object
	   */
	
	public GetOpenstackFlavorResp getFlavorDetails(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName,String flavorId){
		
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
	   * @param openstack ip, username,password,tenant
	   * @return LinkedHashMap<String, String> key value pairs
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
	   * @param openstack ip, username,password,tenant,imageId
	   * @return imageName
	   */
	
	public String getImageDetails(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName,String imageId){
		
		LinkedHashMap<String, String> imagesList=new LinkedHashMap<String,String>();
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();		
		GetOpenstackImageDetailsReq req=new GetOpenstackImageDetailsReq();		
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opesusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
			new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName); 
		 JAXBElement<String> image = 
				    new JAXBElement(new QName("http://core.isap.com", "imageid"), String.class, imageId);
		 req.setIp(ip);	 	
		 req.setOpesusername(opesUsername);	
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);
		 req.setImageid(image);
		GetOpenstackImageDetailsResp response=isapCoreWebservicesPortType.getOpenstackImageDetails(req);
		 return response.getImagename().getValue();
	}
	
	 /**
	   * param 
	   * @param openstack ip, username,password,tenant, 
	   * @return LinkedHashMap<String, String> key value pairs
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
	   * @return LinkedHashMap<String, String> key value pairs
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
	
	public List<SecurityRules> getSecurityGroupDetails(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName,String secGpId){
		
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
		 List <Rules> rules=response.getSecGrpDetails();
		 List<SecurityRules> secRules=new ArrayList<SecurityRules>();
		 for(Rules rule:rules){
			 if(rule!=null){
			 SecurityRules secRule=new SecurityRules();
			 secRule.setFromPort(rule.getFromPort());
			 secRule.setToPort(rule.getToPort());
			 secRule.setIpProtocol(rule.getIpProtocol().getValue());
			 secRules.add(secRule);
		 }
	  }
		 
		 return  secRules;
	}
	

	 /**
	   * param 
	   * @param openstack ip, username,password,tenant,securityId 
	   * @return securityGroupName
	   */
	
	public String getSecurityGroupName(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName,String secGpId){
		
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
		 return  response.getSecgrpname().getValue();
	}
	
	
	 /**
	   * param 
	   * @param openstack ip, username,password,tenant,instanceId 
	   * @return int value 1 or 0
	   */
	public int terminateInstance(String ipAddress,String openStackUserName,String openStackPassword,String openStackTenantName,String InstanceId){
		
		IsapCoreWebservices isapCoreWebservices=new IsapCoreWebservices();
		IsapCoreWebservicesPortType isapCoreWebservicesPortType=  isapCoreWebservices.getIsapCoreWebservicesHttpSoap11Endpoint();				
		TerminateOpensInstanceReq req= new TerminateOpensInstanceReq();		
		JAXBElement<String> ip = 
				    new JAXBElement(new QName("http://core.isap.com", "ip"), String.class, ipAddress);
		 JAXBElement<String> opesUsername = 
				    new JAXBElement(new QName("http://core.isap.com", "opesusername"), String.class, openStackUserName);	 
		 JAXBElement<String> opsPassword = 
				    new JAXBElement(new QName("http://core.isap.com", "opspassword"), String.class, openStackPassword);	 
		 JAXBElement<String> opsTenantName = 
				    new JAXBElement(new QName("http://core.isap.com", "opstenantname"), String.class, openStackTenantName);
		 JAXBElement<String> instance_id = 
				    new JAXBElement(new QName("http://core.isap.com", "instance_id"), String.class, InstanceId);
		 req.setIp(ip);	 	
		 req.setOpesusername(opesUsername);	
		 req.setOpspassword(opsPassword);
		 req.setOpstenantname(opsTenantName);
		 req.setInstanceId(instance_id);	 
		 Integer response=isapCoreWebservicesPortType.isapTerminateOpensInstance(req); 
		 return response;
	}
	
}


