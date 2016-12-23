package pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pet.dao.UserInfoDao;

@Service
public class UserService {
	public static int LOGIN_STATE = 1;
	public static String SECCESS = "COREECT";
	public static String ERRPR = "ERROR";
	@Autowired
	private UserInfoDao userdao = null;
	
	/**
	 *检查登录是否成功
	 * @param userPhoneNumber 登录账号
	 * @param password	登录密码
	 * @return 匹配状态
	 */
	public String checkLongin(String userPhoneNumber, String password){
		String queryPW = userdao.selectPassW(userPhoneNumber);
		if (password.equals(queryPW)) {
			return SECCESS;
		}else {
			return ERRPR;
		}
	}
}
