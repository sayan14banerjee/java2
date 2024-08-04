public class OverloadingDemo {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingDemo demo = new OverloadingDemo();

        // Call overloaded methods
        System.out.println("Sum of two integers: " + demo.add(2, 3)); // Calls add(int, int)
        System.out.println("Sum of three integers: " + demo.add(1, 2, 3)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + demo.add(2.5, 3.5)); // Calls add(double, double)
        System.out.println("Concatenation of two strings: " + demo.add("Hello, ", "world!")); // Calls add(String, String)
    }
}
