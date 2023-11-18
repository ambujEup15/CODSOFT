import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        delay(1000);
        System.out.println("Welcome to Programming Quiz!! ");
        delay(1000);
        System.out.println("\n");
        System.out.println("You get 10 seconds to answer each question!! ");
        delay(1000);
        System.out.println("\n");
        System.out.println("Here is your first question!! ");
        delay(1000);
        System.out.println("\n");
        System.out.println("Enter you answer and press Enter key within 10sec to answer the question ");
        System.out.println("\n");
        delay(1000);
        String a = "1. Who invented Java language ?";
        System.out.println(a);
        String[][] b = {
                { "A. James Gosling " },
                { "B. GV Rossum" },
                { "C. Dennis Ritchie" } };
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i][0]);
        }

        int correct = 0;
        int incorrect = 0;
        long startTime = System.currentTimeMillis();

        System.out.println("Select the correct option : ");
        String c = scanner.next();

        long elapsedTime = System.currentTimeMillis() - startTime;

        if (elapsedTime <= 10000) {
            if (c.equalsIgnoreCase("A")) {
                System.out.println("Correct answer \n");
                correct++;
            } else {
                System.out.println("Incorrect answer");
                incorrect++;
            }
        } else {
            System.out.println("Time's up! you are not able to answer in time \nHere is your next question \n");

        }
        delay(1000);
        String d = "2. When was Java invented ?";
        System.out.println(d);
        String[][] e = {
                { "A. 1994 " },
                { "B. 1995" },
                { "C. 1996" } };
        for (int j = 0; j < 3; j++) {
            System.out.println(e[j][0]);
        }
        startTime = System.currentTimeMillis();
        System.out.println("Select the correct option : ");
        String f = scanner.next();
        elapsedTime = System.currentTimeMillis() - startTime;

        if (elapsedTime <= 10000) {
            if (f.equalsIgnoreCase("B")) {
                System.out.println("Correct answer \n");
                correct++;
            } else {
                System.out.println("Incorrect answer\n");
                incorrect++;
            }
        } else {
            System.out.println("Time's up! you are not able to answer in time \nHere is your next question \n ");

        }
        delay(1000);

        String g = "3. Which is the most popular programming language ?";
        System.out.println(g);
        String[][] h = {
                { "A. Python " },
                { "B. JavaScript" },
                { "C. C++\n" } };
        for (int k = 0; k < 3; k++) {
            System.out.println(h[k][0]);
        }
        startTime = System.currentTimeMillis();
        System.out.println("Select the correct option : ");
        String l = scanner.next();
        elapsedTime = System.currentTimeMillis() - startTime;
        if (elapsedTime <= 10000) {
            if (l.equalsIgnoreCase("B")) {
                System.out.println("Correct answer \n");
                correct++;
            } else {
                System.out.println("Incorrect answer \n");
                incorrect++;
            }
        }

        else {
            System.out.println("Time's up! you are not able to answer in time \n ");

        }
        delay(1000);

        System.out.printf("Correct answers: %d%n", correct);
        System.out.printf("Incorrect answers: %d%n", incorrect);
        System.out.println("\n");
        System.out.println("THANK YOU FOR PLAYING ");

        scanner.close();
    }

    private static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException z) {
            z.printStackTrace();
        }
    }

}
