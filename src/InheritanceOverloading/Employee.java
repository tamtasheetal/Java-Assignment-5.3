package InheritanceOverloading;

public abstract class Employee
{
	int EmpId;         
	String EmpName;      
	int total_leaves;      
	double total_salary;     
	
	public abstract void calculate_balance_leaves();     
	
	public abstract boolean avail_leave(int no_of_leaves, char type_of_leave);    
	
	public abstract void calculate_salary();         
} 
