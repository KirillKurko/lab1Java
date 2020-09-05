package com.company;

import classes.City;
import classes.WriterInfo;

public class Main {

    private static City[] createCities() {
        City[] cities = new City[5];
        cities[0] = new City("Minsk", 2_000_000, 350.4);
        cities[1] = new City("New York", 12_000_000, 980.2);
        cities[2] = new City("Hamburg", 750_000, 200.7);
        cities[3] = new City("London", 5_275_000, 620.5);
        cities[4] = new City("Oslo", 475_000, 510.3);
        return cities;
    }

    public static void main(String[] args) {
        City[] cities = createCities();
        for (City city: cities) {
            System.out.print("\n");
            WriterInfo.printCityInformation(city);
        }
        System.out.println("\n\n\nTotal information");
        WriterInfo.printCitiesInformation(cities);
    }
}
