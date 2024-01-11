package com.app.calculator;


import org.springframework.stereotype.Component;

@Component
public class MysqlDataService implements DataService{
    @Override
    public int[] retriveData() {
        return new int[] {5,56,78,12,36};
    }
}
