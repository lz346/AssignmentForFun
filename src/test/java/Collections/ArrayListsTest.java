package Collections;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class ArrayListsTest extends TestCase {
    private ArrayLists arrayLists;

    public void setUp() throws Exception {
        arrayLists = new ArrayLists();
        super.setUp();
    }

    public void testAddShit1() {
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(5);
        original1.add(5);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(7);
        original2.add(7);
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        original1.add(7);
        original1.add(7);
        // Then
        Assert.assertEquals(original1, actual);
    }

    public void testAddShit2() {
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(5);
        original1.add(5);
        ArrayList<Integer> original2 = new ArrayList<Integer>();

        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
;
        // Then
        Assert.assertEquals(original1, actual);
    }

    public void testAddShit3() {
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();

        ArrayList<Integer> original2 = new ArrayList<Integer>();

        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        ;
        // Then
        Assert.assertEquals(original1, actual);
    }

    public void testAddShitTogether1() {
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(5);
        original1.add(5);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(7);
        original2.add(7);
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer except = 29;
        // Then
        Assert.assertEquals(except, actual);
    }
    public void testAddShitTogether2() {
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();

        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(7);
        original2.add(7);
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer except = 14;
        // Then
        Assert.assertEquals(except, actual);
    }
    public void testAddShitTogether3() {
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(-10);
        original1.add(0);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(7);
        original2.add(7);
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer except = 9;
        // Then
        Assert.assertEquals(except, actual);
    }

    public void testRemoveAll1() {
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(5);
        original1.add(2);
        original1.add(3);
        original1.add(3);
        // When
        Integer toRemove = 5;
        ArrayList<Integer> actual = arrayLists.removeAll(original1,toRemove);
        ArrayList<Integer> except = new ArrayList<Integer>();
        except.add(2);
        except.add(3);
        except.add(3);
        // Then
        Assert.assertEquals(actual,except);

    }
    public void testRemoveAll2() {
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(5);
        original1.add(2);
        original1.add(3);
        original1.add(3);
        // When
        Integer toRemove = null;
        ArrayList<Integer> actual = arrayLists.removeAll(original1,toRemove);

        // Then
        Assert.assertEquals(actual,original1);
    }
    public void testRemoveAll3() {
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(5);
        original1.add(2);
        original1.add(3);
        original1.add(2);
        // When
        Integer toRemove = 2;
        ArrayList<Integer> actual = arrayLists.removeAll(original1,toRemove);
        ArrayList<Integer> except = new ArrayList<Integer>();
        except.add(5);
        except.add(5);
        except.add(3);
        // Then
        Assert.assertEquals(actual,except);
    }

    public void testHappyList1() {
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("this");
        original.add("test");
        original.add("shit");
        original.add("is");
        original.add("goingdown");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }
    public void testHappyList2() {
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("here");
        original.add("is");
        original.add("no");
        original.add("happy");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertFalse(actual);
    }
    public void testHappyList3() {
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("FALSE!!!");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }
    public void testHappyList4() {
        // Given
        ArrayList<String> original = new ArrayList<String>();
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }
}