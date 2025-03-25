package com.example.service;

import com.example.model.Stock;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class StockService {

    public List<Stock> listStocks() {
        return List.of(
            new Stock("AAPL", 187.91),
            new Stock("GOOGL", 131.25)
        );
    }
}
