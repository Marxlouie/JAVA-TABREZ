import java.util.Scanner;
class mov{
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
		System.out.println("\t\t\tSelect the input ");
		System.out.println("1.Pushpa\n2.Vikram\n3.Leo");
        int n = sc.nextInt();
        switch(n) {
            case 1:
                 System.out.println("\t\t\tSelect the Actor: ");
			     System.out.println("1.Allu arjun\n2.Rashmika");
				  int a = sc.nextInt();
				  switch(a) {
					   case 1:System.out.println("34");break;
					   case 2:System.out.println("26");break;
					   default :
			  System.out.println("Invalid input");
            break;
				  }
                 break;
			 case 2:
                 System.out.println("\t\t\tSelect the Actor: ");
			     System.out.println("1.Kamal Hassan\n2.Vijay sethupahty");
				  int b = sc.nextInt();
				  switch(b) {
					   case 1:System.out.println("65");break;
					   case 2:System.out.println("55");break;
				default :
			  System.out.println("Invalid input");
            break;	   
				  }
                 break;	 
			 case 3:
                 System.out.println("\t\t\tSelect the Actor: ");
			     System.out.println("1.Vijay\n2.Trisha");
				  int c= sc.nextInt();
				  switch(c) {
					   case 1:System.out.println("50");break;
					   case 2:System.out.println("46");break;
					   default :
			  System.out.println("Invalid input");
            break;
				  }
                 break;	 
		  default :
			  System.out.println("Invalid input");
            break;
           
            
        }
    }
}




	



