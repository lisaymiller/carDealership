package CarDealership;

import java.time.LocalDateTime;

public class SalesDepartment extends Department {
    public SalesDepartment() {
        super("Sales", 50);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        return true; // sales always open
    }
}