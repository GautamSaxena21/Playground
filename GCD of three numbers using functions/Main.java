import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int result=gcd_number(a,b,c);
      System.out.println(result);
	}
  public static int gcd_number(int n1,int n2,int n3){
    int gcd=0,min,result=0;
    if(n1<n2)
      min=n1;
    else
      min=n2;
    while(min>=1){
      if((n1%min==0)&&(n2%min==0)){
        gcd=min;
        break;
      }
      min--;
    }
    result=gcd;
    if(result<n3){
      result=gcd;
    }
    return result;
  }
    
}
