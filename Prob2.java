import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){
  Scanner Scan = new Scanner(System.in);
  System.out.print("Please enter the First interger: ");
  int num1 = Scan.nextInt();
  System.out.print("Please enter the Second interger: ");
  int num2 = Scan.nextInt();
  if ((num1 >= 0) && (num2 >= 0)){
    System.out.print("Both are positive or zero.");
  }
  else{
    System.out.print("One or both are negative.");  
  }
  }
  
  }