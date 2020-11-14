package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {


    private DataBase dataBase;


    @BeforeEach
    public void init(){
        List<User> userList = new ArrayList<>();
        dataBase = new DataBase(userList);
        userList.add(new User("mama", "mama2"));
        userList.add(new User("tata", "tata2"));
    }


    @Test
    void addUser() {
        User user = new User("x","x2");
        int size = dataBase.getUserDataBase().size();

        dataBase.addUser(user);
        assertThat(dataBase.getUserDataBase().size()).isEqualTo(3);
    }
}
