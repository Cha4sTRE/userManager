package cj.prjects.service.implementations;

import cj.prjects.model.User;
import cj.prjects.service.NotificationService;
import org.apache.log4j.Logger;

public class NotificationServiceImpl implements NotificationService {

    private static final Logger logger = Logger.getLogger(NotificationServiceImpl.class);

    @Override
    public void sendEmail(User user) {
        logger.info("Send email to "+user.getEmail());
    }
}
