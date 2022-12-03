package lesson3.labsolns.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private String name;
    private List<Building> buildings;

    public Landlord(String name) {
        this.name = name;
        this.buildings = new ArrayList<>();
    }

    public double calculateMonthlyProfit() {
        return this.buildings.stream()
                   .map(aBuilding -> aBuilding.calculateProfit())
                   .mapToDouble(Double::doubleValue)
                   .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public static void main(String[] args) {
        Landlord landlord = new Landlord("Tony");

        Apartment apartment1 = new Apartment("John");
        apartment1.setRentalFee(100);

        Apartment apartment2 = new Apartment("Young");
        apartment2.setRentalFee(200);

        Building building1 = new Building("First building");
        building1.getApartments().add(apartment1);
        building1.setMaintainCost(10);

        Building building2 = new Building("Second building");
        building2.getApartments().add(apartment2);
        building2.setMaintainCost(20);

        landlord.getBuildings().add(building1);
        landlord.getBuildings().add(building2);

        System.out.println("Monthly profit: " + landlord.calculateMonthlyProfit());
    }
}
