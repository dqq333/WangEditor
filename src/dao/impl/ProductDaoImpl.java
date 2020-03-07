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
		//����Ҫִ�е�sql����
		String sql="INSERT INTO product(feilei,pname,fujian,jieshao,fabutime,fujianname,pimg,productinform) VALUES(?,?,?,?,?,?,?,?)";
		//����һ���������鲢��ֵ
		Object[] params= {pro.getFeilei(),pro.getPname(),pro.getFujian(),pro.getJieshao(),pro.getFabutime(),pro.getFujianname(),pro.getPimg(),pro.getProductinform()};
		//���ù�����ķ���
		int result=DataUtils.executeUpdate(sql, params);
		return result;
	}

}
