import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
 Scanner Scan = new Scanner(System.in);
 System.out.print("Enter an interger: ");
 int num = Scan.nextInt();
  if (!(num >= 5) && (num <= 76)) {
   System.out.println("True");
 }
else {
  System.out.println("False");
}


  }
  }