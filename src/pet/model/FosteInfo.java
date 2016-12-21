package pet.model;

import java.sql.Date;
import org.springframework.stereotype.Component;

/**
 * 这是宠物寄养表，宠物寄养信息，继承自BusinessInfo 对应数据库中 dbo.Foste
 * 
 * @author zephyr
 */
@Component("fosteInfo")
public class FosteInfo extends BusinessInfo {
	private Date fosteTime; // 寄养时间

	public Date getFosteTime() {
		return fosteTime;
	}

	public void setFosteTime(Date fosteTime) {
		this.fosteTime = fosteTime;
	}

	public FosteInfo(int businessId, String businessSup, double businessPrice, Date fosteTime) {
		super(businessId, businessSup, businessPrice);
		this.fosteTime = fosteTime;
	}

	public FosteInfo() {
		super();
	}
}
