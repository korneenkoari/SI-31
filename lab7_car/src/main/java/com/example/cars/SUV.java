package com.example.cars;

 class SUV implements Car {
  //реализация метода из интерфейса Car
  @Override
  public void create(){
   System.out.println("Creating an SUV");
  }
}
