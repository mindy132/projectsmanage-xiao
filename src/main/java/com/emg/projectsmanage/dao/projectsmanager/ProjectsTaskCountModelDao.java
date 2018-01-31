package com.emg.projectsmanage.dao.projectsmanager;

import java.util.List;
import java.util.Map;

import com.emg.projectsmanage.pojo.ProjectsTaskCountModel;

public interface ProjectsTaskCountModelDao {
	List<ProjectsTaskCountModel> groupProjectsProgressByUseridAndRoleid(Map<String, Object> map);
	
    List<ProjectsTaskCountModel> getProjectsProgressByUserid(Map<String, Object> map);
    
    int countProjectsProgressByUserid(Map<String, Object> map);
    
    List<ProjectsTaskCountModel> getProjectsProgress(Map<String, Object> map);
    
    int countProjectsProgress(Map<String, Object> map);
    
    int count(ProjectsTaskCountModel record);
    
    int newProjectsProgress(ProjectsTaskCountModel record);
    
    int newTask2Edit(ProjectsTaskCountModel record);
    
    int newTask2Check(ProjectsTaskCountModel record);
    
    int newTask2QC(ProjectsTaskCountModel record);
    
    int Edit2QC(ProjectsTaskCountModel record);
    
    int QC2Check(ProjectsTaskCountModel record);
    
    int taskDone(ProjectsTaskCountModel record);
    
    int comTaskDone(ProjectsTaskCountModel record);
    
    int QCTaskDone(ProjectsTaskCountModel record);
}