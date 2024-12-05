import java.util.Scanner;
class vow{
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
		System.out.print("Enter char: ");
        
    
        
        char a = sc.next().charAt(0);
        switch(a) {
            case 'A':
                 System.out.println("vowel");
                break;
            case 'E':
                 System.out.println("vowel");
                break;
            case 'I':
                 System.out.println("vowel");
                break;
            case 'O':
                System.out.println("vowel");
                break;
            case 'U':
                System.out.println("vowel");

                break;
           
            default:
                System.out.println("Consonant");
                break;
        }
    }
}