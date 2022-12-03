package lesson3.labsolns.prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Building {
    private String name;
    private double maintainCost;
    private List<Apartment> apartments;

    public Building(String name) {
        this.name = name;
        this.apartments = new ArrayList<>();
    }

    public double calculateProfit() {
        if (apartments == null || apartments.size() == 0) return 0;

        Double sum = apartments.stream()
                               .map(item -> item.getRentalFee())
                               .mapToDouble(Double::doubleValue)
                               .sum();
        return sum - maintainCost;
    }

    public double getMaintainCost() {
        return maintainCost;
    }

    public void setMaintainCost(double maintainCost) {
        this.maintainCost = maintainCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }
}
