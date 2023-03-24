package com.abdessamadbelmadani.androidexam.dao;

import com.abdessamadbelmadani.androidexam.beans.Currency;

import java.util.List;
import java.util.Vector;


public class CurrencyMemoryDao implements CurrencyDao{

    private List<Currency> currencyList;

    public CurrencyMemoryDao() {
        this.currencyList = new Vector<Currency>();
        this.currencyList.add(new Currency("MAD",0.1));
        this.currencyList.add(new Currency("USD",1));
        this.currencyList.add(new Currency("EURO",1.4));
        this.currencyList.add(new Currency("DAZ",0.0012));
        this.currencyList.add(new Currency("GBP",1.7));
        this.currencyList.add(new Currency("JPY",0.0000124));
        this.currencyList.add(new Currency("QAR",0.4));
        this.currencyList.add(new Currency("SAR",0.354));
    }

    @Override
    public double getValueComparedTo(Currency c1, Currency c2,double amount) {

        return amount * (c1.getValue() / c2.getValue());
    }

    @Override
    public List<Currency> getAllCurrencies() {
        return currencyList;
    }

    @Override
    public Currency getValueByCode(String code) {

        for(Currency c:currencyList){
            if(c.getCode().equals(code)){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<String> getCodes() {
        List<String> codes=new Vector<String>();
        for(Currency c:currencyList){
            codes.add(c.getCode());
        }
        return codes;
    }
}
