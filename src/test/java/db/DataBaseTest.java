package db;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

        List<User> userList = new ArrayList<>();

        User user = new User("lol", "lol2");
        User user2 = new User("abc", "abc2");
        User user3 = new User("mama", "mama2");
        User user4 = new User("tata", "tata2");
        User user5 = new User("Julek", "Julek2");

        @BeforeEach

    public List<User> setUserDatabase() {
            userList.add(user);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
            return userList;
        }

        User userAdded = new User("Marian", "Kolabor88123");



    @Test
    void check(){
        assertThat(userList.toArray().length).isEqualTo(5);
    }

    @Test
    void addNewUser() {

    }

    @Test
    void getUserDataBase() {
    }

    @Test
    void getUserByLogin() {
    }

    @Test
    void deleteUserByLogin() {
    }
}
