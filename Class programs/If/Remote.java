import java.util.Scanner;
class Remote 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\t\t\tSelect the input");
		System.out.println("1.Power on");
		System.out.println("2.Power off");
        int num=sc.nextInt();

		System.out.print("\t\t\tProcessing.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".\n");


		if(num==1){
		System.out.println("Power on");
		}
		if (num==2)
		{
			System.out.println("Power off");
		}
		
		if (num>2 || num<1)
		{
			System.out.println("\t\t\tInvalid...");
		}
	}
}
