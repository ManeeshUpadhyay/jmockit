package com.aartek.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.aartek.jmockitDependancy.Project;
import com.aartek.jmockitDependancy.ProjectRepository;
import com.aartek.jmockitDependancy.ProjectService;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class TestProjectMockit {

	private List<Project> projectList = null;
	// this annotation shows which class we we want to test or whose class we
	// create the mock object of that class
	@Tested
	private ProjectService proService;

	// this annotation show object of dependent class mock object
	@Injectable
	private ProjectRepository proRepository;

	@Before
	public void setProject() {

		projectList = new ArrayList<Project>();
		projectList.add(new Project());
		projectList.add(new Project());
	}

	// this annotation show we test the method of mock class
	@Test
	public void searchProject() {

		//this is show which method call and its return type
		new Expectations() {
			{
				
				proRepository.getProjectList("Java"); // here method is called
				returns(projectList); //this method show method return
				times = 1; // this show  how many times its returns t he result
			}
		};

		List<Project> list = proRepository.getProjectList("Java");
		assertEquals(2, list.size());
	}
}
