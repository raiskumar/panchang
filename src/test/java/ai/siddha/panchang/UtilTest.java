package ai.siddha.panchang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilTest {

    @Test
    public void toMinuteTest(){
        int val = Util.toMinute(13,20);  //13° 20'
        assertEquals(val, 800);
        assertEquals(Util.degreeToMinute(13), 780);
    }
}
