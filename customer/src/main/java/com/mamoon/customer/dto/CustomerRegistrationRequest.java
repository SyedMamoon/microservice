package com.mamoon.customer.dto;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}