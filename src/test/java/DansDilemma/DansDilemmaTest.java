package DansDilemma;

import junit.framework.TestCase;
import org.junit.Assert;

public class DansDilemmaTest extends TestCase {

    private DansDilemma dansDilemma;

    public void setUp() throws Exception {
        dansDilemma = new DansDilemma();
        super.setUp();
    }

    public void testDilemmaOfTwo1() {
        // Given
        Double input1 = 4d;
        Double input2 = 5d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfTwo2() {
        // Given
        Double input1 = 5d;
        Double input2 = 5d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 4;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfTwo3() {
        // Given
        Double input1 = 0d;
        Double input2 = 0d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfTwo4() {
        // Given
        Double input1 = 0d;
        Double input2 = 5d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 3;
        //5(5+0=5, 5-0=5), -5 , 0(0*5 = 0 and 0/5 =0) 5/0 is error
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfThree1() {
        // Given all three numbers are different
        // Also they have differnt differences
        Double input1 = 1d;
        Double input2 = 4d;
        Double input3 = 12d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 15;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfThree2() {
        // Given two of three numbers are same
        Double input1 = 2d;
        Double input2 = 2d;
        Double input3 = 3d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 8;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfThree3() {
        // Given all three number are same
        Double input1 = 5d;
        Double input2 = 5d;
        Double input3 = 5d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 4;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfThree4() {
        // Given all three number are 0
        Double input1 = 0d;
        Double input2 = 0d;
        Double input3 = 0d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfThree5() {
        // Given three different numbers contain a 0
        Double input1 = 0d;
        Double input2 = 4d;
        Double input3 = 5d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 11;
        Assert.assertEquals(expected, actual);
    }

    public void testDilemmaOfN1() {
        // Given
        Double[] inputs = {3d, 5d, 9d, 14d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 36;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfN2() {
        // Given
        Double[] inputs = {4d, 32d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfN3() {
        // Given
        Double[] inputs = {1d, 2d, 4d, 8d, 16d, 32d, 64d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 70;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfN4() {
        // Given
        Double[] inputs = new Double[100];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = (double) i;
        }
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 8843;
        Assert.assertEquals(expected, actual);
    }
    public void testDilemmaOfN5() {
        // Given
        Double[] inputs = new Double[4554];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = (double) i;
        }
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 17409257;
        Assert.assertEquals(expected, actual);
    }
}