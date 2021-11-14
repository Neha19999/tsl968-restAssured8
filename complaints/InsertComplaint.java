package com.usbank.complaints;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertComplaint {
	public static ArrayList<ComplaintDetails> loadDataFromCSV() {

		ArrayList<ComplaintDetails> complaints = new ArrayList<>();
		try {
			Scanner scan = new Scanner(new File("D:\\CSVDemo.csv"));
			String l = scan.nextLine();

			while (scan.hasNext()) {
				String line = scan.nextLine();
				String[] data = line.split(",");

				String date_received = data[0];
				String product = data[1];
				String sub_product = data[2];
				String issue = data[3];
				String sub_issue = data[4];
				String company = data[5];
				String state = data[6];
				String zip_code = data[7];
				String submitted_via = data[8];
				String date_sent_to_company = data[9];
				String company_response_to_consumer = data[10];
				String timely_response = data[11];
				String consumer_dispute = data[12];
				String complaint_ID = data[13];

				ComplaintDetails complts = new ComplaintDetails(date_received, product, sub_product, issue, sub_issue,
						company, state, zip_code, submitted_via, date_sent_to_company, company_response_to_consumer,
						timely_response, consumer_dispute, complaint_ID);
				complaints.add(complts);
			}

		} catch (FileNotFoundException ex) {
			System.out.println("file not found");
		}
		return complaints;
	}

}
