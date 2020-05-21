package CarDealership;

public class Car extends Vehicle {

    // Simple Car constructor inheriting all the methods and properties of Vehicle
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }

    @Override // need to use get because private variable
    public double getTargetMargin() {
        return super.getTargetMargin() - 1000;
    }// use the getTargetMarigin method as its defined in our superclass (vehicle)
     // super class is parent class (look in notes-resources)
}