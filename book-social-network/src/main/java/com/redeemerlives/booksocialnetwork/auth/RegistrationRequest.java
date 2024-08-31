package com.redeemerlives.booksocialnetwork.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotBlank(message = "Firstname is required")
    @NotEmpty(message = "Firstname is required")
    private String firstname;

    @NotBlank(message = "Lastname is required")
    @NotEmpty(message = "Lastname is required")
    private String lastname;

    @Email(message = "Email is not valid")
    @NotBlank(message = "Email is required")
    @NotEmpty(message = "Email is required")
    private String email;

    @Size(min = 8, message = "Password should have a minimum of 8 characters")
    @NotBlank(message = "Password is required")
    @NotEmpty(message = "Password is required")
    private String password;
}
