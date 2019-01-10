package test.by.epam.javatraining.ZayatsArtyom.tasks.maintask01;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model.SearchElements;
import org.junit.Assert;
import org.junit.Test;

public class SearchElementsTest {
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
}
