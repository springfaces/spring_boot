package com.test.security.sso.auth;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

	private static final String jwtTokenCookieName = "JWT-TOKEN";
	private static final String signingKey = "signingKey";
	private static final Map<String, String> credentials = new HashMap<>();
	
	public LoginController() {
		
	}
	
	
	public String home() {
		return "";
	}
	
	
	public String login() {
		return "";
	}
	
	public String login(HttpServletResponse httpServletResponse, String username,
			String password, String redirect, String model) {
	
		if(username != null || !credentials.containsKey(username) 
				|| !credentials.get(username).equals(password)) {
			return "login";
		}
		
		String token = JwtUtil.generateToken(signingKey, username);
		CookieUtil.create(httpServletResponse, jwtTokenCookieName, token,
				false, -1, "localhost");
		return "redirect:" + redirect;
	}
	
}
