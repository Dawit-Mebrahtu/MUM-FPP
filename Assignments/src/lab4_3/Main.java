package lab4_3;

import java.util.Scanner;

import lab3_2.employeeinfo.Employee;

public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		String n = System.getProperty("line.separator");
		displayOptions();
		String response = "Y";
		while (!response.equalsIgnoreCase("N")) {
			response = sc.nextLine();

			if (response.equalsIgnoreCase("A")) {

				formattedAccountInfo();

			} else if (response.equalsIgnoreCase("B")) {
				displayEmployees();

			} else if (response.equalsIgnoreCase("C")) {
				displayEmployees();
			} else {
				System.out.println(n + "I did not understand your response." + n);
				displayOptions();
			}
		}
		sc.close();
	}

	void formattedAccountInfo() {
		// loop through employees array and get formatted
		// account info for each employee, and assemble into a string
		String output = "";
		for (Employee employee : emps) {

			output += String.format("%nACCOUNT INFO FOR %s: %n %n", employee.getName());
			output += String.format("%s", employee.getFormattedAcctInfo());
		}

		System.out.println(output);
	}

	void displayOptions() {
		String n = System.getProperty("line.separator");
		String display = "A. See a report of all accounts." + n + "B. Make a deposti." + n + "C. Make a withdrawal." + n
				+ "Make a selection (A/B/C)";
		System.out.print(display);

	}

	void displayEmployees() {
		for (int i = 0; i < emps.length; i++) {
			System.out.println(i + ". " + emps[i].getName());
		}
		System.out.print("Select an employee: (type a number)");
	}

	void displayAccounts() {
		for (int i = 0; i < emps.length; i++) {
			System.out.println(i + ". " + emps[i].getName());
		}
		System.out.print("Select an employee: (type a number)");
	}
}
