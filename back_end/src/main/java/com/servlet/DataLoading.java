package com.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.pojo.Payments;
import com.myPOJO.Payment;

/**
 * Servlet implementation class DataLoading
 */
@WebServlet("/DataLoading")
public class DataLoading extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataLoading() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HashMap <Object, Object> Response = new HashMap<Object, Object>();
		ArrayList<Payment> Payments =new ArrayList<Payment>();
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grey_goose","root","Nithin88#");
			//String sql_query="SELECT * from winter_internship";
			//String sql_query="SELECT * from winter_internship limit ?";
			String sql_query="SELECT * from winter_internship limit ?, ?";
			PreparedStatement ps = connection.prepareStatement(sql_query);
			ps.setInt(1, start);
			ps.setInt(2, limit);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Payment payment = new Payment(
						rs.getInt("Sl_no"),
					 	rs.getString("Business_code"),
						/*rs.getInt("Cust_number"),*/
					 	rs.getInt("Cust_number"),
						rs.getString("Clear_date"),
						rs.getInt("Buisness_year"),
						rs.getString("Doc_id"),
						rs.getString("Posting_date"),
						/*rs.getDate("Posting_date"),*/
						rs.getString("Document_create_date"),
						rs.getString("Document_create_date1"),
						rs.getString("Due_in_date"),
						rs.getString("Invoice_currency"),
						rs.getString("Document_type"),
						rs.getInt("Posting_id"),
						rs.getString("Area_business"),
						rs.getDouble("Total_open_amount"),
						rs.getString("Baseline_create_date"), 
						rs.getString("Cust_payment_terms"),
						rs.getInt("Invoice_id"),
						rs.getByte("IsOpen"),
						rs.getString("Aging_Bucket"),
						rs.getByte("Is_deleted")
						);
				Payments.add(payment);
			}
			Response.put("payments", Payments);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();
		String jsonResponse = gson.toJson(Response);
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.getWriter().append(jsonResponse);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
