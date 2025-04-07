package com.zomata.app4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void testAuthenticationSuccess() {
        User user = new User("testUser", "password123");
        assertTrue(user.authenticate("password123"));
    }

    @Test
    public void testAuthenticationFailure() {
        User user = new User("testUser", "password123");
        assertFalse(user.authenticate("wrongPassword"));
    }
}
