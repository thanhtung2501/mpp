package lab5.prob2.test;

import lab5.prob2.VehicleFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        VehicleFactory.getVehicle("bus").startEngine();
        VehicleFactory.getVehicle("truck").startEngine();
        VehicleFactory.getVehicle("car").startEngine();
        VehicleFactory.getVehicle("electricCar").startEngine();
        VehicleFactory.getVehicle("invalid").startEngine();
    }
}
