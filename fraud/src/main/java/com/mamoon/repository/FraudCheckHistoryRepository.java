package com.mamoon.repository;

import com.mamoon.model.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FraudCheckHistoryRepository
        extends JpaRepository<FraudCheckHistory, Integer> {
}