package com.chainsys.introduction;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     checkUserName();
	}
	public static void  checkUserName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String userName= sc.nextLine();
		sc.close();
		System.out.println("Name is"+ userName);
		char [] nameAscharacters = userName.toCharArray();
		int lengthOfCharArray=nameAscharacters.length;
		System.out.println("Length of your name is:"+ lengthOfCharArray);
        if (lengthOfCharArray>15){
        	System.out.println("Name must Not have more than 15 chars");
        }
        String nameInUppercase=userName.toUpperCase();
        nameInUppercase=nameInUppercase.trim();
        char[] uppercaseCharArray =nameInUppercase.toCharArray();
        int asciivalue=0;
        for(int index=0;index<lengthOfCharArray;) {
        	asciivalue =(int)uppercaseCharArray[index];
        	System.out.println("ACII :"+asciivalue);
        	if(asciivalue <65 || asciivalue>90);
        	  System.out.println("INVALIDNcharacter in Name:");
        	  return;
        }
	}
//System.out.println(index+" "+nameAscharacters[index]);
}
        	

        	

