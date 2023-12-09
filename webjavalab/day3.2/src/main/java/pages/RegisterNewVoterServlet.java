package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDaoImpl;
import pojos.User;

/**
 * Servlet implementation class RegisterNewVoterServlet
 */
@WebServlet("/signup")
public class RegisterNewVoterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserDaoImpl dao;

	@Override
	public void init() throws ServletException {
		System.out.println("in register new destroy method");
		try {
			dao = new UserDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException("Error in init ", e);
		}
	}

	@Override
	public void destroy() {
		System.out.println("in register new destroy method");
		try {
			dao.cleanUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// first_name , last_name , email, password , dob

		response.setContentType("text/html");

		try (PrintWriter pw = response.getWriter()) {
			// 3. Read req params
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String email = request.getParameter("em");
			String pwd = request.getParameter("pass");
			Date dob = Date.valueOf(request.getParameter("dob"));

			if ((LocalDate.now().getYear() - dob.toLocalDate().getYear()) < 21) {
				pw.print("Age below 21 <a href='register.html'> Go Back </a>");

			} else {
				try {
					String msg = dao.registerNewVoter(new User(fname, lname, email, pwd, dob));
					pw.print(msg);
				} catch (Exception e) {
					pw.print("<h4>"+e.getMessage()+"<a href='register.html'> Go Back </a>"+"</h4>");
				}
			}
		}

	}
}
