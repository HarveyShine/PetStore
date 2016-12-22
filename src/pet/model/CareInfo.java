package pet.model;

import org.springframework.stereotype.Component;

/**
 * 宠物店服务表，包括宠物美容等等 对应数据库中
 * 
 * @author zephyr
 *
 */
@Component("careInfo")
public class CareInfo extends BusinessInfo {
	private String careKind;

	public CareInfo(int businessId, String businessSup, double businessPrice, String careKind) {
		super(businessId, businessSup, businessPrice);
		this.careKind = careKind;
	}

	public String getCareKind() {
		return careKind;
	}

	public void setCareKind(String careKind) {
		this.careKind = careKind;
	}

	public CareInfo() {
		super();
	}
}
