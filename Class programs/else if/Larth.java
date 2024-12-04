import java.util.Scanner;
class larth
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tLargest number");
		System.out.print("a:");
		int a=sc.nextInt();
        System.out.print("b:");
		int b=sc.nextInt();
        System.out.print("c:");
		int c=sc.nextInt();

		
	if(a>b && a>c){
		System.out.println("Largest number is:"+a);
			
	}
	else if(b>a && b>c){
			System.out.println("Largest number is :"+b);
	     }
		 else {
			 System.out.println("Largest number is:"+c);
		}
		
	}
}