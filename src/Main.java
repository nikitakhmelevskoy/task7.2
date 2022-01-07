public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = ArrayUtils.readIntArrayFromConsole();
        int minElement = solution.positionOfTheLastSmallestElement(arr);
        printPosition(minElement);

    }

    private static void printPosition(int minElement) {
        System.out.print("Smallest Element Position is " + minElement);
    }
}