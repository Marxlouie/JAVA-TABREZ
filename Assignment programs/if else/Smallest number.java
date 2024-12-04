import java.util.Scanner;
class Asci
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\t\t\tSmallest number");
		System.out.println("a:");
		int a=sc.nextInt();
        System.out.println("b:");
		int b=sc.nextInt();

		If(a<b){
			System.out.println("Smallest number is:"+a);

	}else{ 
		System.out.println("Smallest number is :"+b);}
}
