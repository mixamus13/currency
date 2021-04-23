package com.mixamus.currency.service;

import com.mixamus.currency.dao.CurrencyDao;
import com.mixamus.currency.model.Currency;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CurrencyService {

    private final CurrencyDao currencyDao;

    public CurrencyService(CurrencyDao currencyDao) {
        this.currencyDao = currencyDao;
    }

    public Currency getCurrencyByDate(LocalDate data) {
        return currencyDao.getCurrencyByDate(data);
    }
}
