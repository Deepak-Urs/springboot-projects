package com.example.controller;

import com.example.model.Stock;
import com.example.service.StockService;
import io.micronaut.http.annotation.*;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/stocks")
public class StockController {

    private final StockService stockService;

    @Inject
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostConstruct
    public void init() {
        System.out.println(">> StockController is loaded ✅");
    }

    @Get("/ping")
    public String ping() {
        return "pong";
    }

    @Get("/")
    public List<Stock> getAll() {
        return stockService.listStocks();
    }
}
