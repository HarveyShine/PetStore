package pet.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

/**
 * 宠物店元员工dbo.Worker
 * 
 * @author zephyr
 *
 */
@Component("workerInfo")
public class WorkerInfo {
	private String workerName;// 员工姓名
	private int workKindId;// 员工类别号（外码）
	private Date workerBirthday;// 员工生日
	private String workerTel;// 员工电话
	private String workerIntro;// 员工简介

	public WorkerInfo(String workerName, int workKindId, Date workerBirthday, String workerTel, String workerIntro) {
		super();
		this.workerName = workerName;
		this.workKindId = workKindId;
		this.workerBirthday = workerBirthday;
		this.workerTel = workerTel;
		this.workerIntro = workerIntro;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public int getWorkKindId() {
		return workKindId;
	}

	public void setWorkKindId(int workKindId) {
		this.workKindId = workKindId;
	}

	public Date getWorkerBirthday() {
		return workerBirthday;
	}

	public void setWorkerBirthday(Date workerBirthday) {
		this.workerBirthday = workerBirthday;
	}

	public String getWorkerTel() {
		return workerTel;
	}

	public void setWorkerTel(String workerTel) {
		this.workerTel = workerTel;
	}

	public String getWorkerIntro() {
		return workerIntro;
	}

	public void setWorkerIntro(String workerIntro) {
		this.workerIntro = workerIntro;
	}

	public WorkerInfo() {
		super();
	}

}
