package lab13;

import java.lang.Math;
import java.util.Scanner;

interface printExpression
{
public long print(int x,int y);
}

public class Ex1 
{
public static void main(String[] args) 
	{
	  printExpression pe=(x,y)->(int) Math.pow(x, y);
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the Value of X:");
			int x= input.nextInt();
			System.out.println("Enter the Value of Y:");
			int y= input.nextInt();
			long e= pe.print(x,y);
			System.out.println("The Value of " +x+ " ^ " +y+ " is "+e);
			input.close();
	}
}
