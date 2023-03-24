package com.abdessamadbelmadani.androidexam.dao;

import com.abdessamadbelmadani.androidexam.beans.Currency;

import java.util.List;

public interface CurrencyDao {

    double getValueComparedTo(Currency c1,Currency c2,double amount);
    List<Currency> getAllCurrencies();
    Currency getValueByCode(String code);
    List<String> getCodes();

}
