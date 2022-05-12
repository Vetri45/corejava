package FirstTest;

import java.util.Scanner;

public class CountStringReverse {
	public static void main(String[] args) {
        //countwords();
        reverseString();
}
public static void countwords()
{
        {
                String weekdays = "Tom and Jerry are good friends";
                
                String [] data = weekdays.split(" ");
                
                int count = data.length;
                System.out.println("Days count is " + count);
                
                for (int index=0; index<count; index++)
                {
                        System.out.print(data[index]);
                }
        }        
}
public static void reverseString()
{
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter a sentence");
                String first= "";
                String sentence ="";
                try {
                        sentence=sc.nextLine();
                }
                finally {
                        sc.close();
                }
                for(int i=sentence.length()-1;i>=0;i--)
                {
                        first=first+sentence.charAt(i);
                }
                System.out.println(first);
        }
}
}


