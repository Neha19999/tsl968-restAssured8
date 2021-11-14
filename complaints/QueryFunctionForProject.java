package com.usbank.complaints;

import java.util.ArrayList;

public class QueryFunctionForProject {
	private ArrayList<ComplaintDetails> complaints;

	public QueryFunctionForProject(ArrayList<ComplaintDetails> complaints) {
		this.complaints = complaints;
	}

	public void displayYear(String year) {
		for (int i = 0; i < complaints.size(); i++) {
			String yr = year.substring(2);
			String dateRecieved = complaints.get(i).getDateReceived();

			if (dateRecieved.endsWith(yr)) {
				System.out.println(complaints.get(i));
			}
		}
	}

	public void displayBankName(String Bank) {
		for (int i = 0; i < complaints.size(); i++) {

			String bank = complaints.get(i).getCompany();
			if (bank.equalsIgnoreCase(Bank)) {
				System.out.println(complaints.get(i));
			}
		}
	}

	public void displayComplaintID(String ID) {

		for (int i = 0; i < complaints.size(); i++) {

			String cid = complaints.get(i).getComplaintID();
			if (cid.equalsIgnoreCase(ID)) {
				System.out.println(complaints.get(i));
			}
		}
	}

	public void displaytimelyResponse() {
		for (int i = 0; i < complaints.size(); i++) {

			String timeres = complaints.get(i).getTimelyResponse();
			if (timeres.equalsIgnoreCase("yes")) {
				System.out.println(complaints.get(i));
			}
		}
	}

	public void displayExplanation() {
		for (int i = 0; i < complaints.size(); i++) {

			String closedexp = complaints.get(i).getCompanyResponseToConsumer();
			if (closedexp.equalsIgnoreCase("closed") || closedexp.equalsIgnoreCase("Closed with explanation")) {
				System.out.println(complaints.get(i));
			}
		}
	}

}
