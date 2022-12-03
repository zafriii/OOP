// Fig. 10.7: CommissionEmployee.java

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales must be >= 0.0");

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be >0.0 and  1.0");

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales must be >=0.0");

        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be >0.0 and  1.0");

        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earning() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "Commission Employee", getFirstName(), getLastName(),
                "Social Security Number", getSocialSecurityNumber(), "Gross Sales", getGrossSales(),
                "Commission Rate", getCommissionRate());
    }

    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
                "safa", "chowdhury", "221-134-011", 10000, .06);

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