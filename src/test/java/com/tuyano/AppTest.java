package com.tuyano;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
    private App app = null;

    public AppTest(String testName) {
        super(testName);
        app = new App();
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testApp() {
        assertNotNull(app);
    }

    public void testGetMessage() {
        String name = "hoge";
        String msg = "Hi," + name + ". Welcome to Maven World!";
        assertEquals(app.getMessage("hoge"), msg);
    }

}