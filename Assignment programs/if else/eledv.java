import java.util.Scanner;
class Divi
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tDivisible by 11");
		System.out.println("Enter number:");
		int a=sc.nextInt();
        
		
	if(a%11==0){
		System.out.println(a+" is divisible  by 11");
			
	}
	else
		{
			
	System.out.println(a+" is not divisible by 11");
		}
	
	}
}
