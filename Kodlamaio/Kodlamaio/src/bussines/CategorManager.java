package bussines;

import java.util.List;

import core.logging.ILogger;
import dataAccess.categoryDao.ICatagoryDao;
import entities.Category;

public class CategorManager {
	private ICatagoryDao iCatagoryDao;
	private List<Category> categories;
	private ILogger[] loggers;
	
	public CategorManager(ICatagoryDao iCatagoryDao, List<Category> categories, ILogger[] loggers) {
		this.iCatagoryDao = iCatagoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}
	
	public void add(Category newCategory) throws Exception {
		
		for (Category category : categories) {
			
			if(category.getName() == newCategory.getName()){
				//System.out.println(new Exception("Category name cannot be repeated"));
				throw new Exception("Category name cannot be repeated");
			}
			else {
				continue;
			}
		}
		
		for (ILogger logger: loggers) {
			logger.log(newCategory.getName());
		}
		iCatagoryDao.add(newCategory);
		categories.add(newCategory);
		//throw new Exception("Added");
		
	}
	
	
	

}
