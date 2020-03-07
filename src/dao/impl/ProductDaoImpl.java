package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.DataUtils;
import dao.ProductDao;
import entity.Product;

public class ProductDaoImpl implements ProductDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public int find(Product pro) {
		//创建要执行的sql命令
		String sql="INSERT INTO product(feilei,pname,fujian,jieshao,fabutime,fujianname,pimg,productinform) VALUES(?,?,?,?,?,?,?,?)";
		//创建一个参数数组并赋值
		Object[] params= {pro.getFeilei(),pro.getPname(),pro.getFujian(),pro.getJieshao(),pro.getFabutime(),pro.getFujianname(),pro.getPimg(),pro.getProductinform()};
		//调用工具类的方法
		int result=DataUtils.executeUpdate(sql, params);
		return result;
	}

}
