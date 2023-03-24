package com.abdessamadbelmadani.androidexam.buisness;

import com.abdessamadbelmadani.androidexam.beans.Currency;
import com.abdessamadbelmadani.androidexam.dao.CurrencyDao;
import com.abdessamadbelmadani.androidexam.dao.CurrencyMemoryDao;

import java.util.List;
import java.util.Vector;

public class DefaultServices implements Services{

    private CurrencyDao currencyDao;


    public DefaultServices(CurrencyDao currencyDao) {
        this.currencyDao = currencyDao;
    }


    @Override
    public double getValueComparedTo(String c1, String c2, double amount) {

        return currencyDao.getValueComparedTo(currencyDao.getValueByCode(c1),currencyDao.getValueByCode(c2),amount);
    }

    @Override
    public List<Currency> getAllCurrencies() {
        return currencyDao.getAllCurrencies();
    }

    @Override
    public Currency getValueByCode(String code) {
        return currencyDao.getValueByCode(code);
    }

    @Override
    public List<String> getCodes() {
        return currencyDao.getCodes();
    }
}
