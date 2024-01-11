package com.piyush.ecomm.Dto;

import com.piyush.ecomm.entity.Address;
import com.piyush.ecomm.entity.Customer;
import com.piyush.ecomm.entity.Order;
import com.piyush.ecomm.entity.OrderItem;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
