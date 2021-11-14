package com.usbank.complaints;

public class ComplaintDetails {
	private String date_received;
	private String product;
	private String sub_product;
	private String issue;
	private String sub_issue;
	private String company;
	private String state;
	private String zip_code;
	private String submitted_via;
	private String date_sent_to_company;
	private String company_response_to_consumer;
	private String timely_response;
	private String consumer_dispute;
	private String complaint_ID;

	public ComplaintDetails(String date_received, String product, String sub_product, String issue, String sub_issue,
			String company, String state, String zip_code, String submitted_via, String date_sent_to_company,
			String company_response_to_consumer, String timely_response, String consumer_dispute, String complaint_ID) {

		this.date_received = date_received;
		this.product = product;
		this.sub_product = sub_product;
		this.issue = issue;
		this.sub_issue = sub_issue;
		this.company = company;
		this.state = state;
		this.zip_code = zip_code;
		this.submitted_via = submitted_via;
		this.date_sent_to_company = date_sent_to_company;
		this.company_response_to_consumer = company_response_to_consumer;
		this.timely_response = timely_response;
		this.consumer_dispute = consumer_dispute;
		this.complaint_ID = complaint_ID;
	}

	public String getDateReceived() {
		return date_received;
	}

	public String getProduct() {
		return product;
	}

	public String getSubProduct() {
		return sub_product;
	}

	public String getIssue() {
		return issue;
	}

	public String getSubissue() {
		return sub_issue;
	}

	public String getCompany() {
		return company;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zip_code;
	}

	public String getSubmittedVia() {
		return submitted_via;
	}

	public String getDateSentToCompany() {
		return date_sent_to_company;
	}

	public String getCompanyResponseToConsumer() {
		return company_response_to_consumer;
	}

	public String getTimelyResponse() {
		return timely_response;
	}

	public String getConsumerDispute() {
		return consumer_dispute;
	}

	public String getComplaintID() {
		return complaint_ID;
	}

	@Override
	public String toString() {
		String result = "Complaint ID: " + this.complaint_ID + '\n' + "Product: " + this.product + "\n" + "Issue: "
				+ this.issue + "\n" + "Sub Issue: " + this.sub_issue + "\n" + "company: " + this.company + "\n"
				+ "Date Recieved: " + this.date_received + "\n" + "Send Date: " + this.date_sent_to_company + "\n"
				+ "Timely Response: " + this.timely_response + "\n" + "Company rresponse to consumer: "
				+ this.company_response_to_consumer + "\n" + "Submitted via: " + this.submitted_via + "\n";
		return result;
	}

}
