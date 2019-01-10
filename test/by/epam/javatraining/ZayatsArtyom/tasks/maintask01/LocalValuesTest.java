package test.by.epam.javatraining.ZayatsArtyom.tasks.maintask01;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model.LocalValues;
import org.junit.Assert;
import org.junit.Test;

public class LocalValuesTest {
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
}
