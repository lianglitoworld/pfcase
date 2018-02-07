
/**  
 * Copyright by XXXX有限公司 (c) 2018 Apple Inc.  
 * Date:2018年2月6日上午9:53:52  
 */

package com.youzan.pfcase.domain;

/**
 * @author liliang
 *
 */
public class Account {

	private String username;

    private String password;

    private String email;

    private String role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
}
