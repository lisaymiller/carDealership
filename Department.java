package CarDealership;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Department {
    private String deptName;
    private int numEmployees;

    public Department() {
        this.deptName = "Generic";
        this.numEmployees = 1;
    }

    public Department(String name, int numEmployees) {
        this.deptName = name;
        this.numEmployees = numEmployees;
    }

    // cycle though each deptarment in provided list and prints out whether or not
    // dept is open today
    public static void printIsOpen(List<Department> dept, LocalDateTime today) {
        for (Department d : dept) {
            System.out.println(d.toString() + " is open today? " + d.isOpenToday(today));
            // use instanceof keyword to test if an item in List is of a certain object or
            // data type
            if (d instanceof ServiceDepartment) {
                System.out.println(d.toString() + " only closes on Sundays.");
            }
        }
    }

    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString() {
        return this.deptName + "Department";
    }
}