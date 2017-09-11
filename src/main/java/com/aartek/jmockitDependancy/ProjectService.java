package com.aartek.jmockitDependancy;

import java.util.List;

public class ProjectService {

	private ProjectRepository projectRepository;

	public List<Project> getProject(String name) {
		return projectRepository.getProjectList(name);
	}

}
