package cn.segema.business.enums;

import cn.segema.frame.core.status.BaseEnum;

/**
 * 订单状态
 * @author wangyong
 */
public enum HotelType implements BaseEnum {
	INVALID("无效"),
	VALID("有效");

	private String label;

	private HotelType(String label) {
		this.label = label;
	}

	@Override
	public String getLabel() {
		return label;
	}
}
