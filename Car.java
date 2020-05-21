package CarDealership;

//implementation after implements, after extends
//can implement as many interfaces as you want
public class Car extends Vehicle implements Leaseable, Discountable {

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

    // implementing methods from ILeaseable (interface leaseable)
    @Override
    public boolean isLeaseable() {
        return true;
    }

    @Override
    public int getLeaseTerm() {
        return 24;
    }

    @Override
    public int getMaxMilesPerYear() {
        return 15_000;
    }

    // implementing methods from IDiscountable
    // float and double numbers are followed by f or d to distinguish one from the
    // other; without f defaults to double; floats useful for pertcentages
    @Override
    public float getMaximumDiscountPct() {
        return 18.5f;
    }

    @Override
    public float getPersonDiscount() {
        return 12.5f;
    }

    @Deprecated
    public float getCorporateDiscount() {
        return 20.0f;
    }

}