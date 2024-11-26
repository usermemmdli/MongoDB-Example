package com.example.MongoDB;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@Document(collation = "Test")
public class Test {
    @Id
    private String id;
    private String author;
    private String book;
    private Integer pages;
}
