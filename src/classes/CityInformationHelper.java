package classes;

public class CityInformationHelper {

    static double calculateTotalArea(City[] cities) {
        double totalArea = 0.0;
        for (City city: cities) {
            totalArea += city.getArea();
        }
        return totalArea;
    }

    static int calculateMillionCities(City[] cities) {
        int millionCitiesAmount = 0;
        for (City city: cities) {
            if (city.getPopulation() >= 1_000_000) {
                ++millionCitiesAmount;
            }
        }
        return millionCitiesAmount;
    }
}
