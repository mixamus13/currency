package com.mixamus.currency.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode
@Entity
public class ExchangeRate {

    @Id
    @GeneratedValue
    private int id;
    private String baseCurrency;
    private String currency;
    private double saleRateNB;
    private double purchaseRateNB;
}
