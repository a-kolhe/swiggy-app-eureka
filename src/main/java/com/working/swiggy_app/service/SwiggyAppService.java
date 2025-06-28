package com.working.swiggy_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.working.swiggy_app.client.RestaurantServiceClient;
import com.working.swiggy_app.dto.OrderResponseDTO;

@Service
public class SwiggyAppService {
    @Autowired
    private RestaurantServiceClient restaurantServiceClient;

    public String greeting() {
        return "Welcome to Swiggy App Service";
    }

    public OrderResponseDTO checkOrderStatus(String orderId) {
        return restaurantServiceClient.fetchOrderStatus(orderId);
    }
}
