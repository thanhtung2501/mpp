package lab5.prob2;

public class VehicleFactory {
    public static Vehicle getVehicle(String name) throws Exception {
        if ("bus".equals(name)) {
            return new Bus();
        } else if ("truck".equals(name)) {
            return new Truck();
        } else if ("car".equals(name)) {
            return new Car();
        } else if ("electricCar".equals(name)) {
            return new ElectricCar();
        }

        throw new Exception("invalid vehicle");
    }
}
