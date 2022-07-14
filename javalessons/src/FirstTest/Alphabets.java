package FirstTest;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		   AlphabetsPrint();
    }
    
    public static void AlphabetsPrint() 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Name:");
      String name=sc.nextLine();
      sc.close();
      
      String nameUpperCase=name.toUpperCase();
      System.out.println(nameUpperCase);
      char[] ch=nameUpperCase.toCharArray();
      int lengthofch=ch.length;
      int ascii=0;
      for(int index=0;index<lengthofch;index++)
      {
         ascii=(int)ch[index];
      }
      if(lengthofch<8)
      {
      System.out.println("Name must be more than  8 characters");
      return;
      }
      
      if((ascii>65)&&(90<ascii))
      {
      System.out.println("Name contains Only Alphabets");
      }
      else
      {
      System.out.println("Name should be alphabets");
      }

     }


	}


