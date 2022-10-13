package dataAccess.course;

import entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Added to Hibernate : " + course.getName());
	}

}
