package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.DataUtils;
import dao.RecruitDao;
import entity.Recruit;

public class RecruitDaoImpl implements RecruitDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public int add(Recruit rec) {
		//����Ҫִ�е�sql����
		String sql="INSERT INTO recruit(recruitname,recruitnum,address,salary,releasetime,validityperiod,requirements) VALUES(?,?,?,?,?,?,?)";
		//����һ���������鲢��ֵ
		Object[] params= {rec.getRecruitname(),rec.getRecruitnum(),rec.getAddress(),rec.getSalary(),rec.getReleasetime(),rec.getValidityperiod(),rec.getRequirements()};
		//���ù�����ķ���
		int result=DataUtils.executeUpdate(sql, params);
		return result;
	}

}
