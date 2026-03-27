package edu.immune.sw.pattern.facade.auth;

import edu.immune.sw.pattern.facade.user.User;
import edu.immune.sw.pattern.facade.user.UserCredentials;

public interface AccessControlService {

	public String getAccessToken(User user);
	
	public AuthResponse authenticate(UserCredentials credentials);
	
	public AuthResponse authenticate(User user);
	
	public AuthResponse authorize(User user, String accessToken);
	
}
