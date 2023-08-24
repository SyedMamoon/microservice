package com.mamoon.dto;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}