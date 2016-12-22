package pet.model;

import org.springframework.stereotype.Component;

/**
 * 宠物店员工与宠物之间是多对多关系 dbo.serve
 * 
 * @author zephyr
 *
 */
@Component("serverInfo")
public class ServerInfo {
	private String workerName; // 员工姓名
	private int petId;// 宠物编号

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public ServerInfo(String workerName, int petId) {
		super();
		this.workerName = workerName;
		this.petId = petId;
	}

	public ServerInfo() {
		super();
	}

}
