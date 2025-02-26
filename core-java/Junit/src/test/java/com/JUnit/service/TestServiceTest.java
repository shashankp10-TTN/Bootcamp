package com.JUnit.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceTest {
    @InjectMocks
    TestService testService;

    @Test
    public void testFirstMethod() {
        assertEquals(1, testService.test());
    }
}
