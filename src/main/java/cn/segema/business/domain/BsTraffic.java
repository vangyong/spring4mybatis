package cn.segema.business.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import cn.segema.frame.core.domain.Identifiable;

public class BsTraffic implements Identifiable {

	private static final long serialVersionUID = -6083026543191547274L;

	// id 主键
	private String trafficId;

	// 出发地点
	private String startPlace;

	// 出发时间
	private Timestamp startTime;

	// 目的地
	private String destination;

	// 到达时间
	private Timestamp arriveTime;

	// 数量
	private BigDecimal amount;

	// 价格
	private BigDecimal price;

	@Override
	public String getId() {
		return trafficId;
	}

	@Override
	public void setId(String id) {
		this.trafficId = id;
	}

	public String getTrafficId() {
		return trafficId;
	}

	public void setTrafficId(String trafficId) {
		this.trafficId = trafficId;
	}

	public String getStartPlace() {
		return startPlace;
	}

	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Timestamp getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(Timestamp arriveTime) {
		this.arriveTime = arriveTime;
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
