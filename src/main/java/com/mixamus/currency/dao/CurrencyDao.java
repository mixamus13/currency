package com.mixamus.currency.dao;

import com.mixamus.currency.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface CurrencyDao extends JpaRepository<Currency, Integer> {

    Currency getCurrencyByDate(LocalDate data);
}
