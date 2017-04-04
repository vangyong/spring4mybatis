package cn.segema.customer.domain;

import java.sql.Timestamp;

import cn.segema.frame.core.domain.Identifiable;

public class CsAccount implements Identifiable {
	private static final long serialVersionUID = 48387695771475528L;
	private String accountId;// id 主键
	private String loginName;
	private String password;
	private String nickName;
	private String mobileNumber;
	private String email;
	private String identityNumber;
	private Timestamp createTime;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String getId() {
		return this.accountId;
	}
	@Override
	public void setId(String id) {
		this.accountId = id;
	}
}
