import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = s.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = s.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = s.nextDouble();
        double r = 0;

        switch (op) {
            case '+': r = a + b; break;
            case '-': r = a - b; break;
            case '*': r = a * b; break;
            case '/': r = (b != 0) ? a / b : Double.NaN; break;
            default: System.out.println("Error! Invalid operator."); s.close(); return;
        }
        
        System.out.println("Result: " + r);
        s.close();
    }
}
