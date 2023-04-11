package serveltex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Loginservlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);

	
	PrintWriter out= response.getWriter();

		
String Email =request.getParameter("Email");
String password =request.getParameter("password");



if (Email.equals("email") && password.equals("password")) 
{

	HttpSession session=request.getSession();
	
	session.putValue("username", Email);
	
	response.sendRedirect(request.getContextPath()+ "/index.html");


	
}

else {
	out.println("somthing went wrong");
}

	}

}
