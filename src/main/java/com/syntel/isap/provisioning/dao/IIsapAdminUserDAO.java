package com.syntel.isap.provisioning.dao;

import java.util.List;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;

public interface IIsapAdminUserDAO {

	List<CorporateGroups> getCorps();

	List<Department> getDepts();

	List<Project> getProj();

	List<Department> getDeptsJsonById(Integer depId);

	List<Project> getProjsJsonById(Integer projId);

	List<User> getUser();

	int update(User usr);

}
