package cn.segema.business.domain;

import java.math.BigDecimal;

import cn.segema.frame.core.domain.Identifiable;

public class BsUser implements Identifiable {

	private static final long serialVersionUID = -6083026543191547274L;

	// id 主键
	private String orderId;

	private String name;

	private String userId;

	private String userName;

	private BigDecimal price;

	@Override
	public String getId() {
		return orderId;
	}

	@Override
	public void setId(String id) {
		this.orderId = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
