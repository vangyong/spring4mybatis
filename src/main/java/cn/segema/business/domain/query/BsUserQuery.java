package cn.segema.business.domain.query;

import cn.segema.business.domain.BsUser;

/**
 * @author wangyong
 */
public class BsUserQuery extends BsUser {
	
	private static final long serialVersionUID = 2239335166745111671L;
	
	private String userNameLike;
	
	public String getUserNameLike() {
		return userNameLike;
	}
	public void setUserNameLike(String userNameLike) {
		this.userNameLike = userNameLike;
	}

	
	
}
