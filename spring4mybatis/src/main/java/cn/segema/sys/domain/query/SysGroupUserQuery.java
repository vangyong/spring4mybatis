package cn.segema.sys.domain.query;

import cn.segema.sys.domain.SysUser;
import cn.segema.sys.status.EnumStatus;

/**
 * 
 * @author wangyong
 * @date 2014年3月3日下午1:31:18
 */
public class SysGroupUserQuery extends SysUser {

	private static final long serialVersionUID = 3345307706394181508L;

	private String nickNameLike;

	private String groupNameLike;

	private String groupId;

	private String groupName;

	private EnumStatus groupStatus;

	public String getNickNameLike() {
		return nickNameLike;
	}

	public void setNickNameLike(String nickNameLike) {
		this.nickNameLike = nickNameLike;
	}

	public String getGroupNameLike() {
		return groupNameLike;
	}

	public void setGroupNameLike(String groupNameLike) {
		this.groupNameLike = groupNameLike;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public EnumStatus getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(EnumStatus groupStatus) {
		this.groupStatus = groupStatus;
	}

	@Override
	public String toString() {
		return "SysGroupUserQuery [nickNameLike=" + nickNameLike
				+ ", groupNameLike=" + groupNameLike + ", groupId=" + groupId
				+ ", groupName=" + groupName + ", groupStatus=" + groupStatus
				+ "]";
	}

}
