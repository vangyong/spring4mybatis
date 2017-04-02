package cn.segema.system.domain;

import cn.segema.frame.core.domain.Identifiable;
import cn.segema.system.status.EnumActiveStatus;

public class SysGroup implements Identifiable {

	private static final long serialVersionUID = 1949632195840332762L;

	// id 主键
	private String groupId;

	private String groupName;

	private EnumActiveStatus groupStatus;

	public String getId() {
		return groupId;
	}

	public void setId(String id) {
		this.groupId = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public EnumActiveStatus getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(EnumActiveStatus groupStatus) {
		this.groupStatus = groupStatus;
	}
	
	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "SysGroup [groupId=" + groupId + ", groupName=" + groupName
				+ ", groupStatus=" + groupStatus + "]";
	}

	
}
