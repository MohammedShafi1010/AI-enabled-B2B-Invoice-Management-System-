package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import java.sql.Statement;

/**
 * Servlet implementation class AddPayment
 */
@WebServlet("/AddPayment")
public class AddPayment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPayment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			HashMap <Object, Object> Response = new HashMap<Object, Object>();
			String Business_code  = request.getParameter("Business_code");
			Integer Cust_number = Integer.parseInt(request.getParameter("Cust_number"));
			String Clear_date = request.getParameter("Clear_date");
			Integer Buisness_year = Integer.parseInt(request.getParameter("Buisness_year"));
			String Doc_id = request.getParameter("Doc_id");
			String Posting_date = request.getParameter("Posting_date");
			String Document_create_date = request.getParameter("Posting_date");
			String Document_create_date1 = request.getParameter("Document_create_date1");
			String Due_in_date = request.getParameter("Due_in_date");
			String Invoice_currency = request.getParameter("Invoice_currency");
			String Document_type = request.getParameter("Document_type");
			Integer Posting_id = Integer.parseInt(request.getParameter("Posting_id"));
			String Area_business = request.getParameter("Area_business");
			Double Total_open_amount = Double.parseDouble(request.getParameter("Total_open_amount"));
			String Baseline_create_date = request.getParameter("Baseline_create_date");
			String Cust_payment_terms = request.getParameter("Cust_payment_terms");
			Integer Invoice_id = Integer.parseInt(request.getParameter("Invoice_id"));
			Byte IsOpen = Byte.parseByte(request.getParameter("IsOpen"));
			String Aging_Bucket = request.getParameter("Aging_Bucket");
			Byte Is_deleted = Byte.parseByte(request.getParameter("Is_deleted"));
			
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grey_goose","root","Nithin88#");
			Statement s = connection.createStatement();
			ResultSet r = s.executeQuery("SELECT MAX(Sl_no) AS rowcount FROM winter_internship");
			r.next();
			int count = r.getInt("rowcount") + 1 ;
			r.close() ;
			PreparedStatement ps = connection.prepareStatement("INSERT INTO winter_internship (sl_no, business_code, cust_number, clear_date, buisness_year, doc_id, posting_date , document_create_date, document_create_date1, due_in_date, invoice_currency, document_type, posting_id , area_business, total_open_amount, baseline_create_date, cust_payment_terms, invoice_id, isOpen, Aging_Bucket, is_deleted) VALUES ( ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?,   ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			ps.setInt(1, count);
			ps.setString(2,Business_code);
			ps.setInt(3, Cust_number);
			ps.setString(4, Clear_date);
			ps.setInt(5, Buisness_year);
			ps.setString(6, Doc_id);
			ps.setString(7, Posting_date);
			ps.setString(8, Document_create_date);
			ps.setString(9, Document_create_date1);
			ps.setString(10, Due_in_date);
			ps.setString(11, Invoice_currency);
			ps.setString(12, Document_type);
			ps.setInt(13, Posting_id);
			ps.setString(14, Area_business);
			ps.setDouble(15, Total_open_amount);
			ps.setString(16, Baseline_create_date);
			ps.setString(17, Cust_payment_terms);
			ps.setInt(18, Invoice_id);
			ps.setByte(19, IsOpen);
			ps.setString(20, Aging_Bucket);
			ps.setByte(21, Is_deleted);
			/*
			ps.setString(1,Business_code);
			ps.setInt(2, Cust_number);
			ps.setString(3, Clear_date);
			ps.setInt(4, Buisness_year);
			ps.setString(5, Doc_id);
			ps.setString(6, Posting_date);
			ps.setString(7, Document_create_date);
			ps.setString(8, Document_create_date1);
			ps.setString(9, Due_in_date);
			ps.setString(10, Invoice_currency);
			ps.setString(11, Document_type);
			ps.setInt(12, Posting_id);
			ps.setString(13, Area_business);
			ps.setDouble(14, Total_open_amount);
			ps.setString(15, Baseline_create_date);
			ps.setString(16, Cust_payment_terms);
			ps.setInt(17, Invoice_id);
			ps.setByte(18, IsOpen);
			ps.setString(19, Aging_Bucket);
			ps.setByte(20, Is_deleted);
			*/
			
			if (ps.executeUpdate() > 0) {
				Response.put("insert", true);
			}
			else {
				Response.put("insert", false);
			}
			Gson gson = new Gson();
			String jsonResponse = gson.toJson(Response);
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.getWriter().append(jsonResponse);
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
