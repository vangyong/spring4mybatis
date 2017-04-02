package cn.segema.system.domain;

import java.math.BigDecimal;

import cn.segema.frame.core.domain.Identifiable;

public class SysResources implements Identifiable {
	private static final long serialVersionUID = 4989087280573499064L;
	private String resId;// id 主键
	private String resName;
	private String parentId;
	private String resCode;
	private String type;
	private String resUrl;
	private String resLevel;
	private String icon;
	private BigDecimal isHide;
	private String description;
	private BigDecimal deleteStatus;

	public String getResId() {
		return resId;
	}
	public void setResId(String resId) {
		this.resId = resId;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getResUrl() {
		return resUrl;
	}
	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}
	public String getResLevel() {
		return resLevel;
	}
	public void setResLevel(String resLevel) {
		this.resLevel = resLevel;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public BigDecimal getIsHide() {
		return isHide;
	}
	public void setIsHide(BigDecimal isHide) {
		this.isHide = isHide;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getDeleteStatus() {
		return deleteStatus;
	}
	public void setDeleteStatus(BigDecimal deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	@Override
	public String getId() {
		return this.resId;
	}
	@Override
	public void setId(String systemId) {
		this.resId = systemId;
	}
}
