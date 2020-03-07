package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Recruit;
import service.RecruitService;
import service.impl.RecruitServiceImpl;

/**
 * Servlet implementation class AddRec
 */
@WebServlet("/AddRec")
public class AddRec extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRec() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求的字符编码
		request.setCharacterEncoding("UTF-8");
		//获得页面上的数据
		String recruitname=request.getParameter("recruitname");
		int recruitnum=Integer.parseInt(request.getParameter("recruitnum"));
		String address=request.getParameter("address");
		String salary=request.getParameter("salary");
		Date releasetime=null;
		try {
			releasetime=new SimpleDateFormat("yyyy-MM-DD").parse(request.getParameter("releasetime"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int validityperiod=Integer.parseInt(request.getParameter("validityperiod"));
		String requirements=request.getParameter("requirements");
		//创建一个service对象
		RecruitService rs=new RecruitServiceImpl();
		Recruit rec=new Recruit(recruitname,recruitnum,address,salary,releasetime,validityperiod,requirements);
		//创建service对象的方法执行操作
		boolean isOk=rs.addRec(rec);
		//根据调用方法后得到的结果进行页面跳转
		String msg=null;
		if (isOk) {
			//跳转到index页面
			msg="true";
		}else {
			//跳转到增加页面
			msg="false";
		}
		request.getSession().setAttribute("msg", msg);
		response.sendRedirect("add.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
