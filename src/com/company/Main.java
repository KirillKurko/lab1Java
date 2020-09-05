package com.company;

import classes.City;
import classes.WriterInfo;

public class Main {

    public static void main(String[] args) {
        City city = new City("Minsk", 20000000, 350);
        WriterInfo writerInfo = new WriterInfo();
        writerInfo.printCityInformation(city);
    }
}
