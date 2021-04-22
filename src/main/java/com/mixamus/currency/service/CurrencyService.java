package com.mixamus.currency.service;

import com.mixamus.currency.dto.CurrencyDto;
import com.mixamus.currency.model.Currency;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    private CurrencyDto currencyDto;

    public List<Currency> getAllCurrency() {
        return null;
//        return currencyDto.findAll();
    }
}
