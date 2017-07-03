package InheritanceOverloading;

public class TemporaryEmp extends Employee 
{	
	public TemporaryEmp(int EmpId,String EmpName,int total_leaves,double total_salary)
	{
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.total_leaves=total_leaves;
		this.total_salary=total_salary;
	}

	public void calculate_balance_leaves() 
	{
		System.out.println("Total Leaves of The Employee :-"+total_leaves);
	}

	public boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
	
		if(type_of_leave=='l' || type_of_leave=='L')
		{
			if(no_of_leaves < total_leaves)
				return true;
		}
		
		return false;
	}
	public void calculate_salary() 
	{
		System.out.println("Total Salary of Employee :-"+total_salary);   
	}
}   
