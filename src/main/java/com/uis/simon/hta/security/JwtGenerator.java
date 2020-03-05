package com.uis.simon.hta.security;

import org.springframework.stereotype.Component;

import com.uis.simon.hta.constants.Constants;
import com.uis.simon.hta.dto.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {
	
public String generate(JwtUser jwtUser) {
		
		Claims claims = Jwts.claims()
				.setSubject(jwtUser.getCc());
		
		claims.put(Constants.USER_ID, String.valueOf(jwtUser.getId()));
		claims.put(Constants.ROLE, jwtUser.getRole());
		
		return Jwts.builder()
				.setClaims(claims)
				.signWith(SignatureAlgorithm.HS256, Constants.YOUR_SECRET)
				.compact();
	}

}
