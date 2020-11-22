package Collections;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Map;
import java.util.TreeMap;

public class MapPracticeTest extends TestCase {
    private MapPractice mapPractice;
    private Map map;

    public void setUp() throws Exception {
        mapPractice = new MapPractice();
        map = new TreeMap<String, String>();
        map.put("Mario", "Mario Bros.");
        map.put("Donkey Kong", "Donkey Kong");
        map.put("Link", "Legend of Zelda");
        map.put("Samus Aran", "Metroid");
        map.put("Yoshi", "Yoshi's World");
        map.put("Kirby", "Kirby");
        map.put("Fox McCloud", "Star Fox");
        map.put("Pikachu", "Pokemon");
        map.put("Luigi", "Mario Bros.");
        map.put("Captain Falcon", "F-Zero");
        map.put("Ness", "EarthBound");
        map.put("Jigglypuff", "Pokemon");
        super.setUp();
    }

    public void testFindValueOf1() {
        // Given
        String key = "Captain Falcon";
        // When
        String expected = "F-Zero";
        String actual = (String) mapPractice.findValueOf(map, key);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testFindValueOf2() {
        // Given
        String key = "Snake";
        // When
        String expected = null;
        String actual = (String) mapPractice.findValueOf(map, key);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testFindValueOf3() {
        // Given
        String key = "Jigglypuff";
        // When
        String expected = "Pokemon";
        String actual = (String) mapPractice.findValueOf(map, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testFindKeysOf1() {
        // Given
        String value = "Donkey Kong";
        // When
        Object[] expected = {"Donkey Kong"};
        Object[] actual = mapPractice.findKeysOf(map, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    public void testFindKeysOf2() {
        // Given
        String value = "Linfeng";
        // When
        Object[] expected = {};
        Object[] actual = mapPractice.findKeysOf(map, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    public void testFindKeysOf3() {
        // Given
        String value = "Pokemon";
        // When
        Object[] expected = {"Jigglypuff", "Pikachu"};
        Object[] actual = mapPractice.findKeysOf(map, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    public void testFibonacciTree1() {
        // Given
        Integer upTo = 10;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        expected.put(6, 8);
        expected.put(7, 13);
        expected.put(8, 21);
        expected.put(9, 34);
        expected.put(10, 55);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testFibonacciTree2() {
        // Given
        Integer upTo = 2;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testFibonacciTree3() {
        // Given
        Integer upTo = 1;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testFibonacciTree4(){
        // Given
        Integer upTo = 0;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testCrazySpiral1() {
        // Given
        Integer upTo = 10;
        Integer first = 2;
        Integer second = 2;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 2);
        expected.put(2, 2);
        expected.put(3, 4);
        expected.put(4, 6);
        expected.put(5, 10);
        expected.put(6, 16);
        expected.put(7, 26);
        expected.put(8, 42);
        expected.put(9, 68);
        expected.put(10, 110);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testCrazySpiral2() {
        // Given
        Integer upTo = 12;
        Integer first = 3;
        Integer second = -4;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 3);
        expected.put(2, -4);
        expected.put(3, -1);
        expected.put(4, -5);
        expected.put(5, -6);
        expected.put(6, -11);
        expected.put(7, -17);
        expected.put(8, -28);
        expected.put(9, -45);
        expected.put(10, -73);
        expected.put(11, -118);
        expected.put(12, -191);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }
    public void testCrazySpiral3() {
        // Given
        Integer upTo = 0;
        Integer first = 334124535;
        Integer second = -413141793;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }
}