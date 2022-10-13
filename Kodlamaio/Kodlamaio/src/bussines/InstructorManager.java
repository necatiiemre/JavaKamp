package bussines;

import java.util.List;

import core.logging.ILogger;
import dataAccess.instructor.IInstructorDao;
import entities.Instructor;

public class InstructorManager {
	private IInstructorDao iInstructorDao;
	private ILogger[] loggers;
	private List<Instructor> instructors;
	
	public InstructorManager(IInstructorDao iInstructorDao, ILogger[] logger, List<Instructor> instructors) {
		super();
		this.iInstructorDao = iInstructorDao;
		this.loggers = logger;
		this.instructors = instructors;
	}
	
	public void add(Instructor newInstructor) throws Exception{
		for (Instructor instructor : instructors) {
			if(instructor.getName() == newInstructor.getName()){
				throw new Exception("Instructor name cannot be repeated!");
			}
			else {
				continue;
			}
		}
		
		for (ILogger logger : loggers) {
			logger.log(newInstructor.getName());
		}
		
		iInstructorDao.add(newInstructor);
		instructors.add(newInstructor);
	}
	
	

}
