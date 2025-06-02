package com.visualvibes.algovis.controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.visualvibes.algovis.model.AlgorithmRequest;
import com.visualvibes.algovis.model.AlgorithmStep;
import com.visualvibes.algovis.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/sort")
public class AlgorithmController {

    @Autowired
    private SortingService sortingService;

    @PostMapping("/bubble")
    public List<AlgorithmStep> sort(@RequestBody AlgorithmRequest req) {
        return sortingService.bubbleSort(req.getInputArray());
    }

}
