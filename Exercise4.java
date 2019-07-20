package lab13;

interface Printable
{  
    void print();  
}  

public class Exercise4 
{  
	int empid;
	String empname;
	public Exercise4() 
	{
	
	}
  public Exercise4(int empid, String empname) 
    {
		this.empid=empid;
		this.empname=empname;
	}
    public void saySomething()
    {  
        System.out.println("Hello, this is class with main");  
    }  
    public int getempId() 
    {
		return empid;
	}
    public void setempId(int empid)
	{
		this.empid =empid;
	}
    public String getempName() 
	{
		return empname;
	}
    public void setempName(String empname)
	{
		this.empname =empname;
	} 
	public static void main(String[] args) 
	{  
        Exercise4 methodReference = new Exercise4(); 
        Printable printable = methodReference::saySomething;  
        printable.print();  
      }
}  