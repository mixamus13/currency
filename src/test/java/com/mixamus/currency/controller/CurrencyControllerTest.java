package com.mixamus.currency.controller;

import com.mixamus.currency.model.Currency;
import com.mixamus.currency.service.CurrencyService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
@WebMvcTest
@DisplayName("Currency controller test by data")
class CurrencyControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CurrencyService currencyService;

    @Test
    @DisplayName("Should Currency when making GET request to endpoint /currencydate")
    public void shouldCurrencyByData() throws Exception {

        LocalDate localDate = LocalDate.of(2021, 7, 12);
        Currency currency = new Currency(localDate, "USD", 98.34);

        Mockito.when(currencyService.getCurrencyByDate(localDate))
                .thenReturn(currency);

        mvc.perform(MockMvcRequestBuilders.get("/currencydate/?data=2021-07-12"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", Matchers.is(3)))
                .andExpect(MockMvcResultMatchers.jsonPath("rate", Matchers.is(98.34)))
                .andExpect(MockMvcResultMatchers.jsonPath("code", Matchers.is("USD")));
    }

    @Test
    @DisplayName("Current controller is not null")
    public void getCurrencyControllerNotNull() throws Exception {

        mvc.perform(MockMvcRequestBuilders.get("/currencydate?data="))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }
}