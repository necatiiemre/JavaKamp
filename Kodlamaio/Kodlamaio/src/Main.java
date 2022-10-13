import java.util.ArrayList;
import java.util.List;

import bussines.CategorManager;
import bussines.CourseManager;
import bussines.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import dataAccess.categoryDao.HibernateCategoryDao;
import dataAccess.course.JdbcCourseDao;
import dataAccess.instructor.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category1 = new Category(1,"Software");
		Category category2 = new Category(2,"Software");
		List<Category> categories = new ArrayList<>();
		ILogger[] loggers = {new FileLogger(),new DatabaseLogger(),new MailLogger()};
		CategorManager categorManager = new CategorManager(new HibernateCategoryDao(), categories,loggers);
		categorManager.add(category1);
		//categorManager.add(category2);
		
		System.out.println("--------------------------------------------------------------------------");
		
		Course course1 = new Course(1, "Java", 50.55);
		Course course2 = new Course(2, "Java", 50.55);
		List<Course> courses = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), courses, loggers);
		courseManager.add(course1);
		//courseManager.add(course2);
		
		System.out.println("--------------------------------------------------------------------------");
		
		Instructor instructor1 = new Instructor(1, "Emre ");
		Instructor instructor2 = new Instructor(1, "Emre ");
		List<Instructor> instructors = new ArrayList<>();
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers, instructors);
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		
		
	}

}
