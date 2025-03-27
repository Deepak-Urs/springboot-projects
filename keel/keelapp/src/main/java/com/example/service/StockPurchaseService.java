package com.example.service;

import com.example.model.Stock;
import jakarta.inject.Singleton;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;
import java.util.stream.Collectors;

@Singleton
public class StockPurchaseService {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Stock> getTop10Stocks() {
        return List.of(
            new Stock("AAPL", 189.01),
            new Stock("GOOGL", 131.77),
            new Stock("MSFT", 299.02),
            new Stock("AMZN", 170.20),
            new Stock("META", 210.35),
            new Stock("TSLA", 192.50),
            new Stock("NVDA", 820.90),
            new Stock("NFLX", 540.11),
            new Stock("BABA", 72.80),
            new Stock("JPM", 160.45)
        );
    }

    public List<Stock> selectTop5ForPurchase(List<Stock> stocks) {
        return stocks.stream()
                     .sorted(Comparator.comparingDouble(Stock::getPrice).reversed())
                     .limit(5)
                     .collect(Collectors.toList());
    }

    public String toJson(List<Stock> stocks) throws Exception {
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(stocks);
    }
}
