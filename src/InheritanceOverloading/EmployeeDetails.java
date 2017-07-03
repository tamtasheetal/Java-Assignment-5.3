package InheritanceOverloading;

public class EmployeeDetails
{
	public static void main(String[] args)   
	{
		//For Permanent Employee
		PermanentEmp FirstEmployee = new PermanentEmp(01, "Reema", 11, 2, 12, 20000);
		
		System.out.println("Details For The Permanent Employee :-");
		System.out.println("ID of The Employee "+FirstEmployee.EmpId);
		System.out.println("Name of The Employee : "+FirstEmployee.EmpName);
		
		if(FirstEmployee.avail_leave(3,'c'))
	    //Employee Applying for 3 days Leave
			System.out.println("Your Leave has Granted for 3 Days :- Type of Leave = casual_leave.");
		else
			System.out.println("Sorry, We can not Grant you Leave!");
		
		FirstEmployee.calculate_balance_leaves();
		FirstEmployee.calculate_salary();
		
		//For Temporary Employee
		TemporaryEmp SecondEmployee = new TemporaryEmp(02, "Pawan", 7, 15000);
		
		System.out.println("\n\nDetails For The Temporary Employee :-");
		System.out.println("ID of The Employee "+SecondEmployee.EmpId);
		System.out.println("Name of The Employee : "+SecondEmployee.EmpName);
		
		//Applying for 5 days leaves.
		if(SecondEmployee.avail_leave(05,'p'))
		{
			System.out.println("Your Leave has Granted for 05 Days.");
		}
		else
			System.out.println("Sorry, We can not Grant you Leave for five days!");
		
				SecondEmployee.calculate_balance_leaves();
			
				SecondEmployee.calculate_salary();		
				
	}    
}   