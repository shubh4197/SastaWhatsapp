

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post
 */
@WebServlet("/Post")
public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Post() {
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
		String message=request.getParameter("message");
		String email=(String) request.getSession().getAttribute("email");
		String gname=(String) request.getSession().getAttribute("gname");

		Posts fg=new Posts();
		fg.setMessage(message);
		doa fd=new doa();
		User us=fd.findall(email);
		fg.setUser(us);
		Groups gp=fd.findGroup(gname);
		fg.setSd(gp);
		fg.setMessageDate(new Date());
		fd.chats(fg,email,gname);
		List<Posts> sds=fd.fetchChats(gname);
		request.getSession().setAttribute("messageList", sds);
		RequestDispatcher rd =request.getRequestDispatcher("Chatting.jsp");
		rd.forward(request, response);
	}

}
