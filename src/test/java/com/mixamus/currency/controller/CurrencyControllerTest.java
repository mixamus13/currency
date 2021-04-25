package com.mixamus.currency.controller;

import com.mixamus.currency.dao.CurrencyDao;
import com.mixamus.currency.model.Currency;
import com.mixamus.currency.service.CurrencyService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = CurrencyController.class)
class CurrencyControllerTest {

    @InjectMocks
    private CurrencyController currencyController;

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CurrencyService currencyService;

    @MockBean
    private CurrencyDao currencyDao;

    @Test
    @DisplayName("Should Currency when making GET request to endpoint /currencydate")
    void shouldCurrencyByData() throws Exception {

        LocalDate localDate = null;
        Currency currency = new Currency(localDate, "USD", 98.34);

        Mockito.when(currencyService.getCurrencyByDate(localDate))
                .thenReturn(currency);

        mvc.perform(MockMvcRequestBuilders.get("/currencydate"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", Matchers.is(1)));
    }

    @Test
    public void shouldReturnMessageFromService() throws Exception {
        when(currencyService.getCurrencyByDate(LocalDate.of(2021, 12, 13))).thenReturn(new Currency());
        this.mvc.perform(get("/currencydate"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @DisplayName("Current controller is not null")
    public void getCurrencyControllerNotNull() {
        assertThat(currencyController)
                .isNotNull();
    }
}