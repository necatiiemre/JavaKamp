package dataAccess.categoryDao;

import entities.Category;

public class HibernateCategoryDao implements ICatagoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Added to Hibernate :" + category.getName());		
	}

}
