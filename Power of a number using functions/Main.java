import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int result=power_of_number(n,m);
      System.out.println(result);
	}
  public static int power_of_number(int num,int pow){
    int result=1;
    for(int i=1;i<=pow;i++){
       result=result*num;
    }
    return result;
   
}
}