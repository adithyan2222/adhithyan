public class cal{
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        double num1 = nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = nextDouble();
        
        double sum = num1 + num2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        
        scanner.close();
    }
}
