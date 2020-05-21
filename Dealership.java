package CarDealership;

// import java.time.LocalDateTime;
// import java.util.ArrayList;
// import java.util.List;

public class Dealership {
    public static void main(String[] args) {

        Leaseable lease = new Car("123456789a", 33000.0, 42000.00, 2019, "Chevrolet", "Impala", "White",
                VehicleClassification.NEW);

        // Number of months to lease: 24
        System.out.println("Number of months to lease: " + lease.getLeaseTerm());

        // // instanciate new object for each dept
        // ServiceDepartment sd = new ServiceDepartment();
        // FinanceDepartment fd = new FinanceDepartment();
        // SalesDepartment sales = new SalesDepartment();

        // // add dept to a list
        // List<Department> depts = new ArrayList<>();
        // depts.add(sd);
        // depts.add(fd);
        // depts.add(sales);

        // Department.printIsOpen(depts, LocalDateTime.now());
    }

}