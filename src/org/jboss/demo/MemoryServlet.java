package org.jboss.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemoryServlet
 */
@WebServlet("/MemoryServlet")
public class MemoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = new String();
	    ArrayList<String> myarrylist = new ArrayList<String>();
	    ArrayList<String> myarraylist = new ArrayList<String>();

	    int i = 10;
	        while (true) {
	    myarrylist.add(str);
	    myarraylist.add(str);
	    System.out.println(i);
	    i++;
	        }
	}

}
