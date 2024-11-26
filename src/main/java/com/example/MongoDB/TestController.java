package com.example.MongoDB;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {
    private final TestRepository testRepository;

        @GetMapping("/get-all")
    public List<Test> getAll() {
            return testRepository.findAll();
        }
}
