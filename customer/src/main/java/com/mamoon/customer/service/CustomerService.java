package com.mamoon.customer.service;

import com.mamoon.customer.dto.CustomerRegistrationRequest;

public interface CustomerService {
    void registerCustomer(CustomerRegistrationRequest request);
}
