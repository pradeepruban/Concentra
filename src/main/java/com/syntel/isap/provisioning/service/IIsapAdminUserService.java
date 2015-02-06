package com.syntel.isap.provisioning.service;

import java.util.List;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;

public interface IIsapAdminUserService {

	List<CorporateGroups> getCorps();

	List<Department> getDepts();

	List<Department> getDeptsJsonById(Integer cgId);

	List<Project> getProj();

	List<Project> getProjsJsonById(Integer dptId);

	List<User> getUser();

	int update(User usr);

}
