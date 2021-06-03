package self.learning.edu.basma_online_Store.services;

import self.learning.edu.basma_online_Store.models.Categories;

public interface CategoryService {

	public Categories addCategory(String string, String C_image);
	public Categories editCategory(String name,String image,String name2);
	public String deleteCategory();
	
}
