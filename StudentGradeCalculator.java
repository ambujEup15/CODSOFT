import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        int maximumMarks = 100;
        
        int subject1, subject2, subject3, subject4, subject5;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator!");
        System.out.println("Please enter the marks obtained for each subject (out of 100).");

        System.out.print("Enter marks for Subject 1: ");
        subject1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        subject2 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        subject3 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 4: ");
        subject4 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 5: ");
        subject5 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        double averagePercentage = (double) totalMarks / (5 * maximumMarks) * 100;

        System.out.println("Total Marks: " + totalMarks + " out of " + (5 * maximumMarks));
        System.out.println("Average Percentage: " + averagePercentage + "%");

        if (averagePercentage >= 90) {
            System.out.println("Grade: A+");
        } else if (averagePercentage >= 80) {
            System.out.println("Grade: A");
        } else if (averagePercentage >= 70) {
            System.out.println("Grade: B");
        } else if (averagePercentage >= 60) {
            System.out.println("Grade: C");
        } else if (averagePercentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
