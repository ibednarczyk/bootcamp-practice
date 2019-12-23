package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aT87.M", "website_12", "user..007", "resu-_-2"})
    public void shouldValidateUserName(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"yivem.62788@seomail.net", "4ben@sismeyapi.com", "hronald@newsletterbroadcaster.info", "ha.nalbta9n@alldc.websit"})
    public void shouldValidateEmail(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"me", "1A", "%&*!", "ąęźx", " "})
    public void shouldNotValidateUserNameWhenPassingWrongValue(String username) {
        assertFalse(validator.validateUsername(username));
    }
    @ParameterizedTest
    @ValueSource(strings = {"4bensismeyapicom", "8and@tjkjzjel.shooooop", "8and@tjkjzjel", "@tjkjzjel", " "})
    public void shouldNotValidateEmailWhenPassingWrongValue(String email) {
        assertFalse(validator.validateEmail(email));
    }

}