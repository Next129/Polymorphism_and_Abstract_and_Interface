// This abstract class serves as a blueprint for employee types such as FullTime and PartTime employees.

public abstract class Employee {


    // Instance variables to store the name and position of the employee.

    // These are package-private (default access) and can be accessed by subclasses in the same package.

    String name; 

    String position;


    // Abstract method to calculate the monthly income of an employee.

    // Subclasses must implement this method to provide specific calculations.

    abstract double calculateMonthlyIncome();


    // Abstract method to print the workplace of an employee.

    // This ensures all subclasses define how the workplace should be displayed.

    abstract void printWorkPlace();


    // Constructor for the Employee class.

    // It initializes the name and position variables with the values provided during object creation.

    public Employee(String name, String position) {

        this.name = name;        // Assigns the provided name to the instance variable.

        this.position = position; // Assigns the provided position to the instance variable.

    }


    // Method to calculate the tax rate based on the employee's salary.

    // This method is not abstract, meaning subclasses can use it directly without overriding.

    double calculateTaxRate(double salary) {

        // Determines the tax rate based on predefined salary brackets.

        if (salary <= 200000)  

            return 0.0;   // No tax for salaries up to 200,000.

        else if (salary <= 400000)  

            return 0.05;  // 5% tax for salaries between 200,001 and 400,000.

        else if (salary <= 600000)  

            return 0.1;   // 10% tax for salaries between 400,001 and 600,000.

        else if (salary <= 800000)  

            return 0.15;  // 15% tax for salaries between 600,001 and 800,000.

        else  

            return 0.2;   // 20% tax for salaries above 800,000.

    }


    // Method to print the basic information of the employee.

    // This method prints the employee's name and position in a formatted way.

    void printInfo() {

        System.out.println(name + " is a " + position); 

        // Example output: "John Doe is a Manager"

    }

}