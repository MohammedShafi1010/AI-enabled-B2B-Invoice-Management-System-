package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class UpdatePayment
 */
@WebServlet("/UpdatePayment")
public class UpdatePayment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePayment() {
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
			/*
			Integer Sl_no = Integer.parseInt(request.getParameter("Sl_no"));
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
			Byte Is_deleted = Byte.parseByte(request.getParameter("Is_deleted"));*/
			Integer Sl_no = Integer.parseInt(request.getParameter("Sl_no"));
			String Invoice_currency = request.getParameter("Invoice_currency");
			String Cust_payment_terms = request.getParameter("Cust_payment_terms");
			
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grey_goose","root","Nithin88#");
			String sql = "UPDATE winter_internship  SET Invoice_currency = ?, Cust_payment_terms = ? WHERE Sl_no = ?;";
			//String sql = "UPDATE winter_internship  SET Business_code = ?, Cust_number = ?, Clear_date = ?, Buisness_year = ?, Doc_id = ?, Posting_date = ?, Document_create_date = ?, Document_create_date1 = ?, Due_in_date = ?, Invoice_currency = ?, Document_type = ?, Posting_id = ?, Area_business = ?, Total_open_amount = ?, Baseline_create_date = ?, Cust_payment_terms = ?, Invoice_id = ?, IsOpen = ?, Aging_bucket = ?, Is_deleted = ? WHERE Sl_no = ?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			/*ps.setString(1,Business_code);
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
			ps.setInt(21, Sl_no);*/
			
			ps.setString(1, Invoice_currency);
			ps.setString(2, Cust_payment_terms);
			ps.setInt(3, Sl_no);
			
			if (ps.executeUpdate() > 0) {
				Response.put("update", true);
			}
			else {
				Response.put("update", false);
			}
			Gson gson = new Gson();
			String jsonResponse = gson.toJson(Response);
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.getWriter().append(jsonResponse);
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
