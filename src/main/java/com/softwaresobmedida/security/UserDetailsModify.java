package com.softwaresobmedida.security;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class UserDetailsModify extends User {
	private static final long serialVersionUID = 1L;

	private String dataBaseName;
	
    public UserDetailsModify(String login, String senha, List<GrantedAuthority> auth, String dataBaseName) {
        super(login, senha, auth);
        this.dataBaseName = dataBaseName;
    }
    
	public String getDataBaseName() {
		return dataBaseName;
	}
}
