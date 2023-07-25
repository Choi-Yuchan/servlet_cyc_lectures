package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.shape.Triangle;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/formEx")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
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

		String name = request.getParameter("name");
 		String id = request.getParameter("id");
 		String pw = request.getParameter("pw");
 		
 		//checkBox
 		String[] hobbys = request.getParameterValues("hobby");
 		String major = request.getParameter("major");
 		String protocol = request.getParameter("protocol");
 		
 		//
 		String paramId = getServletContext().getInitParameter("id");
 		String paramPw = getServletContext().getInitParameter("pw");
 		
 		
 		writer.println("<h1>ID:"+ id + "</h1>");
 		writer.println("<h1>Password:"+ pw + "</h1>");
 		writer.println("<h1>Name:"+ name + "</h1>");
 		writer.println("<h1>Hobby: " + Arrays.toString(hobbys) + "</h1>");
 		writer.println("<h1>Major:"+ major + "</h1>");
 		writer.println("<h1>Protocol:"+ protocol + "</h1>");
 		
 		writer.println("<h1>ParamId:"+ paramId + "</h1>");
 		writer.println("<h1>ParamPw:"+ paramPw + "</h1>");
 		
 		System.out.println("post method is succeed.");
 		
		writer.close();
	}

}
