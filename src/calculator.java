import java.util.Scanner;


public class calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Result: "+result);
    }

    public static int getInt(){
        System.out.println("Enter number:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("You made a mistake when entering a number. Try again.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Enter operation:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You made a mistake when entering an operation. Try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Operation not recognized. Re-enter.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}