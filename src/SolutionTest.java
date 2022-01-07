import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void test1() {
        int[] testingArray = {0, 1, 1, 3, 2, 5, 6, 3};
        int expectedResult = 1;
        int factualResult = solution.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test2() {
        int[] testingArray = {2, 2, 1};
        int expectedResult = 3;
        int factualResult = solution.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test3() {
        int[] testingArray = {4, 3, 2};
        int expectedResult = 3;
        int factualResult = solution.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test4() {
        int[] testingArray = {0, 0, 0, 1, 0};
        int expectedResult = 5;
        int factualResult = solution.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test5() {
        int[] testingArray = {1, 2, 3, 4, 5};
        int expectedResult = 1;
        int factualResult = solution.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test6() {
        int[] testingArray = {8, 7, 7, 7, 7, 7, 8, 7};
        int expectedResult = 8;
        int factualResult = solution.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test7() {
        int[] testingArray = {0, 0, 0};
        int expectedResult = 3;
        int factualResult = solution.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test8() {
        int[] testingArray = {0, 2, 0};
        int expectedResult = 3;
        int factualResult = solution.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test9() {
        int[] testingArray = {8, 8, 8, 8, 9, 8};
        int expectedResult = 6;
        int factualResult = solution.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test10() {
        int[] testingArray = {-1, -2, -3};
        int expectedResult = 3;
        int factualResult = solution.positionOfTheLastSmallestElement(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }
}