package cn.segema.business.domain;

import java.math.BigDecimal;

import cn.segema.business.enums.HotelType;
import cn.segema.frame.core.domain.Identifiable;

public class BsHotel implements Identifiable {

	private static final long serialVersionUID = -6083026543191547274L;

	// id 主键
	private String hotelId;

	// 酒店名
	private String name;

	// 类型
	private HotelType type;

	// 房号
	private String roomNumber;

	// 价格
	private BigDecimal price;

	@Override
	public String getId() {
		return hotelId;
	}

	@Override
	public void setId(String id) {
		this.hotelId = id;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HotelType getType() {
		return type;
	}

	public void setType(HotelType type) {
		this.type = type;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
