package com.example.records.controller;

import com.example.records.model.Record;
import com.example.records.model.User;
import com.example.records.repository.RecordRepository;
import com.example.records.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/records")
public class RecordController {
    @Autowired
    RecordRepository recordRepository;

    @GetMapping("")
    public ResponseEntity<List<Record>> findAllRecords() {
        return new ResponseEntity<>(recordRepository.findAll(), HttpStatus.OK);
    }
}
