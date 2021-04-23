package com.mixamus.currency.dto;

import com.mixamus.currency.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface CurrencyDto extends JpaRepository<Currency, Integer> {

    Currency getCurrencyByDate(Date data);
}
