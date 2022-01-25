package com.sayo.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddGoodServlet
 */
@WebServlet("/AddGoodServlet")
public class AddGoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String good_id = request.getParameter("good_id");
		String type = request.getParameter("type");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String source = request.getParameter("source");
		String last_date = request.getParameter("last_date");
		String next_date = request.getParameter("next_date");
		System.out.println(price);
		System.out.println(next_date);
//		try {
//			if (registerService.insertSingleUser(username, password)) {
//				response.getWriter().write("success");
//			} else {
//				response.getWriter().write("fail");
//			}
//		} catch (SQLException throwables) {
//			throwables.printStackTrace();
//		}
	}

}
