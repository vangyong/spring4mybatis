package cn.segema.customer.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import cn.segema.frame.core.domain.Identifiable;

public class CsUser implements Identifiable {
	private static final long serialVersionUID = 48387695771475528L;
	private String userId;// id 主键
	private String gender;
	private String bornAddressId;
	private Timestamp bornDate;
	private BigDecimal weight;
	private BigDecimal height;
	private String bloodType;
	private String homeAddressId;
	private String groupId;
	private String nation;
	private String accountId;
	private Timestamp createTime;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBornAddressId() {
		return bornAddressId;
	}
	public void setBornAddressId(String bornAddressId) {
		this.bornAddressId = bornAddressId;
	}
	public Timestamp getBornDate() {
		return bornDate;
	}
	public void setBornDate(Timestamp bornDate) {
		this.bornDate = bornDate;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public BigDecimal getHeight() {
		return height;
	}
	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getHomeAddressId() {
		return homeAddressId;
	}
	public void setHomeAddressId(String homeAddressId) {
		this.homeAddressId = homeAddressId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String getId() {
		return this.userId;
	}
	@Override
	public void setId(String id) {
		this.userId = id;
	}
}
