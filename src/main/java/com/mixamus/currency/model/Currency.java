package com.mixamus.currency.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Currency {

    @Id
    @GeneratedValue
    private Integer id;
    private String code;
    private Double rate;
    private Date date;

    public Currency() {
    }

    public Currency(Integer id, String code, Double rate, Date date) {
        this.id = id;
        this.code = code;
        this.rate = rate;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public Double getRate() {
        return rate;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(id, currency.id) && Objects.equals(code, currency.code) && Objects.equals(rate, currency.rate) && Objects.equals(date, currency.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, rate, date);
    }
}