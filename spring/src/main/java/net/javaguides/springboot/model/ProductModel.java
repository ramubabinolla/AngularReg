package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	
	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "description")
	private String description;
	
    @Column(name = "quantity")
	private String quantity;
	
	public ProductModel() {
		
	}
	
	public ProductModel(Long productId, String imageUrl, String productName, String price, String description , String quantity) {
		super();
		this.productId=productId;
		this.imageUrl = imageUrl;
		this.productName = productName;
		this.price = price;
		this.description = description;
        this.quantity = quantity;
	}

	public long getproductId() {
		return productId;
	}
	public void setproductId(long productId) {
		this.productId = productId;
	}
	public String getimageUrl() {
		return imageUrl;
	}
	public void setimageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getproductName() {
		return productName;
	}
	public void setproductName(String productName) {
		this.productName = productName;
	}
	public String getprice() {
		return price;

	}
	public void setprice(String price) {
		this.price = price;
	}
	
	public void setdescription(String description){
		this.description = description;
	}
	public String getdescription(){
		return description;
	}

    public void setquantity(String quantity){
		this.quantity = quantity;
	}
	public String getquantity(){
		return quantity;
	}
}
