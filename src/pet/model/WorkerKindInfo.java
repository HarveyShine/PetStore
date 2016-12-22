package pet.model;

import org.springframework.stereotype.Component;

/**
 * 工作人员类别dbo.WorkKind
 * 
 * @author zephyr
 *
 */
@Component("workerKindInfo")
public class WorkerKindInfo {
	private int workKindId;// 类别id
	private String kindName;// 类别名
	private String kindIntro;// 介绍

	public int getWorkKindId() {
		return workKindId;
	}

	public void setWorkKindId(int workKindId) {
		this.workKindId = workKindId;
	}

	public String getKindName() {
		return kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public String getKindIntro() {
		return kindIntro;
	}

	public void setKindIntro(String kindIntro) {
		this.kindIntro = kindIntro;
	}

	public WorkerKindInfo(int workKindId, String kindName, String kindIntro) {
		super();
		this.workKindId = workKindId;
		this.kindName = kindName;
		this.kindIntro = kindIntro;
	}

	public WorkerKindInfo() {
		super();
	}

}
