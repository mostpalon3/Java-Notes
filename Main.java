import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter the first value: ");
       double firstValue = scanner.nextDouble();
       
       System.out.println("Enter the second value: ");
       double secondValue = scanner.nextDouble();
       
       System.out.println("Enter the Operation: ");
       String operationValue = scanner.next();
    }
    
    double result;
    switch(operationValue){
        case "+":
            result = firstValue + secondValue;
            break;
        default:
            System.out.println("Enter the correct value")
            return;
    }
    System.out.println(result);
}
