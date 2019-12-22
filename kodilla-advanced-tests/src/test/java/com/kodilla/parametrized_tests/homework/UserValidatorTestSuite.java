package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aT87.M"})
    public void shouldValidateUserName(String username){
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"yivem.62788@seomail.net"})
    public void shouldValidateEmail(String email){
        assertTrue(validator.validateEmail(email));

    }


}