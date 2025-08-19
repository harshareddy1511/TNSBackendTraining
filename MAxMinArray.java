// Java Program to find the maximum and minimum in an array
public class MAxMinArray {
    public static void main(String[] args) {
        // creating an Array 
        int[] arr = {25, 11, 7, 75, 56};
    // initializing max and min with the first element of the araay
        int max = arr[0], min = arr[0];
        // comparing each elememt of the array wit the max and min and updating for wwhichever is greater and smaller
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        // printing the maximum and minimum values
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

}