package com.syntel.isap.provisioning.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.syntel.isap.provisioning.bean.Monitor;
import com.syntel.isap.provisioning.bean.Vdc;
import com.syntel.isap.provisioning.bean.VdcExt;
import com.syntel.isap.provisioning.bean.SCM;
import com.syntel.isap.provisioning.bean.Vdc;
import com.syntel.isap.provisioning.bean.VdcExt;


public interface VdcMapper {

       @Insert("INSERT INTO isap_env_vdc_master (vdc_name,vdc_provider,vdc_location) VALUES "
    		+ "(#{vdc_name},'Openstack',#{vdc_location})")
       @Options(useGeneratedKeys = true, keyProperty = "vdc_id")
	public int setVdcMaster(Vdc openstack);

   
        @Insert("INSERT INTO isap_vm_prov_cred (cred_id,vdc_id,type,vm_id,isap_env_identity_identity_id,username,password) "
       		+ "VALUES "
    		+ "(1,#{vdc_id},'Openstack',1,3,#{user},#{password})")
	    public int setCred(Vdc openstack); 

        @Select("SELECT param_val FROM isap_env_vdc_ext e JOIN isap_env_vdc_master m ON m.vdc_id=e.vdc_id  WHERE m.delete_flag=0 AND param_name='keystoneEndpoint' and param_val=#{keystone_endpoint}")
	    public List<String> getKeystone(String keystone_endpoint);

        @Update("UPDATE  isap_env_vdc_master  SET vdc_name=#{vdc_name},vdc_status=#{vdc_status},vdc_location=#{vdc_location},updated_at=CURRENT_TIMESTAMP  WHERE vdc_id=#{vdc_id}")
	    public int updateOpenstackMaster(Vdc openstack);

	    @Update("UPDATE isap_env_vdc_master  SET delete_flag=1,deleted_at=CURRENT_TIMESTAMP WHERE vdc_id=#{vdc_id}") 
	    public void deleteOpenstack(Integer vdc_id);

	    @Select("SELECT scm_id,scm_name,scm_type,host_name FROM isap_env_scm_mst where delete_flag=0")
		public List<SCM> getscm();

	    @Insert("INSERT INTO isap_env_scm_mst (scm_name,scm_type,host_name,scm_endpoint,admin_user,admin_pass) VALUES (#{scm_name},'puppet',#{host_name},#{scm_endpoint},#{admin_user},#{admin_pass})")
		public int setscmpuppet(SCM scm);

	    @Insert("INSERT INTO isap_env_scm_mst (scm_name,scm_type,host_name,scm_endpoint,admin_user,admin_pass) VALUES (#{scm_name},'chef',#{host_name},#{scm_endpoint},#{admin_user},#{admin_pass})")
		public int setscmchef(SCM scm);

	    @Select("SELECT vdc_name,p.scm_id FROM isap_env_vdc_master m JOIN isap_env_vdc_scm_map p ON m.vdc_id=p.vdc_id JOIN isap_env_scm_mst t ON t.scm_id=p.scm_id WHERE p.scm_id=#{b} AND m.delete_flag=0")
		public List<Vdc> getvdc(int b);

	    @Select("SELECT scm_name,host_name,scm_endpoint,admin_user,admin_pass FROM isap_env_scm_mst WHERE scm_id=#{scmid}")
		public SCM editScm(Integer scmid);
      
	    @Update("UPDATE isap_env_scm_mst SET scm_name =#{scm_name},scm_endpoint=#{scm_endpoint},admin_user=#{admin_user},admin_pass=#{admin_pass} WHERE scm_id=#{scm_id}")
		public void updateScm(SCM scm);

	    @Update("UPDATE isap_env_scm_mst SET scm_name =#{scm_name},host_name=#{host_name},scm_endpoint=#{scm_endpoint},admin_user=#{admin_user},admin_pass=#{admin_pass} WHERE scm_id=#{scm_id}")
	    public void update(@Param("scm_id") int scm_id, @Param("scm_name") String scm_name,@Param("host_name") String host_name,@Param("scm_endpoint") String scm_endpoint,
			@Param("admin_user") String admin_user,@Param("admin_pass")  String admin_pass);

	    @Update("UPDATE  isap_env_scm_mst  SET delete_flag=1 WHERE scm_id=#{scm_id}")
		public void deleteProject(Integer proj_id);
	    
	    
	    @Select("SELECT scm_endpoint FROM isap_env_scm_mst WHERE scm_endpoint=#{scm_endpoint}")
	  		public List<String> getScmEndpoint(String scm_endpoint);

