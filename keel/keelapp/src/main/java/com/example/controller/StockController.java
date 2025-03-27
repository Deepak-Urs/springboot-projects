package com.example.controller;

import com.example.model.Stock;
import com.example.service.StockPurchaseService;
import com.example.service.AwsS3Service;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/stocks")
public class StockController {

    private final StockPurchaseService purchaseService;
    private final AwsS3Service s3Service;

    public StockController(StockPurchaseService purchaseService, AwsS3Service s3Service) {
        this.purchaseService = purchaseService;
        this.s3Service = s3Service;
    }

    @Post("/purchase/top")
    public String purchaseTopStocks() throws Exception {
        List<Stock> top10 = purchaseService.getTop10Stocks();
        List<Stock> top5 = purchaseService.selectTop5ForPurchase(top10);

        String top10Json = purchaseService.toJson(top10);
        String top5Json = purchaseService.toJson(top5);

        String top10Upload = s3Service.upload("top-10-stocks.json", top10Json);
        String top5Upload = s3Service.upload("purchase-order.json", top5Json);

        return "✅ Purchase complete:\n" + top10Upload + "\n" + top5Upload;
    }
}
