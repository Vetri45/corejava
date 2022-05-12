package com.chainsys.strings;

import java.util.Scanner;

public class StringLessonA {

public static void lessonOne() {

String firstString ="ChainSys";
    System.out.println(firstString);
    char dataOne[] = new char[]{'C','h','a','i','n'};
    String secoundString = new String(dataOne);
    System.out.println(secoundString);
    String thirdString = new String(new char[]{'C','h','a','i','n'});
    System.out.println(thirdString);

}
public static void lessonTwo() {
String firstString = "Hello";
String secondString = "Hello";
String thirdString = "Hello";
int firstNumber =100;
int secondNumber = 100;
int thirdNumber = 100;
System.out.println(firstString);
System.out.println(secondString);
firstString = "Welcome";
System.out.println(firstString);
System.out.println(secondString);

}
public static void creatingStringInaForLoop() {
for(int count=0;count<10;count++){
String s1 = "Hello";
}
}
public static void stringToChararray() {
java.util.Scanner scanner = new java.util.Scanner(System.in);
System.out.println("Enter a Word");
String firstString = scanner.nextLine();
scanner.close();
int stringlength = firstString.length();
System.out.println("Length"+stringlength);
char[] data = firstString.toCharArray();
int dataarraylength = data.length;
System.out.println("Length"+dataarraylength);
}
public static void stringToUpperLower() {
java.util.Scanner scanner = new java.util.Scanner(System.in);
System.out.println("Enter a Word");
String firstString = scanner.nextLine();
scanner.close();
System.out.println(firstString);
String stringUppercase = firstString.toUpperCase();
System.out.println("stringUppercase:"+stringUppercase);

System.out.println("s1="+firstString);
String stringLowercase = firstString.toLowerCase();
System.out.println("stringLowercase:"+stringLowercase);
System.out.println("s2="+firstString);

String subString = firstString.substring(2,6);
System.out.println(subString);

subString = firstString.substring(2,6);
System.out.println(subString);

String replacedString = firstString.replace('a','e');
System.out.println(replacedString);

boolean flag1 = firstString.equals(stringUppercase);
System.out.println(flag1);

boolean flag = firstString.equalsIgnoreCase(stringUppercase);
System.out.println(flag);

}
public static void testStringTrim() {
String secondString = "  Hope           it     rain   ";
System.out.println("Before Trim:"+secondString.length());
secondString =secondString.trim();
System.out.println("After Trim:"+secondString.length());
}
public static void testSplit() {
String firstString = "Tom and Jerry are good friends";
String trimedString =firstString.trim();
String[] data = trimedString.split(" " );
int count = data.length;
System.out.println("Word Count"+count);
for (int index =0;index <count;index++) {
System.out.println(data[index]);
}
}
public static void testSplitDays() {
String firstString = "Mon;Tue;Thu;Fri;Sat;Sun";
String trimedString =firstString.trim();
String[] data = trimedString.split(";" );
int count = data.length;
System.out.println("Word Count"+count);
for (int index =0;index <count;index++) {
System.out.println(data[index]);
}
}
public static void reverse()
    {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a sentence");
            String sentence="";
            String sentenceA="";
            try
            {
                    sentence=scanner.nextLine();
            }
            finally
            {
                    scanner.close();
            }
            char[] charSentence=sentence.toCharArray();
            for(int index=charSentence.length-1; index>=0; index-- )
            {
                    sentenceA=sentenceA+charSentence[index];
            }
            System.out.println(sentenceA);
    }
public static void verifystring(String s1) {
if(null == s1) {
System.out.print("String is Null");
return;
}
else {
System.out.println("String is Not Null:"+s1);
}
if(!s1.isEmpty()) {
System.out.println("\t Not Empty:"+s1);
}
else {
System.out.println("\t String is Empty");
}
}

}

