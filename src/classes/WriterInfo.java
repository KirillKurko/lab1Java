package classes;

public class WriterInfo {

    public static void printCityName(City city) {
        System.out.println("Name: " + city.getName());
    }

    public static void printCityPopulation(City city) {
        System.out.println("Population: " + city.getPopulation());
    }

    public static void printCityArea(City city) {
        System.out.println("Area: " + city.getArea());
    }

    public static void printCityInformation(City city) {
       printCityName(city);
       printCityPopulation(city);
       printCityArea(city);
       System.out.print("\n");
    }

    public static void printCitiesTotalArea(City[] cities) {
        System.out.println("Cities total area: " +  CityInformationHelper.calculateTotalArea(cities));
    }

    public static void printMillionCitiesAmount(City[] cities) {
        System.out.println("Million cities amount: " + CityInformationHelper.calculateMillionCities(cities));
    }

    public static void printCitiesInformation(City[] cities) {
        printCitiesTotalArea(cities);
        printMillionCitiesAmount(cities);
        System.out.print("\n");
    }
}
