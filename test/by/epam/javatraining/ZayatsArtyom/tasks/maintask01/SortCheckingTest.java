package test.by.epam.javatraining.ZayatsArtyom.tasks.maintask01;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model.SortChecking;
import org.junit.Assert;
import org.junit.Test;

public class SortCheckingTest {
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
}
