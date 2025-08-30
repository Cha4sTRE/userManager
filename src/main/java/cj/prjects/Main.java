package cj.prjects;

import cj.prjects.service.NotificationService;
import cj.prjects.service.UserService;
import cj.prjects.service.implementations.NotificationServiceImpl;
import cj.prjects.service.implementations.UserServiceImpl;
import org.apache.log4j.Logger;


public class Main {

    private static Logger log= Logger.getLogger(Main.class);


    public static void main(String[] args) {
        NotificationService notificationService = new NotificationServiceImpl();
        UserService userService=new UserServiceImpl(notificationService);
        userService.createUser("jeffer","chaustrejefferson@gmail.com","j1234");
        //userService.createUser("bpb","bob@gmail.com","");

    }


}