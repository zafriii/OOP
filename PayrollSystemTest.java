// Fig. 10.9: PayrollSystemTest.java

public class PayrollSystemTest 
{
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Safa", "chowdhury", "221-134-011", 800.5);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Saima", "chowdhury", "2211-134-001", 800.5, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Mrs", "X", "221-134-022", 1000, 0.6);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Mrs", "y", "213-134-005", 5000,0.6,300);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earning());
        System.out.printf("%s%n%s: $%,.2f%n%n",hourlyEmployee, "earned", hourlyEmployee.earning());
        System.out.printf("%s%n%s: $%,.2f%n%n",commissionEmployee, "earned", commissionEmployee.earning());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earning());

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee; 
        employees[1] = hourlyEmployee; 
        employees[2] = commissionEmployee; 
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        for ( Employee currentEmployee : employees ) 
        {
            System.out.println( currentEmployee );
            if ( currentEmployee instanceof BasePlusCommissionEmployee ) 
            {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee ;
                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary( 1.10 * oldBaseSalary );
                System.out.printf( "new base salary with 10%% increase is: $%,.2f\n",employee.getBaseSalary() );
            }
            System.out.printf( "earned $%,.2f\n\n", currentEmployee.earning() );}
            for ( int j = 0; j < employees.length; j++ )
            System.out.printf( "Employee %d is a %s\n", j, employees[ j ].getClass().getName() ); 
    }
}
