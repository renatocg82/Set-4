package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class AppSet_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scStr = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		Set<Student> stdSet = new HashSet<>();

		System.out.print("How many students for course A? ");
		int i = sc.nextInt();
		String tempName;
		for (int n = 1; n <= i; n = n + 1) {
			tempName = scStr.nextLine();
			stdSet.add(new Student(tempName));
		}

		System.out.print("How many Students for course B? ");
		i = sc.nextInt();
		for (int n = 1; n <= i; n = n + 1) {
			tempName = scStr.nextLine();
			stdSet.add(new Student(tempName));
		}

		System.out.print("How many Students for course C? ");
		i = sc.nextInt();
		for (int n = 1; n <= i; n = n + 1) {
			tempName = scStr.nextLine();
			stdSet.add(new Student(tempName));
		}

		System.out.println("Total students: " + stdSet.size());

		scStr.close();
		sc.close();
	}

}
