package classes;

public class City {
    private String name;
    private double population;
    private double area;

    public City() {
        name = "";
        population = 0.0;
        area = 0.0;
    }

    public City(String name, double population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public City(City city) {
        name = city.name;
        population = city.population;
        area = city.area;
    }

    public String getName() {
        return name;
    }

    public double getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
