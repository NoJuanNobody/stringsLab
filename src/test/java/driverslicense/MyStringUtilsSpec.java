package driverslicense;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by alejandrolondono on 5/30/16.
 */
public class MyStringUtilsSpec {

    String test;

    @Before
    public void setup(){
        test="helloWorld";
    }

    @Test
    public void ArrayToStringTest(){
        assertEquals(test, MyStringUtils.arrayToString(test.split("")));
    }

    @Test
    public void SplitByLintesTest(){
        StringBuilder paragraph = new StringBuilder();
        int length=10;
        for(int i=1;i<=length;i++){
            paragraph.append(test).append("\n");
        }
        assertEquals(length, MyStringUtils.splitByLines(paragraph.toString()).length);
    }

    @Test
    public void reverseCapsTest(){
        test="hello darkness my old friend";
        String expected="hELLO dARKNESS mY oLD fRIEND ";
        assertEquals(expected, MyStringUtils.reverseCaps(test));
    }

    @Test
    public void reverseWordsTest(){
        assertEquals("dlroWolleh.", MyStringUtils.reverseWords(test));
    }
}
