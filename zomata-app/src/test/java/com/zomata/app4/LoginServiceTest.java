package com.zomata.app4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {
    @Test
    public void testLoginSuccess() {
        User user = new User("admin", "adminpass");
        LoginService service = new LoginService();
        assertTrue(service.login(user, "adminpass"));
    }

    @Test
    public void testLoginFailure() {
        User user = new User("admin", "adminpass");
        LoginService service = new LoginService();
        assertFalse(service.login(user, "wrongpass"));
    }
}