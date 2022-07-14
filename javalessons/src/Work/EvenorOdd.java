package Work;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x;
Scanner sc = new Scanner (System.in);
System.out.println("Enter an integer:");
x= sc.next();
if (x%2==0)
{
	System.out.println("Number is even.");
}
else
{
	System.out.println("Number is odd.");
}
	}

}