	    @Select("SELECT mon_id,mon_name,mon_type,host_name FROM  isap_env_mon_mst where delete_flag=0")
		public List<Monitor> getMonitorDetails();

	   
	    @Select("SELECT  DISTINCT vdc_name ,p.mon_id FROM isap_env_vdc_master m JOIN isap_env_vdc_scm_map p ON m.vdc_id=p.vdc_id JOIN isap_env_mon_mst t ON t.mon_id=p.mon_id WHERE p.mon_id=#{b} AND m.delete_flag=0")
		public List<Vdc> getMonitorVdc(int b);

	    @Update("UPDATE  isap_env_mon_mst  SET delete_flag=1 WHERE mon_id=#{mon_id}")
		public void deleteMonitor(Integer mon_id);

	    @Select("SELECT mon_name,mon_endpoint,host_name,admin_user,admin_pass FROM isap_env_mon_mst WHERE mon_id=#{mon_id}")
		public Monitor editMon(Integer mon_id);

	    @Update("UPDATE isap_env_mon_mst SET mon_name =#{mon_name},mon_endpoint=#{mon_endpoint},host_name=#{host_name},admin_user=#{admin_user},admin_pass=#{admin_pass} WHERE mon_id=#{mon_id}")
		public void updateMonitor(Monitor monitor);

	    @Insert("INSERT INTO isap_env_mon_mst (mon_name,mon_type,host_name,mon_endpoint,admin_user,admin_pass) VALUES (#{mon_name},'Nagios',#{host_name},#{mon_endpoint},#{admin_user},#{admin_pass})")
		public int setMonNagio(Monitor monitor);

	    @Insert("INSERT INTO isap_env_mon_mst (mon_name,mon_type,host_name,mon_endpoint,admin_user,admin_pass) VALUES (#{mon_name},'Zabbix',#{host_name},#{mon_endpoint},#{admin_user},#{admin_pass})")
		public int setMonZabbix(Monitor monitor);

	    @Select("SELECT mon_endpoint FROM isap_env_mon_mst WHERE mon_endpoint=#{mon_endpoint}")
		public List<String> getMonEndpoint(String mon_endpoint);

	    @Select("SELECT param_val FROM isap_env_vdc_ext e JOIN isap_env_vdc_master m ON m.vdc_id=e.vdc_id  WHERE m.delete_flag=0 AND param_name='controllerEndpoint' and param_val=#{controller_endpoint} ")
		public List<String> getControllerEndpoint(String controller_endpoint);

	    @Select("SELECT * FROM isap_env_vdc_master WHERE vdc_name=#{vdc_name} AND delete_flag=0")
		public List<String> getVdcName(String vdc_name);

	    @Select("SELECT * FROM isap_env_scm_mst WHERE scm_name=#{scm_name}")
		public List<String> getScmName(String scm_name);

	    @Select("SELECT * FROM isap_env_mon_mst WHERE mon_name=#{mon_name}")
		public List<String> getMonName(String mon_name);
        
	    @Select("SELECT scm_id from isap_env_scm_mst where scm_name=#{scm_name}")
		public int getScmid(String scm_name);

        @Insert("INSERT INTO isap_env_vdc_scm_map (vdc_id,scm_id,mon_id) VALUES (#{vdc_id},#{scm_id},#{mon_id})")
		public void setMap(Vdc openstack);

        @Select("SELECT mon_id from isap_env_mon_mst where mon_name=#{mon_name}")
		public int getMonid(String mon_name);

        @Insert("INSERT INTO isap_env_vdc_ext (vdc_id,param_name,param_val) VALUES "
        		+ "(#{vdc_id},#{param_name},#{param_val})")
    	public void addOpenStackVdcExt(VdcExt vdc);


        @Select("SELECT vdc_name,vdc_location,created_at,vdc_provider,vdc_status,vdc_id FROM isap_env_vdc_master WHERE vdc_provider='Openstack' AND delete_flag=0")
		public List<Vdc> getVdcList();

        @Select("SELECT * from isap_env_vdc_ext WHERE vdc_id=#{vdcId}")
		public List<VdcExt> getVdcExtDetailsById(int vdcId);

        @Select("SELECT vdc_name,vdc_location,vdc_status FROM isap_env_vdc_master WHERE vdc_id=#{vdc_id}")
		public List<Vdc> getVdcEditList(Integer vdc_id);

        @Update("UPDATE isap_env_vdc_ext SET param_val=#{param_val}  WHERE vdc_id=#{vdc_id} AND param_name=#{param_name}")
		public void updateOpenStackVdcExt(VdcExt vdc);

        @Select("SELECT param_val FROM isap_env_vdc_ext e JOIN isap_env_vdc_master m ON m.vdc_id=e.vdc_id  WHERE m.delete_flag=0 AND param_name='subnetAddress' and param_val=#{param_val}")
		public List<String> getSubnetAddress(String subnet_address);


		public Vdc getVdcExt(int vdcId);


		

        
        
        
   
}