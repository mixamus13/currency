package com.mixamus.currency.controller;

import com.mixamus.currency.model.Currency;
import com.mixamus.currency.service.CurrencyService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("currencydate")
    public Currency getCurrencyByDate(@RequestParam("data")
                                      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                              LocalDate data) {
        return currencyService.getCurrencyByDate(data);
    }
}
