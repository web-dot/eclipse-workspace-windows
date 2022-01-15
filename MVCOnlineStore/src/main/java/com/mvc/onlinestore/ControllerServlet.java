package com.mvc.onlinestore;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in ControllerServelet doGet()");
		process(request, response);
	}
	
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("in ControllerServlet process()");
		
		
		String url = request.getRequestURI();
		RequestDispatcher rd;
		String message;
		UserService service = new UserService();
		
		
		if(url.contains("/openPlaceOrderView.do")) {
			
			rd = request.getRequestDispatcher("PlaceOrder.jsp");
			rd.forward(request, response);
		}
		if(url.contains("/PlaceOrder.do")) {
			OrderBean bean = (OrderBean)request.getAttribute("ord");
			System.out.println(bean);
			message = service.register(bean);
			if(message.equals(Constants.SUCCESS)) {
				String msg = "Congratulations!! Your Order has been Placed. Preparing for Dispatch";
				request.setAttribute("successMessage", msg);
				rd = request.getRequestDispatcher("Message.jsp");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("errorMessage", message);
				rd = request.getRequestDispatcher("PlaceOrder.jsp");
				rd.forward(request, response);
			}
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in ControllerServlet doPost()");
		process(request, response);
	}

}
