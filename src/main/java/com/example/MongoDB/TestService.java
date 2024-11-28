package com.example.MongoDB;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public List<Test> findAll() {
        return testRepository.findAll();
    }

    public Optional<Test> getById(String id) {
        return testRepository.findById(id);
    }

    public Test create(Test test) {
        return testRepository.save(test);
    }

    public Test update(String id, TestRequest testRequest) {
        return testRepository.findById(id)
                .map(test -> {
                    test.setBook(testRequest.getBook());
                    test.setAuthor(testRequest.getAuthor());
                    test.setPages(testRequest.getPages());
                    return testRepository.save(test);
                })
                .orElseThrow(() -> new RuntimeException("Test not found"));
    }

    public Test delete(String id) {
        testRepository.deleteById(id);
        return null;
    }
}
