import java.util.*;
public class NameModification {

	public static void main(String[] args) {
		int choices;
		int a;
		int b;
		int c;
		int count=0;
		boolean d;
		Scanner sc= new Scanner(System.in);
		System.out.println("Are You Ready for the Quiz?type true or false");
	        d= sc.nextBoolean();
		System.out.println("Okay here it come!");
        if(d)
        {
        	System.out.println("Q1) What is the capital of delhi? ");
        	System.out.println("1.Delhi\r\n"+ "2.Mumbai\r\n"+ "3.Chennai\r\n");
        	a=sc.nextInt();
        	if(a==1)
        	{
        		System.out.println("That's right");
        		a++;
        		count++;
        	}
        	else
        	{
        		System.out.println("incorrect");
        	}
        	
        	System.out.println("Q2) Can you store the value \"dog\" in a variable of type int? ");
        	System.out.println("1) Yes\r\n"+"2) No\r\n"+ "");
        	b=sc.nextInt();
        	if(b==2)
        	{
        		System.out.println("Correct");
        		b++;
        		count++;
        	}
        		else
        		{
        			System.out.println("Sorry dog is a String.int can only store numbers");
        		}
        	System.out.println("Q3) What is the result of 9+9/3? ");
        	System.out.println("1)5 /r /n 2)12 /r /n 3)15/r /n");
        	c=sc.nextInt();
        	if(c==2)
        	{
        		System.out.println("That's correct ");
        		c++;
        		count++;
        	}
        	else
        	{
        		System.out.println("your score is incorrect.12 is the right answer");
                }
        	  System.out.println(count +"out of 3");
     
              	System.out.println("Thanks for playing");
              }

	}
}
	