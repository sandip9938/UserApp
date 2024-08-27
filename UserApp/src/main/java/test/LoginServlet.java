package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet{

	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String uid = req.getParameter("userid");
		String pw= req.getParameter("upw");
		LoginDao ld= new LoginDao();
		UserBean ub=ld.login(uid, pw);
		if(ub==null)
		{
			
		}
		else {
			ServletContext sct=req.getServletContext();
			sct.setAttribute("ubean", ub);
			Cookie ck=new Cookie("ufn",ub.getUfn());
			res.addCookie(ck);
			RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
			rd.forward(req, res);
		}
	}
	public void destroy()
	{
		
	}
}
