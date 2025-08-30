package cj.prjects.model;


import org.apache.log4j.Logger;

public class User {

    private static final Logger log = Logger.getLogger(User.class);
    private final  String name;
    private final  String email;
    private final  String password;


    private User(Builder builder) {
        this.name= builder.name;
        this.email= builder.email;
        this.password= builder.password;
    }

    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}

    //Builder design pattern
    public static class Builder{
        private String name;
        private String email;
        private String password;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

}
