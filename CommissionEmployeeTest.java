public class CommissionEmployeeTest {

    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
                "Safa", "chowdhury", "221-134-011", 10000, .06);

        System.out.println("Employee information obtained by get method:");
        System.out.printf("%n%s %s%n", "First Name is", employee.getFirstName());
        System.out.printf("%n%s %s%n", "Last Name is", employee.getLastName());
        System.out.printf("%n%s %s%n", "Social Security Number is", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %s%n", "Gross Sales is", employee.getCommissionRate());
        System.out.printf("%n%s %s%n", "Commission Rate is", employee.getGrossSales());

        employee.setGrossSales(1000);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n", "Updated Employee Information obtained by toString", employee);
    }
}
