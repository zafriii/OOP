// Fig. 10.5: SalariedEmployee.java

public class SalariedEmployee extends Employee {
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly Salary must be >= 0.0");
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly Salary must be >= 0.0");
    }

    public double getWeeklySalary() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s%n%s: $%,.2f", super.toString(), "Weekly salary", getWeeklySalary());
    }

    @Override
    public double earning() {
        return 0;
    }
}
