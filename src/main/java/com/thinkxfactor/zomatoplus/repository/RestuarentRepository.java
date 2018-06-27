package com.thinkxfactor.zomatoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Restuarent;
import com.thinkxfactor.zomatoplus.models.User;

public interface RestuarentRepository extends JpaRepository<Restuarent,Long>{

  Restuarent findByNameAndCity(String name,String city);
  
}
