package com.petproject.integrationtests;


import com.petproject.model.Book;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(
        locations = "classpath:application-integrationtests.properties")
public class BookControllerTest {

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();


    @Test
    public void testBookCreation() {

        JSONObject request = new JSONObject();

        request.put("name","test");
        request.put("author","padma");
        request.put("price",12);

        HttpEntity http = new HttpEntity(request);
        ResponseEntity<Book> response = restTemplate.exchange(
                "http://localhost:" + port + "/books/add",
                HttpMethod.POST, http, Book.class);

        assertNotNull(response.getBody());
    }
}
