package microservices.app.authorizationservice.security;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import microservices.app.authorizationservice.models.User;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	@Override
	public org.springframework.security.core.Authentication attemptAuthentication(HttpServletRequest req,
			HttpServletResponse res) throws AuthenticationException {
		try {
			User credentials = new ObjectMapper().readValue(req.getInputStream(), User.class);
			return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(
					credentials.getEmail(), credentials.getPassword(), new ArrayList<>()));

		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	
	protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain,
			AuthenticationFilter auth) throws IOException, ServletException {

//		String token = JWT.create().withSubject(((User) auth.getPrincipal()).getUsername())
	//			.withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME)).sign(HMAC512(SECRET.getBytes()));
		//res.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
	}

}