package edu.immune.sw.pattern.facade.ott;

import java.util.LinkedList;
import java.util.List;

import edu.immune.sw.pattern.facade.auth.AccessControlService;
import edu.immune.sw.pattern.facade.auth.AuthResponse;
import edu.immune.sw.pattern.facade.content.Content;
import edu.immune.sw.pattern.facade.content.ContentService;
import edu.immune.sw.pattern.facade.payment.PaymentMode;
import edu.immune.sw.pattern.facade.payment.PaymentOrder;
import edu.immune.sw.pattern.facade.payment.PaymentResponse;
import edu.immune.sw.pattern.facade.payment.PaymentService;
import edu.immune.sw.pattern.facade.subscription.SubscriptionService;
import edu.immune.sw.pattern.facade.user.User;
import edu.immune.sw.pattern.facade.user.UserAccessService;
import edu.immune.sw.pattern.facade.user.UserCredentials;

public class GrandMovies implements OverTheTopService {

	private AccessControlService accessControlS;
	private ContentService contentS;
	private SubscriptionService subscriptionS;
	private UserAccessService userAccessS;
	private PaymentService paymentS;
	
	public GrandMovies(AccessControlService acs, ContentService cs, 
			SubscriptionService ss, UserAccessService uas, PaymentService ps) {
		accessControlS = acs;
		contentS = cs;
		subscriptionS = ss;
		userAccessS = uas;
		paymentS = ps;
	}
	
	@Override
	public Content getContent(String contentId) {
		Content content = null;
		User user = userAccessS.getCurrentUser();
		String accessToken = accessControlS.getAccessToken(user);
		AuthResponse authR = accessControlS.authorize(user, accessToken);
		if(authR.isAuthorized()) {
			boolean premiumContent = contentS.isPremiumContent(contentId);
			if(premiumContent) {
				if(user.isPremiumMember()) {
					content = contentS.fetchContent(accessToken, contentId, false);
				} else {
					content = contentS.fetchContent(accessToken, contentId, true);
				}
			} else {
				content = contentS.fetchContent(accessToken, contentId, false);
			}
		}
		return content;
	}

	@Override
	public void subscribe(UserCredentials credentials, PaymentMode payMode) {
		AuthResponse authR = accessControlS.authenticate(credentials);
		User user = userAccessS.getCurrentUser();
		if(authR.isAuthenticated()) {
			PaymentOrder payOrder = paymentS.prepareOrder(payMode, subscriptionS.getSubscriptionCharge(), user);
			PaymentResponse paymentR = paymentS.pay(payOrder);
			if(paymentR.isSuccessful()) {
				subscriptionS.subscribe(user);
			}
		}
	}

	@Override
	public List<Content> visitSegment(String segmentId) {
		List<Content> contentL = new LinkedList<>();
		User user = userAccessS.getCurrentUser();
		String accessToken = accessControlS.getAccessToken(user);
		AuthResponse authR = accessControlS.authorize(user, accessToken);
		if(authR.isAuthorized()) {
			if(user.isPremiumMember()) {
				contentL.addAll(contentS.fetchContent(segmentId, true));
			} else {
				contentL.addAll(contentS.fetchContent(segmentId, false));
				contentL.addAll(contentS.fetchTrailers(segmentId));
			}
			contentL.addAll(contentS.fetchSponsoredContent(segmentId));
		}
		
		return contentL;
	}

}
