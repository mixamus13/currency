package com.mixamus.currency.controller;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mixamus.currency.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CurrencyController {

    private CurrencyService currencyService;

    @GetMapping("currency")
    public String getCurrency(@RequestParam String data) throws UnirestException {
        String url = "https://api.privatbank.ua/p24api/exchange_rates?json&date=" + data;
        HttpResponse<String> response = Unirest
                .get(url)
                .asString();

        return response.getBody();
    }
}
