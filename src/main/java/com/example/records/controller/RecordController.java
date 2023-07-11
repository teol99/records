package com.example.records.controller;

import com.example.records.model.Record;
import com.example.records.repository.RecordRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/records")
public class RecordController {
    private final RecordRepository recordRepository;

    public RecordController(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @GetMapping("")
    public ResponseEntity<List<Record>> findAllRecords() {
        return new ResponseEntity<>(recordRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Record>> findAllRecordsForUser(@PathVariable Integer userId) {
        return new ResponseEntity<>(recordRepository.findByUserId(userId), HttpStatus.OK);
    }
}
