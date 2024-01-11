package com.app.calculator;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBService implements DataService{
    @Override
    public int[] retriveData() {
        return new int[] {24,58,42,87,56};
    }
}
