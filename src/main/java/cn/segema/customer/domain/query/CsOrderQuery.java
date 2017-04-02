package cn.segema.customer.domain.query;

import cn.segema.customer.domain.CsOrder;

/**
 * @author wangyong
 */
public class CsOrderQuery extends CsOrder {
	
	private static final long serialVersionUID = 2239335166745111671L;
	
	private String userNameLike;
	
	public String getUserNameLike() {
		return userNameLike;
	}
	public void setUserNameLike(String userNameLike) {
		this.userNameLike = userNameLike;
	}

	
	
}
