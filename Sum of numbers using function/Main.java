import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int result=sum_of_digits(n);
      System.out.print(result);
	}
  public static int sum_of_digits(int n){
    int result=0;
    while(n!=0){
      result=result+n;
      n--;
    }
    return result;
}
}