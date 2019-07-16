import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int result=square_of_number(n);
      System.out.println(result);
	 // Type your code here   
	} 
  	public static int square_of_number(int n){
      int result=n*n;
      return result;
}
}