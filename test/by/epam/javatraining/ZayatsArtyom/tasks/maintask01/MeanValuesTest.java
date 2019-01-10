package test.by.epam.javatraining.ZayatsArtyom.tasks.maintask01;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model.MeanValues;
import org.junit.Assert;
import org.junit.Test;

public class MeanValuesTest {
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
