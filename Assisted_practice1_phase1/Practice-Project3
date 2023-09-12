package constr_uctor;
class MethodsDemo {
    // Method with no parameters and no return value (void)
    public void sayHello() {
        System.out.println("Hello from sayHello method!");
    }

    // Method with parameters and a return value
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Static method with parameters and a return value
    public static double divide(double dividend, double divisor) {
        if (divisor != 0) {
            return dividend / divisor;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Not-a-Number
        }
    }
}

    
public class Constructor {
	public static void main(String[] args) {
        MethodsDemo demo = new MethodsDemo(); // Create an instance of MethodsDemo

        // Calling instance (non-static) methods
        demo.sayHello(); // Call the sayHello method with no arguments
        int sum = demo.add(5, 3); // Call the add method with two arguments
        System.out.println("Sum: " + sum);

        // Calling static methods (no need to create an instance)
        double result = MethodsDemo.divide(10.0, 2.0); // Call the static divide method
        System.out.println("Division result: " + result);

        // Calling methods in expressions
        int a = 5;
        int b = 7;
        int total = demo.add(a, b) * 2; // You can call methods as part of an expression
        System.out.println("Total: " + total);
    }
}


