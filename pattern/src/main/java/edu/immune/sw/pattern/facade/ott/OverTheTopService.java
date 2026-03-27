package edu.immune.sw.pattern.facade.ott;

import java.util.List;

import edu.immune.sw.pattern.facade.content.Content;
import edu.immune.sw.pattern.facade.payment.PaymentMode;
import edu.immune.sw.pattern.facade.user.UserCredentials;

public interface OverTheTopService {

	public Content getContent(String contentId);
	
	public List<Content> visitSegment(String segmentId);

	void subscribe(UserCredentials credentials, PaymentMode payMode);
	
}