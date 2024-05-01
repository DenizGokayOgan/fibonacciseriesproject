import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elementsNumber, cacheNumber, firstNumber=0, secondNumber=1;
        System.out.println("Welcome to Fibonacci Calculator!");

        System.out.print("Please enter number of elements: ");
        elementsNumber = input.nextInt();

        for(int index=0; index<=elementsNumber;index++){
            System.out.print(firstNumber+ " ");
            cacheNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = cacheNumber;
        }
    }
}