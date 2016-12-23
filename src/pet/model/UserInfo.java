package pet.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

/**
 * 用户基本信息表dbo.User对应的实体类
 * 
 * @author zephyr
 *
 */
@Component("userInfo")
public class UserInfo {
	private String userPhoneNumber; // 用户电话号码
	private int kindId;// 用户类别
	private String userName;// 用户姓名
	private String userSex;// 用户性别
	private String userIcon;// 用户头像
	private Date regerstTime;// 用户注册时间
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public int getKindId() {
		return kindId;
	}

	public void setKindId(int kindId) {
		this.kindId = kindId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	public Date getRegerstTime() {
		return regerstTime;
	}

	public void setRegerstTime(Date regerstTime) {
		this.regerstTime = regerstTime;
	}

	public UserInfo(String userPhoneNumber, int kindId, String userName, String userSex, String userIcon,
			Date regerstTime, String password) {
		super();
		this.userPhoneNumber = userPhoneNumber;
		this.kindId = kindId;
		this.userName = userName;
		this.userSex = userSex;
		this.userIcon = userIcon;
		this.regerstTime = regerstTime;
		this.password = password;
	}

	public UserInfo() {
		super();
	}
}
