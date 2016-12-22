package pet.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

/**
 * 宠物基本信息表dbo.Pet
 * 
 * @author zephyr
 *
 */
@Component("petInfo")
public class PetInfo {
	private int petId;// 宠物编号
	private String userPhoneNumber;// 宠物主人电话号码
	private String petSex;// 宠物性别
	private String petName;// 宠物名字
	private Date petBirthday;// 宠物生日
	private String petKind;// 宠物类别

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getPetSex() {
		return petSex;
	}

	public void setPetSex(String petSex) {
		this.petSex = petSex;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public Date getPetBirthday() {
		return petBirthday;
	}

	public void setPetBirthday(Date petBirthday) {
		this.petBirthday = petBirthday;
	}

	public String getPetKind() {
		return petKind;
	}

	public void setPetKind(String petKind) {
		this.petKind = petKind;
	}

	public PetInfo(int petId, String userPhoneNumber, String petSex, String petName, Date petBirthday, String petKind) {
		super();
		this.petId = petId;
		this.userPhoneNumber = userPhoneNumber;
		this.petSex = petSex;
		this.petName = petName;
		this.petBirthday = petBirthday;
		this.petKind = petKind;
	}

	public PetInfo() {
		super();
	}
}
