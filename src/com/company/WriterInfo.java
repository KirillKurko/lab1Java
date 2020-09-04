package com.company;

public class WriterInfo {

    public void printCityName(City city) {
        System.out.println("Name: " + city.getName());
    }

    public void printCityPopulation(City city) {
        System.out.println("Population: " + city.getPopulation());
    }

    public void printCityArea(City city) {
        System.out.println("Area: " + city.getArea());
    }

    public void printCityInformation(City city) {
       printCityName(city);
       printCityPopulation(city);
       printCityArea(city);
    }
}
