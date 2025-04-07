package com.zomata.app4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {
    @Test
    public void testGetDetails() {
        Restaurant res = new Restaurant("Pizza Palace", "Downtown");
        assertEquals("Pizza Palace located at Downtown", res.getDetails());
    }
}