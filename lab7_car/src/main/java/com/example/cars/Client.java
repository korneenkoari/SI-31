package com.example.cars;

public class Client {
    private CarFactory carFactory;
    public Client(CarFactory carFactory){

        this.carFactory = carFactory;
    }
    public void createCars(){
        Car suv = carFactory.createSUV();
        Car convertible = carFactory.createConvertible();
        //создание авто
        suv.create();
        convertible.create();
    }
    public static void main(String[] args){
        //Создание фабрики мазда
        CarFactory mazda_hiroshima_factory = new Mazda_Hiroshima_Factory();
        Client client_mazda_hiroshima_factory = new Client(mazda_hiroshima_factory);
        System.out.println("Using Mazda Hiroshima Factory:");
        client_mazda_hiroshima_factory.createCars();
        //создание фабрики тесла
        CarFactory tesla_freemont_factory = new Tesla_Freemont_Factory();
        Client client_tesla_freemont_factory = new Client(tesla_freemont_factory);
        System.out.println("Using Tesla Freemont Factory:");
        client_tesla_freemont_factory.createCars();
    }
}
