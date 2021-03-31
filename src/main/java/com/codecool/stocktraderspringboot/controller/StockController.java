package com.codecool.stocktraderspringboot.controller;

import com.codecool.stocktraderspringboot.services.Trader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StockController {

    private Trader trader;

    @Autowired
    public StockController(Trader trader) {
        this.trader = trader;
    }
}
