package com.something;

import java.util.HashMap;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Connection...");
        User user1 = new User(1, "FirstUsername", "FirstFirstname", "FirstLastname", 22);
        User user2 = new User(1, "FirstUsername", "FirstFirstname", "FirstLastname", 22);
        HashMap<User, String> map = new HashMap<>();
        map.put(user1, "user1");
        System.out.println(map.get(user2));
    }
}
