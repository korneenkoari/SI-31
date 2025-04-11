package com.example.cars;
//создание автомобилей Tesla
 class Tesla_Freemont_Factory implements CarFactory{
     @Override
     public Car createSUV(){
         return new SUV();
     }
     @Override
     public Car createConvertible(){
         return new Convertible();
     }
}
