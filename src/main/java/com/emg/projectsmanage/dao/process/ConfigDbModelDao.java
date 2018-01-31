package com.emg.projectsmanage.dao.process;

import java.util.List;
import com.emg.projectsmanage.pojo.ConfigDbModel;

public interface ConfigDbModelDao {

	ConfigDbModel selectDbInfoByDbid(Integer id);
	
	List<ConfigDbModel> selectDbInfos();
}
