package CarDealership;

//extends makes the E (element) limited to properties of Vehicle
//called "bounded type"

public class PendingSale<E extends Vehicle> {
    // generic class by using <E> as a standin for generic placeholder
    private E someVehicle;

    public PendingSale(E someVehicle) {
        this.someVehicle = someVehicle;
    }

    public E getSomeVehicle() {
        return this.someVehicle;
    }

    public void doSomePaperwork() {
        // do something here
    }
}