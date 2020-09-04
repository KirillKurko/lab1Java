package com.company;

public class Main {

    public static void main(String[] args) {
        City city = new City("Minsk", 20000000, 350);
        WriterInfo writerInfo = new WriterInfo();
        writerInfo.printCityInformation(city);
    }
}
