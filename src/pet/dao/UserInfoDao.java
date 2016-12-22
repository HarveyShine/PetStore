package pet.dao;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pet.model.UserInfo;


/**
 * 负责User的增删改查
 * 
 * @author zephyr
 *
 */
@Repository
public class UserInfoDao {
	private JdbcTemplate jdbcTemplate = null;

	@Resource
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 增加用户（用户注册时候用）
	 * 
	 * @param user
	 * @return
	 */
	public int insert(UserInfo user) {
		String sql = "insert into dbo.User (userPhoneNumber, userName, userSex, userIcon, regerstTime) values(? ,?, ?, ?, ?)";
		int ret = jdbcTemplate.update(sql, user.getUserPhoneNumber(), user.getUserName(),
				user.getUserSex(), user.getUserIcon(), user.getRegerstTime());
		System.out.println(ret);
		return ret;
	}
}
