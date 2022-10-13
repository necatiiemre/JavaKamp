package bussines;

import java.util.List;

import core.logging.ILogger;
import dataAccess.course.ICourseDao;
import entities.Course;

public class CourseManager {
	
	private ICourseDao iCourseDao;
	private List<Course> courses;
	private ILogger[] loggers;
	
	public CourseManager(ICourseDao iCourseDao, List<Course> courses, ILogger[] logger) {
		this.iCourseDao = iCourseDao;
		this.courses = courses;
		this.loggers = logger;
	}
	
	public void add(Course newCourse) throws Exception{
		
		for (Course course : courses) {
			if(course.getName() == newCourse.getName()){
				throw new Exception("Course name cannot be repeated!");
			}
			else {
				continue;
			}
		}
		
		for (ILogger logger : loggers) {
			logger.log(newCourse.getName());
		}
		iCourseDao.add(newCourse);
		courses.add(newCourse);
		
	}
	
	
	
}
