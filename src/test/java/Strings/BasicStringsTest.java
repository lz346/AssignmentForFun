package Strings;

import junit.framework.TestCase;
import org.junit.Assert;

public class BasicStringsTest extends TestCase {

    private BasicStrings basicStrings;

    public void setUp() throws Exception {
        basicStrings = new BasicStrings();
        super.setUp();
    }

    public void testFlipConcat1() {
        // Given
        String string1 = " Go";
        String string2 = "Let's";
        String expected = "Let's Go";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testFlipConcat2() {
        // Given
        String string1 = "Mario!";
        String string2 = "It's a me! ";
        String expected = "It's a me! Mario!";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testFlipConcat3() {
        // Given
        String string1 = "";
        String string2 = "It's a me! ";
        String expected = "It's a me! ";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testGetChar1() {// Given
        String string1 = "You can do this!";
        char expected = 'a';
        // When
        char actual = basicStrings.getChar(string1, 5);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testGetChar2() {
        // Given
        String string1 = "You can do this!";
        char expected = '!';
        // When
        char actual = basicStrings.getChar(string1, 15);
        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testICantSee1() {
        // Given
        String string1 = "Linfeng Zhou";
        String expected = "            ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testICantSee2() {
        // Given
        String string1 = "This is the answer";
        String expected = "                  ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testICantSee3() {
        // Given
        String string1 = "";
        String expected = "";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testLoudAndClear1() {
        // Given
        String string = "";
        String expected = "";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testLoudAndClear2() {
        // Given
        String string = "here is a test";
        String expected = "HERE IS A TEST";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testLoudAndClear3() {
        // Given
        String string = "HeRe IS anOThEr TesT";
        String expected = "HERE IS ANOTHER TEST";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testReverseCase1() {
        // Given
        String string = "";
        String expected = "";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testReverseCase2() {
        // Given
        String string = "HeRe IS anOThEr TesT";
        String expected = "hErE is ANotHeR tESt";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testReverseCase3() {
        // Given
        String string = "i LOVe Y'aLL";
        String expected = "I lovE y'All";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testOneAtATime1() {
        // Given
        String string1 = "";
        String string2 = "";
        String expected = "";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testOneAtATime2() {
        // Given
        String string1 = "W abs";
        String string2 = "ed et";
        String expected = "We da best";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testOneAtATime3() {
        // Given
        String string1 = "Caaa 7.0";
        String string2 = "hrrr";
        String expected = "Chararar 7.0";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }
}