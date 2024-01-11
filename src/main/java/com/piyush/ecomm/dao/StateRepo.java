package com.piyush.ecomm.dao;

import com.piyush.ecomm.entity.Product;
import com.piyush.ecomm.entity.State;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public interface StateRepo extends JpaRepository<State,Integer> {
    Page<State> findByCountryCode(@Param("code") String code, Pageable pageable);

}
