package com.thinkxfactor.zomatoplus.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restuarent;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestuarentRepository;
import com.thinkxfactor.zomatoplus.repository.UserRepository;

@RestController
@RequestMapping("/restuarent")
public class RestuarentController implements Serializable {
	
  @Autowired	
  private RestuarentRepository restuarentRepository;
  @Autowired	
  private ItemRepository itemRepository;
  
  @PostMapping("/create")
  public Restuarent addRestuarent(@RequestBody Restuarent restuarent) {
  	Restuarent persistedUser=restuarentRepository.save(restuarent);
  	return persistedUser;
  }
	
  @GetMapping("/getAll")
  public List<Restuarent> getAll(){
  List<Restuarent> listofrestuarents=restuarentRepository.findAll();
  return listofrestuarents;
  }
	
 @GetMapping("/getRestuarent")
 public Restuarent get(@RequestBody Restuarent restuarent) {
	 Restuarent persistedRestuarent=restuarentRepository.findByNameAndCity(restuarent.getName(), restuarent.getCity());
		 return persistedRestuarent; 
 }
 
 @GetMapping("/getItem")
 public Item get(@RequestBody Item item) {
	 Item persistedItem=itemRepository.findByRestuarentIdAndName(item.getRestuarentId(),item.getName());
			 return persistedItem; 
}

/*
@PostMapping("/create")
public Restuarent createRestuarent(@RequestBody Restuarent res) {
	String name = null;
	res.setName(name);
	String address = null;
	res.setAddress(address);
	float rating = 0;
	res.setRating(rating);
	String email = null;
	res.setEmail(email);
	String pnumber = null;
	res.setPnumber(pnumber);
	System.out.println(res.toString());
	return res;
}

@GetMapping("getall")
public List<Restuarent> ListAllRestuarent() {
	List<Restuarent> rest=new ArrayList<>();	
	((Restuarent) rest).getName();
	((Restuarent) rest).getAddress();
	((Restuarent) rest).getRating();
	((Restuarent) rest).getEmail();
	((Restuarent) rest).getPnumber();
	return rest;
}
*/	
@PostMapping("additems")
public Item AddItem(@RequestBody Item item) {
Item persistedItem=itemRepository.save(item);
return persistedItem;
}
	
}


