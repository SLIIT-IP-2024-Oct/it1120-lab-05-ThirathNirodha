import java.util.Scanner;
public class IT24104295Lab5Q1 {
    public static void main(String[] args) {
        int c1=1;
        int c2=2;
        int c3=3;
       Scanner n=new Scanner(System.in);
      System.out.print("Enter the " +c1+ " integer :- ");
      int a=n.nextInt();
      
      Scanner m=new Scanner(System.in);
      System.out.print("Enter the " +c2+ " integer :- ");
      int b=m.nextInt();
      
      Scanner v=new Scanner(System.in);
      System.out.print("Enter the " +c3+ " Integer :- ");
      int c=v.nextInt();
      System.out.println();
      
      if(a<b){
          if(a<c){
              System.out.println("User entered numbers are :- " +a+" "+b+" "+c);
              System.out.println("The smallest number :- " +a);
            }
          else{
              System.out.println("User entered numbers are :- " +a+" "+b+" "+c);
              System.out.println("The smallest number :- " +c);
             }
      } 
      else{
          if(b<c){
              System.out.println("User entered numbers are :- " +a+" "+b+" "+c);
              System.out.println("The smallest number:- " +b);
          }
          else{
              System.out.println("User entered numbers are :- " +a+" "+b+" "+c);
              System.out.println("The smallest number:- " +c);
          }
        }
      
      if(a>b){
          if(a>c){
              System.out.println("The largest number :- " +a);
          }
          else{
              System.out.println("The largest number:- " +c);
          }
      }
      else{
          if(b>c){
              System.out.println("The largest number :- " +b);
          }
          else{
              System.out.println("The largest number:- " +c);
          }
        }
      
    }
}