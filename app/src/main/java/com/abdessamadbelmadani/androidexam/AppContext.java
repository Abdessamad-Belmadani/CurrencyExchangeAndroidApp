package com.abdessamadbelmadani.androidexam;

import android.app.Application;

import com.abdessamadbelmadani.androidexam.buisness.DefaultServices;
import com.abdessamadbelmadani.androidexam.buisness.Services;
import com.abdessamadbelmadani.androidexam.dao.CurrencyMemoryDao;

public class AppContext extends Application{

        private Services services;
        @Override
        public void onCreate() {
            super.onCreate();
            services=new DefaultServices(new CurrencyMemoryDao());
        }

        public Services getServices() {
            return services;
        }
    }

