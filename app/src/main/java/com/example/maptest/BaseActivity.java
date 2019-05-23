package com.example.maptest;

import androidx.appcompat.app.AppCompatActivity;

import com.example.maptest.utils.RetrofitInstance;
import com.example.maptest.utils.WebService;

public class BaseActivity extends AppCompatActivity {

    public WebService getWebService() {
        return RetrofitInstance.getInstance().create(WebService.class);
    }
}
