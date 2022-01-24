package com.sayo.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sayo.pojo.Good;
import com.sayo.service.QueryService;
import com.sayo.service.QueryServiceImpl;

import org.json.JSONObject;

/**
 * Servlet implementation class ExactQueryServlet
 */
@WebServlet("/ExactQueryServlet")
public class ExactQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	QueryService queryService = new QueryServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExactQueryServlet() {
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
		try {
			Good good = queryService.exactQuerySingleGoodByGoodId(good_id);
//			if (user == null)
//				System.out.println("Not found!");
			if (good != null) {
				System.out.println(good);
				JSONObject obj = new JSONObject();
				obj.put("ok", "success");
				obj.put("type", good.getType());
				obj.put("name", good.getName());
				obj.put("price", good.getPrice());
				obj.put("source", good.getSource());
				obj.put("next_date", good.getNext_date());
				obj.put("last_date", good.getLast_date());
				response.getWriter().println(obj);
			} else {
				response.getWriter().write("fail");
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

}
