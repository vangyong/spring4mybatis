package cn.segema.business.domain;

import java.math.BigDecimal;

import cn.segema.frame.core.domain.Identifiable;

public class BsTicket implements Identifiable {

	private static final long serialVersionUID = -6083026543191547274L;

	// id 主键
	private String ticketId;

	// 门票名
	private String name;

	// 数量
	private BigDecimal amount;

	// 价格
	private BigDecimal price;

	@Override
	public String getId() {
		return ticketId;
	}

	@Override
	public void setId(String id) {
		this.ticketId = id;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
