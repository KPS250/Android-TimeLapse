package com.krazzylabs.timelapse;

import org.junit.Test;

import java.sql.Time;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getTimeElasped() {
        assertEquals("just now", TimeHelper.Companion.timeElasped(1545482000));
    }


}