package CarDealership;

public class LightTruck extends Vehicle {
    private long towingCapacity, grossCombinedWeight, truckWeight;

    private boolean is4wd;

    public TransferCase xferCase;

    // Simple LightTruck constructor inheriting all the methods and properties of
    // Vehicle
    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass, long towingCapacity, long truckWeight, boolean is4wd) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.towingCapacity = towingCapacity;
        this.truckWeight = truckWeight;
        this.is4wd = is4wd;
        this.grossCombinedWeight = this.towingCapacity + this.truckWeight;

        if (this.is4wd == true) {
            this.xferCase = new TransferCase();
        }
    }

    // Getters
    public long getTowingCapacity() {
        return towingCapacity;
    }

    public long getTruckWeight() {
        return truckWeight;
    }

    public long getGrossCombinedWeight() {
        return grossCombinedWeight;
    }

    public boolean getIs4wd() {
        return is4wd;
    }

    // Setters
    public void setTowingCapacity(long towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public void setTruckWeight(long truckWeight) {
        this.truckWeight = truckWeight;
    }

    public void setGrossCombinedWeight() {
        this.grossCombinedWeight = this.truckWeight + this.towingCapacity;
    }

    public void setGrossCombinedWeight(long grossCombinedWeight) {
        this.grossCombinedWeight = grossCombinedWeight;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }

    @Override // difference with overloading and overriding; overriding is redefining a method
              // we are inheriting and overloading is using a method with the same name in
              // multiple ways/with different context
    public String toString() {
        // get the string output from our default superclass method
        // if it is 4wd, add 4wd to output
        String str = super.toString();
        if (is4wd) {
            str += ", (4WD)";
        }
        return str;
    }

    // class within a class
    public class TransferCase {
        private int numGears;

        public TransferCase() {
            this.numGears = 4;
        }

        public TransferCase(int gears) {
            this.numGears = gears;
        }

        public int getNumGears() {
            return this.numGears;
        }
    }
}