import java.util.*;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("Enter the number of subjects: ");
        int sub_no = sc.nextInt();

        int[] marks = new int[sub_no];
        
        for (int i = 0; i < sub_no; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
        }
		
		int total_marks = 0;
		for(int mark : marks){
		    total_marks += mark;
		}
		
		double avg_percentage = (double)total_marks/sub_no;
		
		char grade;
		if (avg_percentage >= 90) {
            grade = 'A';
        } else if (avg_percentage >= 80) {
            grade = 'B';
        } else if (avg_percentage >= 70) {
            grade = 'C';
        } else if (avg_percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

		
        System.out.println("\nTotal Marks: " + total_marks);
        System.out.println("Average Percentage: " + avg_percentage + "%");
        System.out.println("Grade: " + grade);
	}
}

