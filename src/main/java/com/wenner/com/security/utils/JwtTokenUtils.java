package com.wenner.com.security.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtils {

	static final String CLAIM_KEY_USERNAME = "sub";
	static final String CLAIM_KEY_ROLE = "role";
	static final String CLAIM_KEY_CREATED = "created";
	
	@Value ("${jwt.secret}")
	private String secret;
	
	@Value ("${jwt.expiration}")
	private Long expiration;
	
	/**
	 * Obtém  o username(email) contido no tokem JWT
	 * @param token
	 * @return String
	 * */
	public String getUserNameFromToken(String token) {
		String userName;
		
		return null;
	}
	
}
