package com.example.springbootweek1;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty( name="deploy.env", havingValue = "development")
public class DevDB implements DB{

    public String getData(){
        return "dev db";
    }
}
