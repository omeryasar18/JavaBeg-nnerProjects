package calculator;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthDesktopIconUI;

public class calculator {


    static int  addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
         int sum= number1+number2;
         return sum;

    }
    static double multiplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 number");
        double num1=scanner.nextDouble();
        double num2=scanner.nextDouble();

        double  mltp=num1*num2;
        return mltp;

    }

    static double division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 number");
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();
         double result=sayi1/sayi2;
         return result;
    }

    static double substraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 number");
        double num1=scanner.nextDouble();
        double num2=scanner.nextDouble();
        double result=num1/num2;

        return result;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, which operation do you want to use?");
        System.out.println("1) Addition, 2)Multiplication, 3)Division, 4) Substraction,");
        int option = scanner.nextInt();
        while (5 > option && option > 0) {
            switch (option) {
                case 1:
                    System.out.println(addition());
                    break;
                case 2:
                    System.out.println(multiplication());
                    break;
                case 3:
                    System.out.println(division());
                    break;
                case 4:
                    System.out.println(substraction());
                    break;
                default:
                    System.out.println("Please enter valid option number!");


            }
            System.out.println("Do you want to continue? ");
            System.out.println("1 for YES, 0 for NO");
            int contin=scanner.nextInt();
            if (contin==0){
                break;
            }
        }
    }

}
