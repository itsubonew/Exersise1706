import java.util.Scanner;

public class Calculater{
    public static void main(String[] args) throws Exception {

        double num1;
        double num2;
        String operation;
        while(true){


        Scanner input = new Scanner (System.in);

        System.out.println("Please type the first number");
        num1 = input.nextDouble();


        Scanner op = new Scanner (System.in);

        System.out.println("Choose an operation");
        System.out.println(" > Type + for addition");
        System.out.println(" > Type - for subtraction");
        System.out.println(" > Type * for multiplication");
        System.out.println(" > Type / for division");

        operation = op.next();

        System.out.println("Please type the second number");
        num2 = input.nextDouble();

        if(operation.equals("+")){
            System.out.println((num1 + num2));
        } else if ( operation.equals("-")){
            System.out.println((num1-num2));
        }else if ( operation.equals("*")){
            System.out.println((num1*num2));
        }else if ( operation.equals("/")){
            System.out.println((num1/num2));
        }

        Scanner ex = new Scanner (System.in);

        System.out.println("do you want to continue or exit?");
        String msg = ex.next(); 

        if (msg.equals("continue")){
            continue;
        }else if (msg.equals("exit")){
            System.out.println("Bye!");
            break;
        }

        
    }
}
}
