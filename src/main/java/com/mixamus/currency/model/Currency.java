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
public class Currency {

    @Id
    @GeneratedValue
    private int id;
    private String date;
    private String bank;
    private int baseCurrency;
    private String baseCurrencyLit;
}

