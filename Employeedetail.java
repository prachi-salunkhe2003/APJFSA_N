package firstproject;

public class Employeedetail {

	  // Member variables
	    private int EmpId;
	    private String EmpName;
	    private int EmpAge;
	    private double EmpSalary;

	    // Constructor
	    public  Employeedetail (int EmpId, String EmpName, int EmpAge, double EmpSalary) {
	        this.EmpId = EmpId;
	        this.EmpName = EmpName;
	        this.EmpAge = EmpAge;
	        this.EmpSalary = EmpSalary;
	    }

	    // Getter methods
	    public int getEmpId() {
	        return EmpId;
	    }

	    public String getEmpName() {
	        return EmpName;
	    }

	    public int getEmpAge() {
	        return EmpAge;
	    }

	    public double getEmpSalary() {
	        return EmpSalary;
	    }

	    // Method to display employee details
	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + EmpId);
	        System.out.println("Employee Name: " + EmpName);
	        System.out.println("Employee Age: " + EmpAge);
	        System.out.println("Employee Salary: " + EmpSalary);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        // Creating and displaying multiple Employee objects
	    	 Employeedetail  employee = new  Employeedetail (1, "Prachi Salunkhe", 21, 50000);
	        
	        System.out.println("Employee Details:");
	        employee.displayEmployeeDetails();
	       
	    }
	}


