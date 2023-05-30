package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }
//testing if countNumbers() throws NullPointerException when string is null
    @Test (expected = NullPointerException.class)
    public void testCountNumbers2() {
        mycustomstring.countNumbers();


    }

//this test checks if countNumbers() returns approptiate value i.e. zero when there is no digit
    @Test
    public void testCountNumbers3() {
        mycustomstring.setString("sadsadsa");
        assertEquals(0,mycustomstring.countNumbers());
    }

    //this test checks if countNumbers() returns approptiate value when the string has multiple numbers only with space
    @Test
    public void testCountNumbers4() {
        mycustomstring.setString("11 22 33 444");
        assertEquals(4,mycustomstring.countNumbers());
    }
    //this test checks if countNumbers() returns approptiate value i.e. one , when string has a single digit
    @Test
    public void testCountNumbers5() {
        mycustomstring.setString("1");
        assertEquals(1,mycustomstring.countNumbers());

    }
    //this test checks if countNumbers() returns approptiate value i.e. zero when string is empty
    //Note string is empty and not null here
    @Test
    public void testCountNumbers6() {
        mycustomstring.setString("");
        assertEquals(0,mycustomstring.countNumbers());

    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }
//this test checks if the getEveryNthCharacterFromBeginningOrEnd gets right string on reeated input
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd3()
    {
        mycustomstring.setString("abababababababababab");
        assertEquals("bbbbbbbbbb", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }
    //this test checks if the getEveryNthCharacterFromBeginningOrEnd gets the exact string when step is
    //essentially 1 from start
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
        mycustomstring.setString("This Exact String should be back");
        assertEquals("This Exact String should be back", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    //this test checks if the getEveryNthCharacterFromBeginningOrEnd gets the exact string when step is
    //essentially 1 from End

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
        mycustomstring.setString("This Exact String should be back");
        assertEquals("This Exact String should be back", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));

    }
//This test checks if getEveryNthCharacterFromBeginningOrEnd throws IllegalAccessError exception when
//n is zero and string is not null
    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);

    }


//This test checks if getEveryNthCharacterFromBeginningOrEnd throws IllegalAccessError exception when
//n is less tha zero and string is not null
    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-999, true);

    }


    //This test checks if getEveryNthCharacterFromBeginningOrEnd throws NullPointerException exception when
    //n >0  and string is null
    @Test (expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(10, true);

    }

    //This test checks if getEveryNthCharacterFromBeginningOrEnd throws IllegalAccessError exception when
    //n is less than zero and string is NULL

    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-99999, true);

    }


    //This test checks if getEveryNthCharacterFromBeginningOrEnd throws IllegalAccessError exception when
    //n is zero and string is NULL

    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);

    }
    //This test checks if getEveryNthCharacterFromBeginningOrEnd return empty String
    //when n is greater than string length and startfromEnd is TRUE
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
        mycustomstring.setString("short string");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(20, true));
    }

    //This test checks if getEveryNthCharacterFromBeginningOrEnd return empty String
    //when n is greater than string length and startfromEnd is FALSE
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
        mycustomstring.setString("short string");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(20, false));
    }

    //This test checks that getEveryNthCharacterFromBeginningOrEnd() returns the last character
    //when n=length if strinf and startfromEnd is FALSE
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
        mycustomstring.setString("short string");
        assertEquals("g", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(12, false));

    }

    //This test checks that getEveryNthCharacterFromBeginningOrEnd() returns the first character
    //when n=length if strinf and startfromEnd is TRUE

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
        mycustomstring.setString("short string");
        assertEquals("s", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(12, true));

    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    //This test checks whether the method
    // convertDigitsToNamesInSubstring suitably throws an IllegalArgumentException if
    // startPosition is greater than endPosition
    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(24, 23);
    }
    //This test checks whether the method
    // convertDigitsToNamesInSubstring suitably throws an IllegalArgumentException if
    // startPosition is outof Bound

    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring3() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(0, 23);

    }

    //This test checks whether the method
    // convertDigitsToNamesInSubstring suitably throws an IllegalArgumentException if
    // endPosition is outofbound   i.e. greater than string length

    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring4() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(12, mycustomstring.getString().length()+10);
    }

    //This test checks whether the method
    // convertDigitsToNamesInSubstring suitably throws an NullPointerException
    // If "startPosition" <= "endPosition", "startPosition" and
    // "endPosition" are greater than 0, and the current
    //  string is null

    @Test(expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring5() {
        mycustomstring.convertDigitsToNamesInSubstring(12,13);
    }

    //Testing String that has no Interger in it
    @Test
    public void testConvertDigitsToNamesInSubstring6() {
        mycustomstring.setString("no Numbers here");
        mycustomstring.convertDigitsToNamesInSubstring(1,15);
        assertEquals("no Numbers here",mycustomstring.getString());

    }

    //Tesing that the convertDigitsToNamesInSubstring() method doesn't change digits
    //when they are not inside the arguments
    @Test
    public void testConvertDigitsToNamesInSubstring7() {
        mycustomstring.setString("111 no Numbers here 222");
        mycustomstring.convertDigitsToNamesInSubstring(6,15);
        assertEquals("111 no Numbers here 222",mycustomstring.getString());

    }
    //Tesing that the convertDigitsToNamesInSubstring() method changes digits to names
    //when the string is nothing but strings

    @Test
    public void testConvertDigitsToNamesInSubstring8() {
        mycustomstring.setString("12345");
        mycustomstring.convertDigitsToNamesInSubstring(1,5);
        assertEquals("OneTwoThreeFourFive",mycustomstring.getString());

    }

}
