package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.additionCalculator;



/**
 * Servlet implementation class getIntegersServlet
 */
@WebServlet("/getIntegersServlet")
public class getIntegersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getIntegersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userInt1 = request.getParameter("userInt1");
		String userInt2 = request.getParameter("userInt2");
		
		additionCalculator sum = new additionCalculator(Integer.parseInt(userInt1), Integer.parseInt(userInt2));
		
		request.setAttribute("userSum", sum);
		
		getServletContext().getRequestDispatcher("/addResult.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(sum.toString());
		writer.close();
	}

}
