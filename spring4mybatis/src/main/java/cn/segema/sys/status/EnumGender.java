package cn.segema.sys.status;

import cn.segema.frame.core.status.BaseEnum;

/**
 * 性别枚举类型
 * 
 * @author wangyong
 * @date 2014年9月12日下午4:45:06
 */
public enum EnumGender implements BaseEnum {
	MALE("男"), FEMALE("女"), SECRET("保密");

	private String label;

	private EnumGender(String label) {
		this.label = label;
	}

	@Override
	public String getLabel() {
		return label;
	}
}
