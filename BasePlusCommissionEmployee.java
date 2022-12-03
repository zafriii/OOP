// Fig. 10.8: BasePlusCommissionEmployee.java

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base Salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base Salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earning() {
        return getBaseSalary() + super.earning();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "Base Salaried", super.toString(), "Base Salary", getBaseSalary());
    }

}
