package cn.segema.sys.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import cn.segema.frame.core.dao.domain.Identifiable;
import cn.segema.sys.status.EnumBloodType;
import cn.segema.sys.status.EnumGender;
import cn.segema.sys.status.EnumNation;

public class SysUser implements Identifiable {

	private static final long serialVersionUID = 48387695771475528L;

	// id 主键
	private String userId;

	private String loginName;

	private String password;

	private String nickName;

	private String mobileNumber;

	private EnumGender gender;

	private String bornAddressId;

	private Timestamp bornDate;

	private BigDecimal weight;

	private BigDecimal height;

	private EnumBloodType bloodType;

	private String email;

	private String homeAddressId;

	private String groupId;

	private EnumNation nation;

	private String identityNumber;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public EnumGender getGender() {
		return gender;
	}

	public void setGender(EnumGender gender) {
		this.gender = gender;
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

	public EnumBloodType getBloodType() {
		return bloodType;
	}

	public void setBloodType(EnumBloodType bloodType) {
		this.bloodType = bloodType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getId() {
		return userId;
	}

	public void setId(String id) {
		this.userId = id;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getBornAddressId() {
		return bornAddressId;
	}

	public void setBornAddressId(String bornAddressId) {
		this.bornAddressId = bornAddressId;
	}

	public String getHomeAddressId() {
		return homeAddressId;
	}

	public void setHomeAddressId(String homeAddressId) {
		this.homeAddressId = homeAddressId;
	}

	public EnumNation getNation() {
		return nation;
	}

	public void setNation(EnumNation nation) {
		this.nation = nation;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	@Override
	public String toString() {
		return "SysUser [userId=" + userId + ", loginName=" + loginName
				+ ", password=" + password + ", nickName=" + nickName
				+ ", mobileNumber=" + mobileNumber + ", gender=" + gender
				+ ", bornAddressId=" + bornAddressId + ", bornDate=" + bornDate
				+ ", weight=" + weight + ", height=" + height + ", bloodType="
				+ bloodType + ", email=" + email + ", homeAddressId="
				+ homeAddressId + ", groupId=" + groupId + ", nation=" + nation
				+ ", identityNumber=" + identityNumber + "]";
	}

}
