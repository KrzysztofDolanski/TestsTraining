package db;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<User> userDataBase = new ArrayList<>();


    public User addNewUser(String login, String password) {
        User user = new User(login, password);

        for (int i = 0; i < userDataBase.size(); i++) {
            if (!(userDataBase.get(i).getLogin() == user.getLogin())) {
                return user;
            }
        } return null;
    }

    public List<User> getUserDataBase() {
        return userDataBase;
    }

    public User getUserByLogin(String login) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < userDataBase.size(); i++) {
            User user = userDataBase.get(i);
                if (user.getLogin() == login);
                users.add(user);
        }
        if (users.isEmpty()){
            return null;
        }
        return users.get(0);
    }

    public List<User> deleteUserByLogin(String login){
        for (int i = 0; i < userDataBase.size(); i++) {
            if (userDataBase.get(i).getLogin()==login)
                userDataBase.remove(i);
        }
        return userDataBase;
    }
}
