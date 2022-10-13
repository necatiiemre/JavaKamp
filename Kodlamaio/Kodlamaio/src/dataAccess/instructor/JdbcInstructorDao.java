package dataAccess.instructor;

import entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Added to Jdbc : " + instructor.getName());		
	}

}
