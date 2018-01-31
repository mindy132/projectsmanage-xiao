package com.emg.projectsmanage.dao.projectsmanager;

import java.util.List;

import com.emg.projectsmanage.pojo.ProjectsUserModel;

public interface ProjectsUserModelDao {
	int insert(ProjectsUserModel record);
	
	int count(ProjectsUserModel record);
    
    List<ProjectsUserModel> queryProjectUsers(ProjectsUserModel record);
    
    List<ProjectsUserModel> queryProjectUsersByPids(List<String> projectsIDs);
    
    List<ProjectsUserModel> getDistinctWorkers(ProjectsUserModel record);
    
    int delete(ProjectsUserModel record);
}