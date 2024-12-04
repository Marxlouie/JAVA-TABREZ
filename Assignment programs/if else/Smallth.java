import java.util.Scanner;
class Smallth
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tSmallest number");
		System.out.println("a:");
		int a=sc.nextInt();
        System.out.println("b:");
		int b=sc.nextInt();
        System.out.println("c:");
		int c=sc.nextInt();

		
	if(a<b && a<c){
		System.out.println("Smallest number is:"+a);
			
	}
	else
		{
		 if(b<a && b<c){
			System.out.println("Smallest number is :"+b);
	     }
		 else{
			 System.out.println("Smallest number is:"+c);
		}
		}
	}
}