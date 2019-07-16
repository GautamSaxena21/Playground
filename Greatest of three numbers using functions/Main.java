import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      greatest_number(a,b,c);
	}
  public static void greatest_number(int x,int y,int z){
    int result=0;
    if(x>y)
      result=x;
    else
      result=y;
    if(result>z)
      System.out.println(result);
    else
      System.out.println(z);
  }
}