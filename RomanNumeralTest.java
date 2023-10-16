import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {
    @Test
    public void testSingleLetters() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(1, roma.romanToInt("I"));
        assertEquals(5, roma.romanToInt("V"));
        assertEquals(10, roma.romanToInt("X"));
        assertEquals(50, roma.romanToInt("L"));
        assertEquals(100, roma.romanToInt("C"));
        assertEquals(500, roma.romanToInt("D"));
        assertEquals(1000, roma.romanToInt("M"));
    }

    @Test
    public void testManyLetters() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(12, roma.romanToInt("XII"));
    }

    @Test
    public void testSubtractiveNotation() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(4, roma.romanToInt("IV"));
    }

    @Test
    public void testWithAndWithoutSubtractiveNotation() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(14, roma.romanToInt("XIV"));
        assertEquals(10, roma.romanToInt("X"));
    }

    @Test
    public void testRepetition() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(2, roma.romanToInt("II"));
    }

    @Test
    public void testFirstNumber() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(1, roma.romanToInt("I"));
    }

    @Test
    public void testInvalidLetter() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(0, roma.romanToInt("Z"));
    }

    @Test
    public void testInvalidAndValidLetter() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(0, roma.romanToInt("XIZ"));
    }

    @Test
    public void testNotValid() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(0, roma.romanToInt("VV"));
    }

    @Test
    public void nullEntry(){
        RomanNumeral roma = new RomanNumeral();
        assertEquals(0, roma.romanToInt(" "));
    }

    @Test
    public void a_Number() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(0, roma.romanToInt("1"));
    }

    @Test
    public void testNumberAndValidLetter() {
        RomanNumeral roma = new RomanNumeral();
        assertEquals(0, roma.romanToInt("X1I7Z"));
    }

}
