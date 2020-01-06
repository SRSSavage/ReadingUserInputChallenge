package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count != 11){
            System.out.println("Enter number # " + count + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count ++;
                if (count == 10){
                    break;
                }
            } else {
                System.out.println("You have entered an invalid value");
            }
            scanner.nextLine();
        }
        System.out.println("Your total is: " + sum);
        scanner.close();
    }
}
