package com.abdessamadbelmadani.androidexam.buisness;

import com.abdessamadbelmadani.androidexam.beans.Currency;

import java.util.List;

public interface Services {

    double getValueComparedTo(String c1, String c2, double amount);
    List<Currency> getAllCurrencies();
    Currency getValueByCode(String code);

    List<String> getCodes();
}
