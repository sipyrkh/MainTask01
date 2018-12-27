import org.junit.Test;
import static org.junit.Assert.*;

public class VectorTest {
    @Test
    public void testBubbleSort(){
        int[] array = {1,9,4,8,2,6,7,0};
        int[] arrayExpected = {0,1,2,4,6,7,8,9};
        assertArrayEquals(arrayExpected, Vector.bubbleSort(array));
    }
    @Test
    public void testQuikSort(){
        int[] array = {1,9,4,8,2,6,7,0};
        int[] arrayExpected = {0,1,2,4,6,7,8,9};
        Vector.quickSort(array, 0, array.length-1);
        assertArrayEquals(arrayExpected, array);
    }
    @Test
    public void testInsertionSort(){
        int[] array = {1,9,4,8,2,6,7,0};
        int[] arrayExpected = {0,1,2,4,6,7,8,9};
        assertArrayEquals(arrayExpected, Vector.insertionSort(array));
    }
    @Test
    public void testSearchElementLinear(){
        int[] array = {1,9,4,8,2,6,7,0};
        int expectedIndex = 4;
        assertEquals(expectedIndex, Vector.searchElementLinear(array, 2));
    }
    @Test
    public void testFindLocalMin(){
        int[] array = {1,9,4,8,2,6,7,0};
        int expectedIndex = 2;
        assertEquals(expectedIndex, Vector.findLocalMin(array));
    }
    @Test
    public void testFindLocalMax(){
        int[] array = {1,9,4,8,2,6,7,0};
        int expectedIndex = 1;
        assertEquals(expectedIndex, Vector.findLocalMax(array));
    }
    @Test
    public void testSortedVectorASC(){
        int[] array = {1,4,9,10,12,16};
        assertEquals(true, Vector.isSortedVectorASC(array));
    }
    @Test
    public void testSortedVectorDESC(){
        int[] array = {9,4,3,10,12,16};
        assertEquals(false, Vector.isSortedVectorASC(array));
    }
    @Test
    public void testArithmeticMean(){
        int[] array = {1,4,9,10,12,16};
        double expectedValue = 8.666666666666666;
        assertEquals(expectedValue, Vector.arithmeticMean(array), 0.01);
    }
    @Test
    public void testGeometricMean(){
        int[] array = {1,4,9,10,12,16};
        double expectedValue = 6.406201895057689;
        assertEquals(expectedValue, Vector.geometricMean(array), 0.01);
    }
}
