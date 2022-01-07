public class Solution {

    public int positionOfTheLastSmallestElement(int[] arr) {
        int j = 0;
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                j = i;
            }
        }
        return j + 1;
    }
}
