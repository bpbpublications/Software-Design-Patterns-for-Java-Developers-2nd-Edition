package edu.immune.sw.pattern.pipeline.util;

import edu.immune.sw.pattern.pipeline.model.Order;
import edu.immune.sw.pattern.pipeline.model.User;

public class NotificationMessageUtil {

    public static String getMessage(String oderId, User user) {
        return prepareMessage(oderId, user);
    }

    private static String prepareMessage(String orderId, User user) {
        return orderId;
    }
}
