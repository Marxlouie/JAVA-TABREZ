import java.util.Scanner;
class Evod
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tCheck Leap year");
		System.out.println("Enter number:");
		int a=sc.nextInt();
        
		
	if (a%4==0 && a%100==0 || a%400==0)
	{ System.out.println(a+" is a leap year");
	}
	else{
		
		
		System.out.println(a+" is not a leap year");
			
	}
	
	}
}

