package db;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class DataBase {


    private List<User> userDataBase = new LinkedList<>();

    public DataBase(List<User> userDataBase) {
        this.userDataBase = userDataBase;
    }

    public void addUser(User user){
        if (user.getLogin()!=null && user.getPassword()!=null){
            boolean b = userDataBase.stream().noneMatch(user1 -> user1.getLogin().equals(user.getLogin()));
            if (b){
                userDataBase.add(user);
            }
        }else System.out.println("Invalid database");

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
