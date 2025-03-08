package org.learning.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.learning.domain.Order;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @Mock
    private Order order;

    @InjectMocks
    private EmailService emailService;

    @Test(expected = RuntimeException.class)
    public void testSendEmail_Exception() {
        emailService.sendEmail(order);
    }

    @Test
    public void testSendEmail_WithCC() {
        when(order.isCustomerNotified()).thenReturn(false);

        boolean result = emailService.sendEmail(order, "cc@gmail.com");

        if (result) {
            System.out.println("Email sent successfully!");
        }

        assertTrue(result);
    }
}
