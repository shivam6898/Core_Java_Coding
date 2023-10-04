package Java_Coding.array;


//to find second smallest element just change > to < and MIN_VALUE to MAX_VALUE
public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 10, 6, 40 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                //if new element is greater than the largest , then new is the largest
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest +" || Second Largest element: " + secondLargest);
    }
}
