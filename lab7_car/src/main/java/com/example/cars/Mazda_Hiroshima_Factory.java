package com.example.cars;
//создание автомобилей Mazda
class Mazda_Hiroshima_Factory implements CarFactory{
    @Override
    public Car createSUV(){
        return new SUV();
    }
    @Override
    public Car createConvertible(){
        return new Convertible();
    }

}
