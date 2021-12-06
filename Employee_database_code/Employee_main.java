
//main class for calling and building.
import java.util.Scanner;

public class Employee_main
{
	public static void main(String[] args) 
	{
		//initializations
		Scanner sc = new Scanner(System.in);

		int choice = 1, emp_size, emp_id, menu_option; 
		String emp_name, emp_desig;
		float emp_salary;
		

		//Employee data updation only once - not menu driven
		System.out.println("****Employee details entry****\n");
		System.out.println("How many employee data have to be recorded?");
		emp_size = sc.nextInt();

		Employee_class e_obj[] = new Employee_class[emp_size]; //creting array of objects(to the Employee_class) for that size entered

		for(int i = 0; i<emp_size; i++)
		{
			System.out.println("*******************************************************\n");
			System.out.println("Employee "+""+(i+1)+" ID: ");
			emp_id = sc.nextInt();

			System.out.println("Employee "+""+(i+1)+" Name: ");
			emp_name  = sc.next();

			System.out.println("Employee "+""+(i+1)+" Designation: ");
			emp_desig  = sc.next();

			System.out.println("Employee "+""+(i+1)+" Salary: ");
			emp_salary = sc.nextFloat();	

			e_obj[i] = new Employee_class(emp_id, emp_name, emp_desig, emp_salary);
		}

		//menu options starts from here
		while(choice == 1)
		{
			System.out.println("*****************************************************************************************\n");
			System.out.println("Please select the operation:\n1: Display\n2: Search\n3: Salary Increment\n");
			menu_option = sc.nextInt();

			switch(menu_option)
			{	
				case 1 : //displaying
				{
					System.out.println("Printing all the employees data from the database");

					for(int i = 0; i<emp_size; i++)
					{
						System.out.println("\n\n****Number:"+(i+1)+"****");
						e_obj[i].display_empDetails();
					}
					break;
				}

				case 2: //seach and display
				{
					int emp_id_search, search_flag = 0; 
					System.out.println("Please enter the employee ID to print the details of the employee");
					emp_id_search = sc.nextInt();

/*					Employee_class obj = new Employee_class();
					obj.search_emp_deatils(emp_id_search);*/
					for(int i = 0; i<emp_size; i++)
					{
						if(e_obj[i].search_emp_deatils(emp_id_search))
						{
							System.out.println("Value of i: "+i);
							e_obj[i].display_empDetails();
							search_flag = 1;
							break;
						}
					}

					if(search_flag == 0)
						System.out.println("***\nNo employee found in the database***");

					break;
				}

				case 3://salary 10% increment 
				{
					int emp_id_search;
					System.out.println("Enter the employee ID to increment the salary of the employee");
					emp_id_search = sc.nextInt();

					for(int i = 0; i<emp_size; i++)
					{
						if (e_obj[i].search_emp_deatils(emp_id_search))
							e_obj[i].salaryIncrement(emp_id_search);
					}
				}
			}

			//loop for menu driven choice
			System.out.println("\nDo you want to continue? 1/0\n");
			choice = sc.nextInt();
		}
	}
}