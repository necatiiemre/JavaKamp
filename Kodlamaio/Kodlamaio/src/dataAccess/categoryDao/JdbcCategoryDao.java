package dataAccess.categoryDao;

import entities.Category;

public class JdbcCategoryDao implements ICatagoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Added to jdbc :" + category.getName());
		
	}

}
