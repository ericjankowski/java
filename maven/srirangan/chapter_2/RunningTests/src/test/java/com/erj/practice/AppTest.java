package com.erj.practice;

import org.junit.*;
import static org.junit.Assert.*;

public class AppTest{
    @Test
    public void testApp(){
        App app = new App();

	assertEquals("Cool.", app.getStatus());
    }
}
