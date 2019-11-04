

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateGroupServlet
 */
@WebServlet("/CreateGroupServlet")
public class CreateGroupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateGroupServlet() {
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
		String[] names=request.getParameterValues("last");
		String gname=request.getParameter("name");
		doa fd = new doa();
		List<User> dance=fd.addMembers(names);
		Groups sf=new Groups(gname,dance);
		System.out.println(sf);
		String email=(String) request.getSession().getAttribute("email");
		fd.addtoGroup(sf,dance);
		List<Groups> gf=fd.showGroups(email);
		request.getSession().setAttribute("groupList", gf);
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
	}

}
