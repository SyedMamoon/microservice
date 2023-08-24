package com.mamoon.service.impl;


import com.mamoon.dto.CustomerRegistrationRequest;
import com.mamoon.model.Customer;
import com.mamoon.repository.CustomerRepository;
import com.mamoon.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        customerRepository.saveAndFlush(customer);


    }
}