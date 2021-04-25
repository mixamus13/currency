package com.mixamus.currency.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Currency {

    @Id
    @GeneratedValue
    private LocalDate date;
    private String code;
    private Double rate;

    public Currency() {
    }

    public Currency(LocalDate date, String code, Double rate) {
        this.date = date;
        this.code = code;
        this.rate = rate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}