package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.shape.Triangle;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/triArea")
public class TriangleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TriangleServlet() {
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

 		String width = request.getParameter("width");
 		String height = request.getParameter("height");
 		Triangle triangle = new Triangle(Double.valueOf(width),Double.valueOf(height));
 		double area = triangle.getArea();
 		
 		response.setContentType("text/html");
 		writer.println("<h1> Area is: "+area+ "</h1>");
 		
 		System.out.println("area is: " + area);
 		System.out.println("post method is succeed.");
 		
		writer.close();
	}

}
