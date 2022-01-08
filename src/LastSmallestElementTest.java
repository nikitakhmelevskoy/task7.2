import org.junit.Assert;
import org.junit.Test;

public class LastSmallestElementTest {

    LastSmallestElement LastSmallestElement = new LastSmallestElement();

    @Test
    public void LastSmallestElementTest1() {
        int[] testingArray = {0, 1, 1, 3, 2, 5, 6, 3};
        int expectedResult = 1;
        int factualResult = LastSmallestElement.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void LastSmallestElementTest2() {
        int[] testingArray = {2, 2, 1};
        int expectedResult = 3;
        int factualResult = LastSmallestElement.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void LastSmallestElementTest3() {
        int[] testingArray = {4, 3, 2};
        int expectedResult = 3;
        int factualResult = LastSmallestElement.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void LastSmallestElementTest4() {
        int[] testingArray = {0, 0, 0, 1, 0};
        int expectedResult = 5;
        int factualResult = LastSmallestElement.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void LastSmallestElementTest5() {
        int[] testingArray = {1, 2, 3, 4, 5};
        int expectedResult = 1;
        int factualResult = LastSmallestElement.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void LastSmallestElementTest6() {
        int[] testingArray = {8, 7, 7, 7, 7, 7, 8, 7};
        int expectedResult = 8;
        int factualResult = LastSmallestElement.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void LastSmallestElementTest7() {
        int[] testingArray = {0, 0, 0};
        int expectedResult = 3;
        int factualResult = LastSmallestElement.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void LastSmallestElementTest8() {
        int[] testingArray = {0, 2, 0};
        int expectedResult = 3;
        int factualResult = LastSmallestElement.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void LastSmallestElementTest9() {
        int[] testingArray = {8, 8, 8, 8, 9, 8};
        int expectedResult = 6;
        int factualResult = LastSmallestElement.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void LastSmallestElementTest10() {
        int[] testingArray = {-1, -2, -3};
        int expectedResult = 3;
        int factualResult = LastSmallestElement.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }
}