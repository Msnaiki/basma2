package self.learning.edu.basma_online_Store.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import self.learning.edu.basma_online_Store.models.Categories;
import self.learning.edu.basma_online_Store.repositories.CategoryRepository;
import self.learning.edu.basma_online_Store.services.CategoryService;



@Service
@Transactional
public class CategoryServiceImp implements CategoryService {

	@Autowired
	private CategoryRepository CategoryRepository;
	@Override
	public Categories editCategory(String name,String image,String name2) {
		// TODO Auto-generated method stub
		System.out.println(name + name2 + image);
		Categories cat = CategoryRepository.findByCname(name);
		cat.setC_name(image);
		cat.setC_name(name2);
		CategoryRepository.save(cat);
		return cat;
	}

	@Override
	public String deleteCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categories addCategory(String C_name,String C_image) {
		
		Categories cat = new Categories(C_name, C_image);
		System.out.println(cat.getC_name()+" "+ cat.getC_image());
		CategoryRepository.save(cat);
		return cat;
	}

}
