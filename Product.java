package com.hql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int productId;

@Column(length=50)
private String productName;
@Column(length=0)
private float productPrice;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public float getProductPrice() {
	return productPrice;
}
public void setProductPrice(float productPrice) {
	this.productPrice = productPrice;
}
public Product(int productId, String productName, float productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}


}
