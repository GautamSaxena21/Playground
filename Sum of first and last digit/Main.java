import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code hereint number, first_digit, last_digit;
      Scanner in=new Scanner(System.in);
		int number = in.nextInt();	
      	int sum=0;
		
		int a = number;
		while(a >= 10)
		{
			a= a/ 10;
		}	
		
		int b = number % 10;
       sum=a+b;
      System.out.println(sum);
    }
}
