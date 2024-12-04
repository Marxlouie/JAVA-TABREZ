import java.util.Scanner;
class per 
{   
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Enter Percentage:");
		double n=sc.nextDouble();
        if (n>100 || n<0)
        {
			System.out.println("Invalid");
        }
		else if (n>70)
		{
			System.out.println("Distinction");
		}
        else if (n<70 && n>60)
        {
			System.out.println("First Class");
        }
		else if (n<60 && n>50)
		{
			System.out.println("Second class");
		}
		else if (n<50 && n>35)
		{
			System.out.println("Pass");
		}
		else if (n<35)
		{
			System.out.println("Fail");
		}
	}
}
