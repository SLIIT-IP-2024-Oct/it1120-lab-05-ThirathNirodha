import java.util.Scanner;
public class IT24104295Lab5Q2 {
     public static void main(String[] args) {
       Scanner n=new Scanner(System.in);
       System.out.print("Enter the number of new members introduced :- ");
       int value=n.nextInt();
       int m=value;
       if(value>=0){
          switch (value) {
             case 0:
                System.out.println();
               System.out.println("Prize is:- " +"No Prize");
               break;
            case 1:
                System.out.println();
               System.out.println("Prize is:- " +"Pen");
               break;
            case 2:
                System.out.println();
               System.out.println("Prize is:- " +"Umbrella");
               break;
            case 3:
                System.out.println();
               System.out.println("Prize is a:- " +"Bag");
               break;
            case 4:
                System.out.println();
                System.out.println("Prize is a:- " +"Travelling Chair");
                break;
            default:
                System.out.println();
                if (value >= 5) {
                   System.out.println("Prize is a:- " +"Headphone");
                   
                  }
                break;
           }
      }
        else{
          System.out.println(" Input must be a number 0 or greater ");
        }
    }
}