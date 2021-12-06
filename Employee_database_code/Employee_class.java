
//blueprint class for structure 
public class Employee_class
{
	//instance variables
	private int employeeID;
	private String employeeName;
	private String employeeDesignation;
	private float employeeSalary;

	//parameterized constructor
	Employee_class(int eID, String eName, String eDesig, float eSalary)
	{
		employeeID = eID;
		employeeName = eName;
		employeeDesignation = eDesig;
		employeeSalary = eSalary;
	}

	void display_empDetails()
	{
		System.out.println("*******************************\n");

		System.out.println("Employee ID: "+employeeID);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Designation: "+employeeDesignation);
		System.out.println("Employee Salary: "+employeeSalary);
	}

	boolean search_emp_deatils(int eID)
	{
		if(eID == employeeID)
			return true;

		else
			return false;
	}

	void salaryIncrement(int eID)
	{
			employeeSalary *= 1.1;
			System.out.println("Employee slary inremented.")
			System.out.println("The employee details after slary increment is as follows:\n")
			display_empDetails(); 
 	}
}