package calculator;
import java.util.Scanner;

public class Calculator {
 
 
	public static void main(String[] args) {
		
 		 char operator;
 		 Double number1,number2 ,result;
 		 
 		 Scanner scan=new Scanner(System.in);
 		 
 		 
 		 
 		 System.out.println("Choose the operator: + , - , * , % , or /");
 		 
// 		 while(!scan.hasNext("[A-Za-z0-9]")) {
// 			 
// 			 System.out.println("Invalid operator");
// 			 scan.next();
// 			 operator = scan.next().charAt(0);
// 		 }
 		 
         operator = scan.next().charAt(0);
 		 
 		 System.out.println("Enter the value of number1");
 		 number1 = scan.nextDouble();
 		 
 		 System.out.println("Enter the value of number2");
		 number2 = scan.nextDouble();
		 
		 
		 
		 
		 switch(operator) {
		 
//		 default:
//				System.out.println("Invalid Operator");
//				break;
		 
		 
		 
		 
		 case '+':
			 result=number1+number2;
			 System.out.println(number1+"+"+number2+"="+result);
			 break;
			 
		 case '-':
			 result=number1-number2;
			 System.out.println(number1+"-"+number2+"="+result);
			 break;
		
		 case '*':
			 result=number1*number2;
			 System.out.println(number1+"*"+number2+"="+result);
			 break;
			 
		 case '/':
			 result=number1/number2;
			 System.out.println(number1+"/"+number2+"="+result);
			 break;
			 
		 case '%':
			 result=number1%number2;
			 System.out.println(number1+"%"+number2+"="+result);
			 break;
			 
//		 default:
//			System.out.println("Invalid Operator");
//			break;
		 }
		 
		scan.close();
	}

}
