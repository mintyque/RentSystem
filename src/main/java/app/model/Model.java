package app.model;

import app.entities.User;
import java.util.HashMap;


public class Model {
    private static Model instance = new Model();

    public Model() {
    }
    //static ArrayList<User> usersInfo = new ArrayList<:angry:);
    static HashMap<String, User> users = new HashMap<>();


    //returns 1 if everything is ok
    //returns 2 if passwords doesn't match
    //returns 3 if there is a user with same email in a system
    //return 4 if some field is empty
    public static Integer register(String name, String surname, String email, String password, String cpassword) {

        if (name == null || surname == null || email == null || password == null || cpassword == null)
            return 4;
        if (name.length() == 0 || surname.length() == 0 || email.length() == 0 || password.length() == 0 || cpassword.length() == 0)
            return 4;

        if (users.containsKey(email)){
            return 3;
        }
        else if (password.equals(cpassword)) {
            users.put(email, new User(name, surname, email, password));
            return  1;
        }
        else
            return 2;

    }

    //Returns user object by email and password
    //If there is no such user or password is wrong, returns null
    public static User login(String email, String password){

        if (email == null || password == null || email.length() == 0 || password.length() == 0)
            return null;

        if (!users.containsKey(email))
            return null;

        User loggedUser = users.get(email);
        if(loggedUser.getPassword().equals(password)){
            return loggedUser;
        }
        else
            return null;

    }

    //returns 1 if everything is ok and password has been changed
    //returns 2 if passwords doesn't match
    public static Integer changePassword(User user, String newPassword, String confirm){

        if (newPassword.equals(confirm)) {
            user.setPassword(newPassword);
            users.replace(user.getEmail(), user);
            return 1;
        }
        return 2;
    }
}
