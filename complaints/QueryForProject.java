package com.usbank.complaints;

import java.util.ArrayList;
import java.util.Scanner;

public class QueryForProject {
	public static void main(String[] args) {

		System.out.println("program has started");
		ArrayList<ComplaintDetails> complaints = InsertComplaint.loadDataFromCSV();
		System.out.println("Data Loaded");
		QueryFunctionForProject userquery = new QueryFunctionForProject(complaints);

		do {
			int choice = 0;
			String menu = "Choose your query:\n" + "1)Display the Complaints in specific year\n"
					+ "2)Display the Complaints as per Bank Name\n" + "3)Display the Complaints as per complaint ID\n"
					+ "4)Display the Complaints If Timely Response is provided\n"
					+ "5)Display the Complaints For Closed/Closed With Explaination complaints\n" + "6)Exit\n"
					+ "Enter your choice :";

			System.out.print(menu);

			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter a Year: ");
				String year = scan.next();
				System.out.println("Data is ");
				userquery.displayYear(year);
				break;

			case 2:
				System.out.println("Enter the bank name ");
				String name = scan.next();
				System.out.println("Data is ");
				userquery.displayBankName(name);
				break;
			case 3:
				System.out.println("Enter the complaint ID ");
				String id = scan.next();
				System.out.println("Data is ");
				userquery.displayComplaintID(id);
				break;
			case 4:

				System.out.println("Data for timely responses ");
				userquery.displaytimelyResponse();
				break;

			case 5:

				System.out.println("Data For Closed/Closed With Explaination complaints is ");
				userquery.displayExplanation();
				break;

			default:
				System.out.println("Application exits");
				return;
			}
		} while (true);

	}

}
