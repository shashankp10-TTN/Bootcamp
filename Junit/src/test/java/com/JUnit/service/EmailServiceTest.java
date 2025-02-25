package com.JUnit.service;

import com.JUnit.domain.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class EmailServiceTest {

    @Test
    public void sendEmailTest() {
        EmailService emailService = mock(EmailService.class);
        Order order = new Order(1, "Laptop", 1000.0);

        doThrow(new RuntimeException("Something went wrong during login"))
                .when(emailService).sendEmail(order);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> emailService.sendEmail(order));
        assertEquals("Something went wrong during login", exception.getMessage());

        verify(emailService, times(1)).sendEmail(order);
    }
}

