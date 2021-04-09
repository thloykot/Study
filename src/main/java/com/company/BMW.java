package com.company;


public class BMW extends Car  {
    public BMW(String engine, String model, int price) {
        super(engine, model, price);
    }
    public Car Factory(String colour,String Model,int pricew){
        return new BMW(info(),Model,pricew);
    }
    public String info() {
        return  "BMW engine";
    }


}
