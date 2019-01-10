package test.by.epam.javatraining.ZayatsArtyom.tasks.maintask01;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model.ExtremeValues;

import org.junit.Assert;
import org.junit.Test;

public class ExtremeValuesTest {
    @Test
    public void testSearchExtremeMax(){
        int[] array = {1,9,4,8,2,6,7,0};
        int expectedIndex = 9;
        Assert.assertEquals(expectedIndex, ExtremeValues.searchExtremeMax(array));
    }
    @Test
    public void testSearchExtremeMin(){
        int[] array = {1,9,4,8,2,6,7,0};
        int expectedIndex = 0;
        Assert.assertEquals(expectedIndex, ExtremeValues.searchExtremeMin(array));
    }
}
