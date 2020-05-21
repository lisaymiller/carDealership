package CarDealership;

interface Leaseable {
    // interface names usually end in '-ible' or '-able'
    // usually use interfaces to provide additional capability
    boolean isLeaseable();

    int getLeaseTerm();

    int getMaxMilesPerYear();

}