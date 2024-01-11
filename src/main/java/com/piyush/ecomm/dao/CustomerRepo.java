package com.piyush.ecomm.dao;

import com.piyush.ecomm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo  extends JpaRepository<Customer,Long> {
}
