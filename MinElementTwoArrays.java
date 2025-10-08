public class MinElementTwoArrays {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 25, 30, 35};
        int[] arr2 = {20, 31, 38, 39, 40, 50};
        int min1 = findMin(arr1);
        int min2 = findMin(arr2);
        int overallMin = (min1 < min2) ? min1 : min2;
        System.out.println("Minimum in arr1: " + min1);
        System.out.println("Minimum in arr2: " + min2);
        System.out.println("Overall minimum element: " + overallMin);
    }
}