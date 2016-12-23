package pet.test;

import java.sql.Date;

import org.springframework.beans.factory.BeanFactory;

import pet.dao.UserInfoDao;
import pet.model.UserInfo;
import pet.utils.DateUtils;
import pet.utils.SpringUtils;

public class Test {

	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo("15161166610", 1, "yanghui", "男", "123",
				new java.sql.Date(DateUtils.strToDate("2013-10-23", "yyyy-MM-dd").getTime()), "123");
		BeanFactory factory = SpringUtils.getBeanFactory();
		UserInfoDao dao = factory.getBean(UserInfoDao.class);
		dao.insert(userInfo);
	}
}
