// FullTime.java

// This class represents a full-time employee and extends the Employee abstract class.

// It also implements the TaxPayer interface to enforce tax-related functionalities.

public class FullTime extends Employee implements TaxPayer {


    // Instance variables specific to full-time employees.

    double salary;      // Stores the salary of the employee.

    String workPlace;   // Stores the name of the workplace.


    // Constructor for FullTime employees.

    // It initializes the employee's name, position, workplace, and salary.

    FullTime(String name, String position, String workPlace, double salary) {

        // Calls the constructor of the parent class Employee to initialize name and position.

        super(name, position);

        // Initializes FullTime-specific attributes.

        this.workPlace = workPlace;

        this.salary = salary;

    }


    // Overrides the abstract method printWorkPlace() from the Employee class.

    // Prints the workplace of the employee.

    void printWorkPlace() {

        System.out.println("Work at " + workPlace);

        // Example output: "Work at InfoTech"

    }


    // Overrides the abstract method calculateMonthlyIncome() from Employee.

    // Returns the salary since full-time employees have a fixed monthly income.

    double calculateMonthlyIncome() {

        return salary;

    }


    // Implements the calculateYearlyIncome() method from the TaxPayer interface.

    // Calculates yearly income by multiplying the monthly salary by 12.

    public double calculateYearLyIncome() {

        return 12 * salary;

    }


    // Implements the calculateTax() method from the TaxPayer interface.

    // Computes the tax amount based on the yearly income and applicable tax rate.

    public double calculateTax() {

        // Calls the inherited calculateTaxRate() method to get the tax rate for the yearly income.

        double taxRate = calculateTaxRate(calculateYearLyIncome());

        // Computes the total tax amount.

        double tax = taxRate * calculateYearLyIncome();

        return tax;

    }


    // Implements the payTax() method from the TaxPayer interface.

    // Prints the tax amount that the employee needs to pay.

    public void payTax() {

        System.out.println("Pay tax $" + calculateTax());

        // Example output: "Pay tax $19500.0"

    }


    // Overrides the printInfo() method from Employee.

    // Prints the employee's details, workplace, yearly income, and tax information.

    void printInfo() {

        super.printInfo();  // Calls the parent class printInfo() method to print name and position.

        printWorkPlace();   // Prints the workplace.

        System.out.println("Yearly income is " + calculateYearLyIncome());  // Prints yearly income.

        payTax();           // Calls payTax() to print the tax amount.

        System.out.println("--------------------");  // Prints a separator for readability.

    }




}
