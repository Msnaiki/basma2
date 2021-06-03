package self.learning.edu.basma_online_Store.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long Product_id;
	private String nom;
	private String description;
	private float price;
	
	
	
	public Products(Long product_id, String nom, String description, float price) {
		super();
		Product_id = product_id;
		this.nom = nom;
		this.description = description;
		this.price = price;
	}



	public Products(String nom, String description, float price) {
		super();
		this.nom = nom;
		this.description = description;
		this.price = price;
	}



	public Long getProduct_id() {
		return Product_id;
	}



	public void setProduct_id(Long product_id) {
		Product_id = product_id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}
	 
	
}
