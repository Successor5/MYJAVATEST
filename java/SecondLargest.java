import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter multiple numbers separated by spaces: ");
        String number = input.nextLine();

        String[] numbersArr = number.split(" ");
        int[] numbers = new int[numbersArr.length];

        for (int i = 0; i < numbersArr.length; i++) {
            numbers[i] = Integer.parseInt(numbersArr[i]);
        }

        Arrays.sort(numbers);
        int secondLargest = numbers[numbers.length - 2];

        System.out.println("The second largest number is: " + secondLargest);
    }
}
