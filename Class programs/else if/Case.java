import java.util.Scanner;
class case
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tCase finding");
		System.out.print("Enter element:");
		char ch=sc.next().charAt(0);

		
	if(Character.isUpperCase(ch)){

		System.out.println("Uppercase");
			
	}
	if(Character.isLowerCase(ch)){

		System.out.println("Lowercase");
			
	}
	
	
		
	}
}
