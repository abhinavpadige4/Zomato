package com.zomata.app4;

public class LoginService {
    public boolean login(User user, String password) {
        return user != null && user.authenticate(password);
    }
}
