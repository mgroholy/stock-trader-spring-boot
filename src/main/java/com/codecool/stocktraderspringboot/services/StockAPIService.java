package com.codecool.stocktraderspringboot.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.json.JSONObject;
import java.io.IOException;

public class StockAPIService {

    private static final String API_PATH = "https://run.mocky.io/v3/9e14e086-84c2-4f98-9e36-54928830c980?stock=%s";

    private RemoteURLReader remoteURLReader;

    @Autowired
    public StockAPIService(RemoteURLReader remoteURLReader) {
        this.remoteURLReader = remoteURLReader;
    }

    /** Get stock price from iex and return as a double
     *  @param symbol Stock symbol, for example "aapl"
     **/
    public double getPrice(String symbol) throws IOException {
        String url = String.format(API_PATH, symbol);
        String result = remoteURLReader.readFromUrl(url);
        JSONObject json = new JSONObject(result);
        String price = json.get("price").toString();
        return Double.parseDouble(price);
    }

    /** Buys a share of the given stock at the current price. Returns false if the purchase fails */
    public boolean buy(String symbol) {
        // Stub. No need to implement this.
        return true;
    }
}