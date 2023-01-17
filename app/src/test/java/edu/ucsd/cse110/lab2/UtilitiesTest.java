package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.robolectric.util.Util;

public class UtilitiesTest {
    @Test
    public void test_trimDisplayStr() {
        assertEquals("1.234", Utilities.trimDisplayStr("1.2340"));
        assertEquals("13", Utilities.trimDisplayStr("13.0"));
    }
}
