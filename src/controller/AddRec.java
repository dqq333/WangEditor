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
		//����������ַ�����
		request.setCharacterEncoding("UTF-8");
		//���ҳ���ϵ�����
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
		//����һ��service����
		RecruitService rs=new RecruitServiceImpl();
		Recruit rec=new Recruit(recruitname,recruitnum,address,salary,releasetime,validityperiod,requirements);
		//����service����ķ���ִ�в���
		boolean isOk=rs.addRec(rec);
		//���ݵ��÷�����õ��Ľ������ҳ����ת
		String msg=null;
		if (isOk) {
			//��ת��indexҳ��
			msg="true";
		}else {
			//��ת������ҳ��
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
