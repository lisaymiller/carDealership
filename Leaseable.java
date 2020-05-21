package CarDealership;

interface Leaseable {
    // interface names usually end in '-ible' or '-able'
    // usually use interfaces to provide additional capability
    boolean isLeaseable();

    int getLeaseTerm();

    int getMaxMilesPerYear();

    // get around public abstract methods by using default keyword
    // this enables you to not have to modify everything after adding a method to a
    // pre-established interface
    default float getMileablePenalty() {
        return 500.0f;
    }

}