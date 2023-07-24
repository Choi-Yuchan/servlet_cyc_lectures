package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.grade.Grade;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/grade")
public class GradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GradeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		PrintWriter writer = response.getWriter();

 		String kor = request.getParameter("kor");
 		String eng = request.getParameter("eng");
 		String math = request.getParameter("math");
 		
 		Grade value = new Grade(Integer.valueOf(kor),Integer.valueOf(eng),Integer.valueOf(math));
 		
 		char grade = value.getGrade();
 		double avg = value.getAvg();
 		double total = value.getTotal();
 		
 		response.setContentType("text/html");
 		writer.println("<h1> Total is: "+ total + "</h1>");
 		writer.println("<h1> Average is: "+ avg + "</h1>");
 		writer.println("<h1> grade is: "+ grade + "</h1>");
 		
 		System.out.println("post method is succeed.");
 		
		writer.close();
	}

}
