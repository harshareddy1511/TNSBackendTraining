// Java Program to find Duplicates in an array
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 8, 2, 4, 10, 7};
        for (int i = 0; i< arr.length; i++) {
            for (int j = i+1; j< arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The Duplicates are " +arr[i]);
                    break;
                }
            }
        }

    }
    
}
