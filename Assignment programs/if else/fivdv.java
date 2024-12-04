import java.util.Scanner;
class Divi
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tDivisible by 5");
		System.out.println("Enter number:");
		int a=sc.nextInt();
        
		
	if(a%5==0){
		System.out.println(a+" is divisible  by 5");
			
	}
	else
		{
			
	System.out.println(a+" is not divisible by 5");
		}
	
	}
}