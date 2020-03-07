package service.impl;

import dao.RecruitDao;
import dao.impl.RecruitDaoImpl;
import entity.Recruit;
import service.RecruitService;

public class RecruitServiceImpl implements RecruitService {
	//创建一个Dao的对象
	private RecruitDao dao=new RecruitDaoImpl();
	@Override
	public boolean addRec(Recruit rec) {
		//调用方法
		int result=dao.add(rec);
		if(result>0) {
			return true;
		}
		return false;
	}

}
