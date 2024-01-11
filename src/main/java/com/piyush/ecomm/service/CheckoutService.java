package com.piyush.ecomm.service;

import com.piyush.ecomm.Dto.PurchaseResponse;
import com.piyush.ecomm.Dto.Purchase;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
