package cn.segema.customer.status;

import cn.segema.frame.core.status.BaseEnum;

/**
 * 订单状态
 * @author wangyong
 */
public enum CsOrderStatus implements BaseEnum {
	INVALID("无效"),
	VALID("有效");

	private String label;

	private CsOrderStatus(String label) {
		this.label = label;
	}

	@Override
	public String getLabel() {
		return label;
	}
}
