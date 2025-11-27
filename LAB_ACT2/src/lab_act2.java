public class lab_act2
{
    public static void main(String[] args) {

        int num1 = 21;
        int num2 = 9;

        // Basic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2; 
        double average = (num1 + num2) / 2.0; // average of two numbers

        // Formatted outputs
        System.out.printf("Number 1: %d\n", num1);
        System.out.printf("Number 2: %d\n\n", num2);

        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Difference: %d\n", difference);
        System.out.printf("Product: %d\n", product);
        System.out.printf("Quotient: %.2f\n", quotient);
        System.out.printf("Average: %.2f\n", average);  // formatted
    }
}
