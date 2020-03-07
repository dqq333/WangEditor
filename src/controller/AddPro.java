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

import dao.ProductDao;
import entity.Product;
import service.ProductService;
import service.impl.ProductServiceImpl;

/**
 * Servlet implementation class AddPro
 */
@WebServlet("/AddPro")
public class AddPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPro() {
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
		String feilei=request.getParameter("feilei");
		String pname=request.getParameter("pname");
		String fujian=request.getParameter("fujian");
		String jieshao=request.getParameter("jieshao");
		Date fabutime=null;
		try {
			fabutime=new SimpleDateFormat("yyyy-MM-DD").parse(request.getParameter("fabutime"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String fujianname=request.getParameter("fujianname");
		String pimg=request.getParameter("pimg");
		String productinform=request.getParameter("productinform");
		ProductService pros=new ProductServiceImpl();
		Product  pro =new Product(feilei,pname,fujian,jieshao,fabutime,fujianname,pimg,productinform);
		boolean isOk=pros.addpro(pro);
		String msg=null;
		if(isOk) {
			msg="true";
		}else {
			msg="false";
		}
		request.getSession().setAttribute("msg", msg);
		response.sendRedirect("product.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
