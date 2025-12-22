public class fibonacci{
  public int fib(int n){
    if(n<=0){
      return 0;}
    else if (n==1){
return 1;}
     else{
       return fib(n-1) +fib(n-2);}
  }  
  public static void main(String[] args){
  fibonacci f = new fibonacci();
  System.out.println(f.fib(0));
  System.out.println(f.fib(1));
}}
