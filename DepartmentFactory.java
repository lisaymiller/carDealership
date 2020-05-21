package CarDealership;

public class DepartmentFactory {
    public static Department CreateDepartment(DepartmentNames name) {
        Department d = null;

        if (name == null) {
            return null;
        }

        switch (name) {
            case SERVICE:
                d = new ServiceDepartment();
            case SALES:
                d = new SalesDepartment();
            case FINANCE:
                d = new FinanceDepartment();
            default:
                break;
        }

        return d;
    }
}