package self.learning.edu.basma_online_Store.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long category_id;
	@Column(unique = true)
	private String cname;
	private String cimage;
	@OneToMany
	private List <Products> cproducts;
	

	public Categories() {
		super();
	}
	public Categories(Long category_id, String c_name,String C_image, List<Products> c_products) {
		super();
		this.category_id = category_id;
		this.cname=c_name;
		this.cimage=C_image;
		this.cproducts= c_products;
	}
	public Categories( String cimage, String cname) {
		super();
		
		this.cimage=cimage;
		this.cname=cname;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public String getC_name() {
		return cname;
	}

	public void setC_name(String c_name) {
		this.cname = c_name;
	}

	public List<Products> getC_products() {
		return cproducts;
	}

	public void setC_products(List<Products> c_products) {
		this.cproducts = c_products;
	}
	public String getC_image() {
		return cimage;
	}
	public void setC_image(String c_image) {
		this.cimage = c_image;
	}
	
	
}
