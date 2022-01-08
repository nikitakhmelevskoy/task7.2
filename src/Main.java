public class Main {

    public static void main(String[] args) {

        LastSmallestElement LastSmallestElement = new LastSmallestElement();
        int[] arr = ArrayUtils.readIntArrayFromConsole();
        int minElement = LastSmallestElement.positionOfTheLastSmallestElement(arr);
        printPosition(minElement);

    }

    private static void printPosition(int minElement) {
        System.out.print("Smallest Element Position is " + minElement);
    }

}