package FirstTest;

import java.util.Scanner;

public class Temperature {
	  public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter The Raining or Not_raining...?");
	   String string1 =sc.nextLine();
	   
	   if(string1.contains("Raining"))
	   {
	   System.out.println("Get an Umbrella with you");
	    
	    }
	   else if(string1.contains("Not_raining"))
	   {
	           System.out.println(" ---Walk Safe---");
	           return;
	   }
	   System.out.println("Enter The Today Temperature:");
	   int temp =sc.nextInt();
	   sc.close();
	   if (temp<32)
	   {
	         System.out.println("---Temperature is Havy So Bring a Heavy Jacket---");  
	   }
	   else if((temp==32)||(temp<50))
	   {
	           System.out.println("---Temperature is Normal So Bring a Light Jacket---");   
	   }

	   else
	   {
	           System.out.println("---Temperature is very low So No Using of Jacket---");  
	   }
	}
}
