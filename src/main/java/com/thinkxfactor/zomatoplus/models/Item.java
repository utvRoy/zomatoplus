package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_items")
public class Item implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="Item_id")
	private Long id;
	@Column(name="restuarent_id")
	private Long restuarentId;
	@Column(name="name")
	private String name;
	@Column(name="price")
     private Double price;
  @Column(name="description")
	private String description;
public Item(Long id, Long restuarentId, String name, Double price, String description) {
	super();
	this.id = id;
	this.restuarentId = restuarentId;
	this.name = name;
	this.price = price;
	this.description = description;
}
public Item() {
	super();
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getRestuarentId() {
	return restuarentId;
}
public void setRestuarentId(Long restuarentId) {
	this.restuarentId = restuarentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
	

}