package calculator;

import java.util.Scanner;

public class Calculator1 {

 public static void main(String[] args) {

    int option,a,b,c;
    boolean decision;
    System.out.println("We are here to create a calculator");
    System.out.print("Do you want to switch on the calculator:");
    @SuppressWarnings("resource")
	Scanner yogi = new Scanner(System.in);
    decision = yogi.nextBoolean();
    do {
        System.out.println("Following operations are available to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter the operations do you want to perform:");
        option = yogi.nextInt();
        System.out.println("Choice of operation is:"+option);

        switch(option) {
        
        case 1:
            System.out.println("Enter two numbers to be added:");
            a = yogi.nextInt();
            b = yogi.nextInt();
            c = a + b;
            System.out.print("Addition:"+c);
            break;

        case 2:
            System.out.println("Enter two numbers to be subtracted:");
            a = yogi.nextInt();
            b = yogi.nextInt();
            c = a - b;
            System.out.print("subtracted:"+c);
            break;

        case 3:
            System.out.println("Enter two numbers to be multiplied:");
            a = yogi.nextInt();
            b = yogi.nextInt();
            c = a * b;
            System.out.print("multiplied:"+c);
            break;

        case 4:
            System.out.println("Enter two numbers to be divided:");
            a = yogi.nextInt();
            b = yogi.nextInt();
            c = a / b;
            System.out.print("divided:"+c);
            break;

        default:
            System.out.println("This is a wrong choice");
            break;
        }
    }while(decision==true);
  }
}
        

