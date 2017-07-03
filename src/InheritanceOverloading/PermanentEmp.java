package InheritanceOverloading;

public class PermanentEmp extends Employee         
{
	int pl,sl,cl;      
	double basic,hra,pfa;        
	
	public PermanentEmp(int EmpId,String EmpName,int pl, int sl, int cl, double basic) 
	{
		
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.pl = pl;
		this.sl = sl;
		this.cl = cl;
		this.basic = basic;
	}
	//Overriding
	public void calculate_balance_leaves() 
	{	
		this.total_leaves = pl + sl + cl;
		
		System.out.println("Total Leaves of Employee :-"+total_leaves);     
		System.out.println("In which "+this.pl+" are of type paid, "+this.sl+" are of type sick, "+this.cl+" are of type casual.");
	}

	public boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
		if(type_of_leave=='p' || type_of_leave=='P')
		{
			if(no_of_leaves < pl)
				return true;
			else 
				return false;
		}
		
		if(type_of_leave=='s' || type_of_leave=='S')
		{
			if(no_of_leaves < sl)
				return true;
			else 
				return false;
		}
		
		if(type_of_leave=='c' || type_of_leave=='C')
		{
			if(no_of_leaves < cl)
				return true;
			else 
				return false;
		}	
		
		return false;
	}
	
	public void calculate_salary() 
	{
		pfa = (12 * basic)/100;
		hra = (50 * basic)/100;
		
		this.total_salary = basic + hra - pfa;  
		System.out.println("Total salary of Employee is "+total_salary); 
	}
}  
