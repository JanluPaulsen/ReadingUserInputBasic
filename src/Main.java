import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double numbers = 0;
        int i = 1;
        while (i <= 5) {
            try {
                System.out.println("Enter number #" + i);
                double enteredNumber = Double.parseDouble(userInput.nextLine());
                i++;
                numbers += enteredNumber;

            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println(numbers);
    }
}