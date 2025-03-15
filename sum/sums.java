import java.util.*;
public class sum{
public static void main(String args[]){
    Scanner Scanner = new Scanner(System.in);
    System.out.println("enter the number");
    int number = Scanner.nextInt();
    int sum = 0;
    while(number!= 0){
        int sums = number % 10;
        sum += sum;
        number /=10;
    }
    System.out.println("the sum of the digits is: "+sum);
}

}