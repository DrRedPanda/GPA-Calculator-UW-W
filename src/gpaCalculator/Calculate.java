package gpaCalculator;
import java.util.*;
import javax.swing.*;

public class Calculate {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("GPA Calculator");
		System.out.println(" ");
		System.out.print("Please indicate your number of courses: ");
		int amount = s.nextInt();
		System.out.println(" ");
		Course[] courses = new Course[amount];
		for (int i = 0; i < amount; i++) {
			int count = i + 1;
			System.out.print("Grade Received in Course " + count + ": ");
			String dummy = s.nextLine();
			String grade = s.nextLine();
			System.out.print("Course weighting - college prep, honors, AP (CP, H, AP): ");
			String weight = s.nextLine();
			System.out.print("Credits Received for Course " + count + ": ");
			double cred = s.nextDouble();
			System.out.println(" ");
			courses[i] = new Course(grade, cred, weight);
		}
		double totalEarned = 0.0;
		double totalAttempted = 0.0;
		double totalWeightedEarned = 0.0;
		for (int j = 0; j < amount; j++) {
			totalEarned += courses[j].getEarned();
			totalAttempted += courses[j].getCredits();
			totalWeightedEarned += courses[j].getWeighted();
		}
		double gpa = totalEarned / totalAttempted;
		double wgpa = totalWeightedEarned / totalAttempted;
		System.out.println("Your unweighted GPA is " + gpa);
		System.out.println("Your weighted GPA is " + wgpa);
	}
}
