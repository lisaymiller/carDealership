package CarDealership;

interface Discountable {
    // in interfaces methods are by default public and abstract
    float getMaximumDiscountPct();

    float getPersonDiscount();

    float getCorporateDiscount();

}