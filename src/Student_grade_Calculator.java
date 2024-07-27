import java.util.Scanner;
public class Student_grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSub = sc.nextInt();
        double[] marks = new double[numSub];
        for (int i = 0; i < numSub; i++) {
            while (true) {
                System.out.print("Enter the mark for subject " + (i + 1) + " (out of 100): ");
                double mark = sc.nextDouble();
                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid mark. Please enter a value between 0 and 100.");
                }
            }
        }
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        double avgPercent = totalMarks / numSub;
        String grade;
        if (avgPercent >= 90) {
            grade = "A+";
        } else if (avgPercent >= 80) {
            grade = "A";
        } else if (avgPercent >= 70) {
            grade = "B";
        } else if (avgPercent >= 60) {
            grade = "C";
        } else if (avgPercent >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%%n", avgPercent);
        System.out.println("Grade: " + grade);
    }
}






