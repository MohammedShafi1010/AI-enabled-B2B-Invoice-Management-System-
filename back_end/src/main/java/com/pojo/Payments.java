package com.pojo;

import java.sql.Date;

public class Payments {
	private Integer Sl_no; // yes
	private String Business_code;
	private String Cust_number;
	private String Clear_date;
	private Float Buisness_year;
	private Float Doc_id;
	//private String Posting_date;
	private Date Posting_date;
	

	private String Document_create_date;
	private String Document_create_date1;
	
	
	private String Due_in_date;
	
	private String Invoice_currency;
	private String Document_type;
	private Integer Posting_id;
	private String Area_business;
	private Double Total_open_amount;
	
	
	private String Baseline_create_date;
	private String Cust_payment_terms;
	
	
	private Integer Invoice_id;
	private Integer IsOpen;
	
	private String Aging_Bucket;
	private Integer Is_deleted;
	

	public Integer getSl_no() {
		return Sl_no;
	}


	public void setSl_no(Integer sl_no) {
		Sl_no = sl_no;
	}


	public String getBusiness_code() {
		return Business_code;
	}


	public void setBusiness_code(String business_code) {
		Business_code = business_code;
	}


	public String getCust_number() {
		return Cust_number;
	}


	public void setCust_number(String cust_number) {
		Cust_number = cust_number;
	}


	public String getClear_date() {
		return Clear_date;
	}


	public void setClear_date(String clear_date) {
		Clear_date = clear_date;
	}


	public float getBuisness_year() {
		return Buisness_year;
	}


	public void setBuisness_year(Float buisness_year) {
		Buisness_year = buisness_year;
	}


	public Float getDoc_id() {
		return Doc_id;
	}


	public void setDoc_id(Float doc_id) {
		Doc_id = doc_id;
	}


	/*public String getPosting_date() {
		return Posting_date;
	}


	public void setPosting_date(String posting_date) {
		Posting_date = posting_date;
	}*/
	
	
	public String getDocument_create_date() {
		return Document_create_date;
	}


	public Date getPosting_date() {
		return Posting_date;
	}


	public void setPosting_date(Date posting_date) {
		Posting_date = posting_date;
	}


	public void setDocument_create_date(String document_create_date) {
		Document_create_date = document_create_date;
	}


	public String getDocument_create_date1() {
		return Document_create_date1;
	}


	public void setDocument_create_date1(String document_create_date1) {
		Document_create_date1 = document_create_date1;
	}


	public String getDue_in_date() {
		return Due_in_date;
	}


	public void setDue_in_date(String due_in_date) {
		Due_in_date = due_in_date;
	}



	public String getInvoice_currency() {
		return Invoice_currency;
	}


	public void setInvoice_currency(String invoice_currency) {
		Invoice_currency = invoice_currency;
	}


	public String getDocument_type() {
		return Document_type;
	}


	public void setDocument_type(String document_type) {
		Document_type = document_type;
	}


	public Integer getPosting_id() {
		return Posting_id;
	}


	public void setPosting_id(Integer posting_id) {
		Posting_id = posting_id;
	}


	public String getArea_business() {
		return Area_business;
	}


	public void setArea_business(String area_business) {
		Area_business = area_business;
	}


	public Double getTotal_open_amount() {
		return Total_open_amount;
	}


	public void setTotal_open_amount(Double total_open_amount) {
		Total_open_amount = total_open_amount;
	}


	public String getBaseline_create_date() {
		return Baseline_create_date;
	}


	public void setBaseline_create_date(String baseline_create_date) {
		Baseline_create_date = baseline_create_date;
	}


	public String getCust_payment_terms() {
		return Cust_payment_terms;
	}


	public void setCust_payment_terms(String cust_payment_terms) {
		Cust_payment_terms = cust_payment_terms;
	}


	public Integer getInvoice_id() {
		return Invoice_id;
	}


	public void setInvoice_id(Integer invoice_id) {
		Invoice_id = invoice_id;
	}


	public Integer getIsOpen() {
		return IsOpen;
	}


	public void setIsOpen(Integer isOpen) {
		IsOpen = isOpen;
	}


	public String getAging_Bucket() {
		return Aging_Bucket;
	}


	public void setAging_Bucket(String aging_Bucket) {
		Aging_Bucket = aging_Bucket;
	}
	
	
	
	public Integer getIs_deleted() {
		return Is_deleted;
	}


	public void setIs_deleted(Integer is_deleted) {
		Is_deleted = is_deleted;
	}


	@Override
	public String toString() {
		return "Payments [ sl_no = " + Sl_no +
		"business_code = " + Business_code +
		"cust_number = " + Cust_number +
		"clear_date = " + Clear_date +
		"buisness_year = " + Buisness_year +
		"doc_id = " + Doc_id +
		"posting_date = " + Posting_date +
		"document_create_date = " + Document_create_date +
		"document_create_date1 = " + Document_create_date1 +
		"due_in_date = " + Due_in_date +
		
		"invoice_currency = " + Invoice_currency +
		"document_type = " + Document_type +
		"posting_id = " + Posting_id +
		"area_business = " + Area_business +
		"total_open_amount = " + Total_open_amount +
		
		
		
		
		"baseline_create_date = " + Baseline_create_date +
		"cust_payment_terms = " + Cust_payment_terms +
		
		"invoice_id = " + Invoice_id +
		"isOpen = " + IsOpen +
		
		 "Aging_Bucket =" + Aging_Bucket + 
		 "is_deleted = " + Is_deleted +"]";
		
	}
	
	  
}
