package com.codecool.stocktraderspringboot.controller;

import com.codecool.stocktraderspringboot.services.Trader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController

public class StockController {

    private Trader trader;

    @Autowired
    public StockController(Trader trader) {
        this.trader = trader;
    }

    @GetMapping("/buy/{stock}/{price}")
    public boolean buyStock(@PathVariable("stock") String symbol, @PathVariable("price") double bid) throws IOException {
        return trader.buy(symbol, bid);
    }
}
