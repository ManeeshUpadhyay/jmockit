package com.aartek.jmockittest;

import java.util.List;

import com.aartek.jmockitDependancy.Project;
import com.aartek.jmockitDependancy.ProjectService;

public class ProjectController {

	private ProjectService projectSrvice;

	public void getProjectList(String name) {
		List<Project> list= projectSrvice.getProject(name);
	}
}
