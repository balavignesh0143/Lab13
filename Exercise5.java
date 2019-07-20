package lab13;

interface Printable1
{
 void print();
}

public class Exercise5 
{
public  void factorial()
{  
  int i,fact=1;  
  int num=5;                   
  for(i=1;i<=num;i++)
    {    
     fact=fact*i;    
	}    
     System.out.println("Factorial of the given Number is: "+fact);   
   }  
public static void main(String[] args) 
		{  
	        Exercise5 methodReference = new Exercise5(); 
	        Printable1 printable = methodReference::factorial ;  
	        printable.print();  
	      }
}