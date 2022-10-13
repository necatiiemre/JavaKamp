package dataAccess.instructor;

import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Added to Hibernate : " + instructor.getName());		
	}

}
