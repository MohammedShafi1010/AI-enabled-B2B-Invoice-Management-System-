package com.myPOJO;

public class Payment {
	private Integer Id;
	
	private Integer Sl_no; // yes
	private String Business_code;
	private Integer Cust_number;
	private String Clear_date;
	private Integer Buisness_year;
	private String Doc_id;
	private String Posting_date;
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
	private Byte IsOpen;
	private String Aging_Bucket;
	private Byte Is_deleted;
	
	
	
	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}
	
	


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


	public Integer getCust_number() {
		return Cust_number;
	}


	public void setCust_number(Integer cust_number) {
		Cust_number = cust_number;
	}


	public String getClear_date() {
		return Clear_date;
	}


	public void setClear_date(String clear_date) {
		Clear_date = clear_date;
	}


	public Integer getBuisness_year() {
		return Buisness_year;
	}


	public void setBuisness_year(Integer buisness_year) {
		Buisness_year = buisness_year;
	}


	public String getDoc_id() {
		return Doc_id;
	}


	public void setDoc_id(String doc_id) {
		Doc_id = doc_id;
	}


	public String getPosting_date() {
		return Posting_date;
	}


	public void setPosting_date(String posting_date) {
		Posting_date = posting_date;
	}


	public String getDocument_create_date() {
		return Document_create_date;
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


	public Byte getIsOpen() {
		return IsOpen;
	}


	public void setIsOpen(Byte isOpen) {
		IsOpen = isOpen;
	}


	public String getAging_Bucket() {
		return Aging_Bucket;
	}


	public void setAging_Bucket(String aging_Bucket) {
		Aging_Bucket = aging_Bucket;
	}


	public Byte getIs_deleted() {
		return Is_deleted;
	}


	public void setIs_deleted(Byte is_deleted) {
		Is_deleted = is_deleted;
	}
	
	
	
	
	
	
	

	public Payment(Integer sl_no, String business_code, Integer cust_number, String clear_date, Integer buisness_year,
			String doc_id, String posting_date, String document_create_date, String document_create_date1,
			String due_in_date, String invoice_currency, String document_type, Integer posting_id, String area_business,
			Double total_open_amount, String baseline_create_date, String cust_payment_terms, Integer invoice_id,
			Byte isOpen, String aging_Bucket, Byte is_deleted) {
		super();
		Sl_no = sl_no;
		Business_code = business_code;
		Cust_number = cust_number;
		Clear_date = clear_date;
		Buisness_year = buisness_year;
		Doc_id = doc_id;
		Posting_date = posting_date;
		Document_create_date = document_create_date;
		Document_create_date1 = document_create_date1;
		Due_in_date = due_in_date;
		Invoice_currency = invoice_currency;
		Document_type = document_type;
		Posting_id = posting_id;
		Area_business = area_business;
		Total_open_amount = total_open_amount;
		Baseline_create_date = baseline_create_date;
		Cust_payment_terms = cust_payment_terms;
		Invoice_id = invoice_id;
		IsOpen = isOpen;
		Aging_Bucket = aging_Bucket;
		Is_deleted = is_deleted;
	}


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
/*
package com.myPOJO;

import java.sql.Date;

public class Payment {
	
	private Integer Sl_no; // yes
	private String Business_code;
	private Integer Cust_number;
	private Integer Buisness_year;
	private String Doc_id;
	private String Invoice_currency;
	private String Document_type;
	private Integer Posting_id;
	private String Area_business;
	private Double Total_open_amount;	
	private String Cust_payment_terms;
	private Integer Invoice_id;
	private Byte IsOpen;
	private String Aging_Bucket;
	private Byte Is_deleted;
	
	private String Clear_date;
	private String Posting_date;
	private String Document_create_date;
	private String Document_create_date1;	
	private String Due_in_date;
	private String Baseline_create_date;
	
	
	private Date Clear_date;
	private Date Posting_date;
	private Date Document_create_date;
	private Date Document_create_date1;	
	private Date Due_in_date;
	private Date Baseline_create_date;
	





	public Payment(int int1, String string, int int2, String string2, int int3, String string3, String string4,
			String string5, String string6, String string7, String string8, String string9, int int4, String string10,
			double double1, String string11, String string12, int int5, byte byte1, String string13, byte byte2) {
		// TODO Auto-generated constructor stub
	}



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



	public Integer getCust_number() {
		return Cust_number;
	}



	public void setCust_number(Integer cust_number) {
		Cust_number = cust_number;
	}



	




	public Integer getBuisness_year() {
		return Buisness_year;
	}



	public void setBuisness_year(Integer buisness_year) {
		Buisness_year = buisness_year;
	}



	public String getDoc_id() {
		return Doc_id;
	}



	public void setDoc_id(String doc_id) {
		Doc_id = doc_id;
	}
	
	/*
	
	public Date getClear_date() {
		return Clear_date;
	}



	public void setClear_date(Date clear_date) {
		Clear_date = clear_date;
	}
	
	
	public Date getPosting_date() {
		return Posting_date;
	}



	public void setPosting_date(Date posting_date) {
		Posting_date = posting_date;
	}



	public Date getDocument_create_date() {
		return Document_create_date;
	}



	public void setDocument_create_date(Date document_create_date) {
		Document_create_date = document_create_date;
	}



	public Date getDocument_create_date1() {
		return Document_create_date1;
	}



	public void setDocument_create_date1(Date document_create_date1) {
		Document_create_date1 = document_create_date1;
	}



	public Date getDue_in_date() {
		return Due_in_date;
	}



	public void setDue_in_date(Date due_in_date) {
		Due_in_date = due_in_date;
	}
	
	public Date getBaseline_create_date() {
		return Baseline_create_date;
	}



	public void setBaseline_create_date(Date baseline_create_date) {
		Baseline_create_date = baseline_create_date;
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



	public Byte getIsOpen() {
		return IsOpen;
	}



	public void setIsOpen(Byte isOpen) {
		IsOpen = isOpen;
	}



	public String getAging_Bucket() {
		return Aging_Bucket;
	}



	public void setAging_Bucket(String aging_Bucket) {
		Aging_Bucket = aging_Bucket;
	}



	public Byte getIs_deleted() {
		return Is_deleted;
	}



	public void setIs_deleted(Byte is_deleted) {
		Is_deleted = is_deleted;
	}
	
	
	
	



	public String getClear_date() {
		return Clear_date;
	}



	public void setClear_date(String clear_date) {
		Clear_date = clear_date;
	}



	public String getPosting_date() {
		return Posting_date;
	}



	public void setPosting_date(String posting_date) {
		Posting_date = posting_date;
	}



	public String getDocument_create_date() {
		return Document_create_date;
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



	public String getBaseline_create_date() {
		return Baseline_create_date;
	}



	public void setBaseline_create_date(String baseline_create_date) {
		Baseline_create_date = baseline_create_date;
	}

	

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
*/