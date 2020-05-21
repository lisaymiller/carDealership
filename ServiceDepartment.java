package CarDealership;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ServiceDepartment extends Department {
    // Constructor with deptName and numEmployees given

    public ServiceDepartment() {
        super("Service", 20);
    }

    // create "association" between vehicle and servicedepartment
    // very loose, lifetime of objects are independent of one another
    public boolean changeEngineOil(Vehicle v) {
        // because servicedepartment doesn't "own" the lifetime of the object its good
        // practice to ensure a valid object has been passed in
        if (v != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return false;
        } else {
            return true;
        }
    }

}