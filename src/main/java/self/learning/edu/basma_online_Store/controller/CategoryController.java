package self.learning.edu.basma_online_Store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import self.learning.edu.basma_online_Store.models.Categories;

import self.learning.edu.basma_online_Store.services.CategoryService;
import self.learning.edu.basma_online_Store.util.JWTokenProvider;





@RestController
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	
	@PostMapping(value = "/addcat")
	public ResponseEntity<Categories> insertCategory(@RequestBody Categories cat) {
		
		
		Categories category = service.addCategory(cat.getC_name(),  cat.getC_image());
		
		return new ResponseEntity<Categories>(category, HttpStatus.OK);
	}
	@PostMapping(value = "/editcat")
	public ResponseEntity<Categories> editCategory(@RequestParam("name") String name, @RequestParam("name2") String name2, @RequestParam("image") String image ) {
		
		System.out.println(name + name2 + image);
		
		Categories category = service.editCategory(name,name2,image);
		
		return new ResponseEntity<Categories>(category, HttpStatus.OK);
	}
	
	
}
