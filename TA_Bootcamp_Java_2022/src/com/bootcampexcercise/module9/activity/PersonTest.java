package com.bootcampexcercise.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    public void testGetterAndSetterWeight(){
        int a = 100;
        assertEquals(0, person.getWeight());
        person.setWeight(a);
        assertEquals(100, person.getWeight());

    }

    public void testGetterAndSetterHeight(){
        float b = 172.2f;
        assertEquals(0.0f, person.getHeight());
        person.setHeight(b);
        assertEquals(172.2f, person.getHeight());

    }

    public void testGetBodyMassIndex(){
        int a = 100;
        float b = 172.2f;
        String c = "0.0033723584";
        assertEquals(c, person.humanBodyMassIndex(a, b));

        int a2 = -100;
        float b2 = -172.2f;
        String c2 = "Please get me information";
        assertEquals(c2, person.humanBodyMassIndex(a2, b2));

        int a3 = 700;
        float b3 = 300f;
        String c3 = "It is impossible";
        assertEquals(c3, person.humanBodyMassIndex(a3, b3));

    }
}