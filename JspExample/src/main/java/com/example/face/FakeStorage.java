package com.example.face;

import com.example.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {

    private static final FakeStorage storage;

    static {
        storage = new FakeStorage();
    }
    private List<User> users;

    private FakeStorage() {
        this.users = new ArrayList<>();
        User user = new User("Sasha", "qwerty007", LocalDate.parse("1996-01-09"));
        User user1 = new User("Max", "qwerty007", LocalDate.parse("1995-02-02"));
        User user2 = new User("Bob", "qwerty007", LocalDate.parse("1995-02-02"));

        users.add(user);
        users.add(user1);
        users.add(user2);
    }
    public static FakeStorage storage() {
        return storage;
    }

    public List<User> users() {
        return users;
    }
}
