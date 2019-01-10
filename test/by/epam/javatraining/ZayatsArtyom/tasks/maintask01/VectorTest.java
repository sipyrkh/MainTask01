package test.by.epam.javatraining.ZayatsArtyom.tasks.maintask01;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model.*;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class VectorTest {
    @Test
    public void testBubbleSort(){
        int[] array = {1,9,4,8,2,6,7,0};
        int[] arrayExpected = {0,1,2,4,6,7,8,9};
        Assert.assertArrayEquals(arrayExpected, SortVector.bubbleSort(array));
    }
    @Test
    public void testQuickSort(){
        int[] array = {1,9,4,8,2,6,7,0};
        int[] arrayExpected = {0,1,2,4,6,7,8,9};
        SortVector.quickSort(array, 0, array.length-1);
        assertArrayEquals(arrayExpected, array);
    }
    @Test
    public void testInsertionSort(){
        int[] array = {1,9,4,8,2,6,7,0};
        int[] arrayExpected = {0,1,2,4,6,7,8,9};
        Assert.assertArrayEquals(arrayExpected, SortVector.insertionSort(array));
    }
    @Test
    public void testSearchElementLinear(){
        int[] array = {1,9,4,8,2,6,7,0};
        int expectedIndex = 4;
        Assert.assertEquals(expectedIndex, SearchElements.searchElementLinear(array, 2));
    }
    @Test
    public void testSearchElementBinary(){
        int[] array = {1,9,4,8,2,6,7,0};
        int expectedIndex = 3;
        Assert.assertEquals(expectedIndex, SearchElements.searchBinary(array, 0, array.length-1, 8));
    }
    @Test
    public void testFindLocalMin(){
        int[] array = {1,9,4,8,2,6,7,0};
        int expectedIndex = 2;
        Assert.assertEquals(expectedIndex, LocalValues.findLocalMin(array));
    }
    @Test
    public void testFindLocalMax(){
        int[] array = {1,9,4,8,2,6,7,0};
        int expectedIndex = 1;
        Assert.assertEquals(expectedIndex, LocalValues.findLocalMax(array));
    }
    @Test
    public void testSortedVectorASC(){
        int[] array = {1,4,9,10,12,16};
        Assert.assertEquals(true, SortChecking.isSortedVectorASC(array));
    }
    @Test
    public void testSortedVectorDESC(){
        int[] array = {9,4,3,10,12,16};
        Assert.assertEquals(false, SortChecking.isSortedVectorASC(array));
    }
    @Test
    public void testArithmeticMean(){
        int[] array = {1,4,9,10,12,16};
        double expectedValue = 8.666666666666666;
        Assert.assertEquals(expectedValue, MeanValues.arithmeticMean(array), 0.01);
    }
    @Test
    public void testGeometricMean(){
        int[] array = {1,4,9,10,12,16};
        double expectedValue = 6.406201895057689;
        Assert.assertEquals(expectedValue, MeanValues.geometricMean(array), 0.01);
    }
}
