package com.company;

public class Mercedes extends Car {
    public Mercedes(String engine, String model, int price) {
        super(engine, model, price);
    }
    public Car Factory(String colour,String Model,int pricew){
        return new BMW(info(),Model,pricew);
    }
    public String info() {
        return  "Mercedes engine";
    }
}
