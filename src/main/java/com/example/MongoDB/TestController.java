package com.example.MongoDB;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/get-all")
    public List<Test> getAll() {
        return testService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Test> getById(@PathVariable("id") String id) {
        return testService.getById(id);
    }

    @PostMapping("/post")
    public Test create(@RequestBody Test test) {
        return testService.create(test);
    }

    @PutMapping("/edit/{id}")
    public Test update(@PathVariable("id") String id, @RequestBody TestRequest testRequest) {
        return testService.update(id, testRequest);
    }

    @DeleteMapping("/delete/{id}")
    public Test delete(@PathVariable("id") String id) {
        return testService.delete(id);
    }
}
