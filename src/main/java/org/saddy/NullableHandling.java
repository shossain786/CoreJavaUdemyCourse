package org.saddy;

import java.util.Optional;

public class NullableHandling {
    public static void main(String[] args) {
        User userWithName = new User("AutomationQAWorld");
        User userWithNull = new User(null);

        System.out.println(getUserName(userWithName));
        System.out.println(getUserName(userWithNull));
    }

    public static String getUserName(User user) {
        return Optional.ofNullable(user.getUserName()).orElse("Guest");
    }

    static class User{
        private String userName;

        public User(String userName) {
            this.userName = userName;
        }
        public String getUserName() {
            return userName;
        }
    }
}
