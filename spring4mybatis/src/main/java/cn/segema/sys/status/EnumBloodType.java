package cn.segema.sys.status;

import cn.segema.frame.core.status.BaseEnum;

/**
 * 血型类型枚举类型
 * 
 * @author wangyong
 * @date 2014年9月12日下午4:45:06
 */
public enum EnumBloodType implements BaseEnum {
	A("A型"), B("B型"), AB("AB型"), O("O型"), RH("RH阴性");

	private String label;

	private EnumBloodType(String label) {
		this.label = label;
	}

	@Override
	public String getLabel() {
		return label;
	}
}
