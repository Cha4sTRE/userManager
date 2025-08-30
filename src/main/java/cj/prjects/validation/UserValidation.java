package cj.prjects.validation;

import cj.prjects.model.User;
import org.apache.log4j.Logger;

public class UserValidation {

    private static final Logger logger = Logger.getLogger(UserValidation.class);

    public static void validate(User user){
        validateUsername(user.getName());
        validateEmail(user.getEmail());
        validatePassword(user.getPassword());
    }
    private static void validateUsername(String username){
        logger.debug("Validating username");
        if(username == null||username.isEmpty()){throw new ValidateException("el username no puede estar vacio");}
        if(username.length()<=2){throw new ValidateException("el username es muy corto");}
    }
    private static void validateEmail(String email){
        logger.debug("Validating email");
        if(email==null||!email.contains("@")||!email.contains(".")){
            throw new ValidateException("el email no es correcto");
        }
    }
    private static void validatePassword(String password){
        logger.debug("Validating password");

        if(password==null||password.isEmpty()){
            throw new ValidateException("el password no puede estar vacio");
        }

        if(!password.matches(".*[0-9]*.")){
            throw new ValidateException("el password debe contener numeros");
        }
    }
}
