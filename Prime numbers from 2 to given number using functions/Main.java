import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime_numbers(n);
    }
  public static void prime_numbers(int n){
    int result=1;
    for(int i=2;i<=n;i++){
        if((i==2)||(i==3) || (i==5)|| (i==7)|| (i%2!=0) && (i%3!=0) && (i%5!=0) && (i%7!=0)){
          System.out.println(i);
        }
      
    }
  }
}
    