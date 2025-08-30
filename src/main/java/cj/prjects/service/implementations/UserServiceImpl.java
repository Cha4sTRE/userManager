package cj.prjects.service.implementations;

import cj.prjects.model.User;
import cj.prjects.service.NotificationService;
import cj.prjects.service.UserService;
import cj.prjects.validation.UserValidation;
import cj.prjects.validation.ValidateException;
import org.apache.log4j.Logger;

public class UserServiceImpl implements UserService {

    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
    private final NotificationService notificationService;

    public UserServiceImpl(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void createUser(String username, String email, String password) {
        try{
            logger.info("User building!");
            //creando usuario
            User user= new User.Builder()
                    .name(username)
                    .email(email)
                    .password(password)
                    .build();
            //validando usuario
            UserValidation.validate(user);
            //servicio: enviar email
            notificationService.sendEmail(user);
        }catch(ValidateException e){
            logger.error(e.getMessage());
        }
    }
}
