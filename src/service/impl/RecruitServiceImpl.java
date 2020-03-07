package service.impl;

import dao.RecruitDao;
import dao.impl.RecruitDaoImpl;
import entity.Recruit;
import service.RecruitService;

public class RecruitServiceImpl implements RecruitService {
	//����һ��Dao�Ķ���
	private RecruitDao dao=new RecruitDaoImpl();
	@Override
	public boolean addRec(Recruit rec) {
		//���÷���
		int result=dao.add(rec);
		if(result>0) {
			return true;
		}
		return false;
	}

}
