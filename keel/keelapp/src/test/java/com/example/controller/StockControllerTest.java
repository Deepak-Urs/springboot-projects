package com.example.controller;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
public class StockControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testPingEndpoint() {
        String response = client.toBlocking().retrieve("/stocks/ping");
        assertEquals("pong", response);
    }

    @Test
    void testStockListReturnsJson() {
        HttpResponse<String> response = client.toBlocking().exchange("/stocks/", String.class);
        assertEquals(200, response.getStatus().getCode());
        assertTrue(response.body().contains("AAPL"));
    }
}
