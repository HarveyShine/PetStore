package pet.model;

import org.springframework.stereotype.Component;

/**
 * dbo.UserKind 用户类别，不同的用户类别享受不同的折扣
 * 
 * @author zephyr
 *
 */
@Component("userKindInfo")
public class UserKindInfo {
	private int kindId;// 类别号（Pi）
	private String kindIntro;// 简介
	private double discount;// 折扣

	public int getKindId() {
		return kindId;
	}

	public void setKindId(int kindId) {
		this.kindId = kindId;
	}

	public String getKindIntro() {
		return kindIntro;
	}

	public void setKindIntro(String kindIntro) {
		this.kindIntro = kindIntro;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public UserKindInfo(int kindId, String kindIntro, double discount) {
		super();
		this.kindId = kindId;
		this.kindIntro = kindIntro;
		this.discount = discount;
	}

	public UserKindInfo() {
		super();
	}

}
