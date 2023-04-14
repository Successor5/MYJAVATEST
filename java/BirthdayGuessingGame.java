        import java.util.Scanner;

        public class BirthdayGuessingGame {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int month = 4;
                int year = 2017;

                boolean correctGuess = false;

                while (!correctGuess) {
                    System.out.print("Guess the day of the month: ");
                    int day = scanner.nextInt();

                    if (day == 14) {
                        System.out.println("Correct Guess");
                        correctGuess = true;
                    } else {
                        System.out.println("Incorrect Guess");
                    }
                }

                scanner.close();
            }
        }

