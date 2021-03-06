package com.pra.dao;

	import java.util.List;

	import com.pra.entity.Project;

	public interface ProjectDAO {
	     public   Integer  insert(Project entity);
	     public   Project   getProjectById(int id);
	     public    boolean updateProjectById(int id, int teamSize, double cost);
	     public   boolean  deleteProjectById(int id);
	     public  List<Project> getProjectsByCostRange(double start,double end);
	}

