import java.util.Scanner;
class larth
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tSargest number");
		System.out.print("a:");
		int a=sc.nextInt();
        System.out.print("b:");
		int b=sc.nextInt();
        System.out.print("c:");
		int c=sc.nextInt();

		
	if(a>b && a>c){

		if (b>c)
		{
			System.out.println("Sargest number is:"+b);
		}
		else
		{
			System.out.println("Sargest number is:"+c);
		}
			
	}
	else if(b>c){
			if (a>c)
		{
			System.out.println("Sargest number is:"+a);
		}
		else
		{
			System.out.println("Sargest number is:"+c);
		}
	     }
		 else {
			if (a>b)
		{
			System.out.println("Sargest number is:"+a);
		}
		else
		{
			System.out.println("Largest number is:"+b);
		}
		}
		
	}
}