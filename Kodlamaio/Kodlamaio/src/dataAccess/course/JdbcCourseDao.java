package dataAccess.course;

import entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Added to Jdbc : " + course.getName());
		
	}
	
}
