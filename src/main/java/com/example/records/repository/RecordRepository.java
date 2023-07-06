package com.example.records.repository;

import com.example.records.model.Record;
import com.example.records.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Integer> {
}
