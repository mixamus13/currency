package com.mixamus.currency.service;

import com.mixamus.currency.dto.CurrencyDto;
import com.mixamus.currency.model.Currency;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class CurrencyService {

    private final CurrencyDto currencyDto;

    public CurrencyService(CurrencyDto currencyDto) {
        this.currencyDto = currencyDto;
    }

    public Currency getCurrencyByDate(Date data) {
        return currencyDto.getCurrencyByDate(data);
    }
}
