package test.by.epam.javatraining.ZayatsArtyom.tasks.maintask01;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model.SortVector;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortVectorTest {
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
}
