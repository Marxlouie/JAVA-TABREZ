
class Testm 
{
	public static void main(String[] args) 
	{    double a=55.3;
	     //double-->long
		 long res1=(long) a;
		 //long-->int
		 int res2=(int) res1;
		System.out.println("double:"+a);
		System.out.println("long:"+res1);
		System.out.println("int:"+res2);
	}
}
class Testm2 
{
	public static void main(String[] args){


	   float a=55.3f;
	     //double-->long
		 int res1=(int) a;
		 //long-->int
		 short res2=(short) res1;
		 byte res3=(byte) res2;
		//System.out.println("float:"+a);
		//System.out.println("int:"+res1);
		//System.out.println("short:"+res2);
		//System.out.println("byte:"+res3);
	}
}


