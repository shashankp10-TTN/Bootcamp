package com.bootcamp.assignment_3.repository;

import com.bootcamp.assignment_3.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {
}
