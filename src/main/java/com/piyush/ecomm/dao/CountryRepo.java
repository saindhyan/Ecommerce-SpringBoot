package com.piyush.ecomm.dao;

import com.piyush.ecomm.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Repository
public interface CountryRepo extends JpaRepository<Country,Integer> {
}
