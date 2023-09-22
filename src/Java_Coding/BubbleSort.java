package Java_Coding;//In Bubble sort every time we get sorted element at last index

public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray= {100,-10,-15,10,10,50,0,-25};
        System.out.println("Before Sorting...");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        //Array ka last index find kro
        //har bar loop complete hone pr greatest index mil jayega.
        for (int lastUnsortedArray=intArray.length-1;lastUnsortedArray>0;lastUnsortedArray--) {

            //1st index ko 2nd index se compare kro.
            for (int i = 0; i < lastUnsortedArray; i++) {
                if(intArray[i]>intArray[i+1]) {
                    swap(intArray,i,i+1);
                }
            }
        }
        System.out.println("After  Sorting...");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    static void swap(int[] intArray, int i, int j) {

        if (intArray[i]==intArray[j]) {
            return;
        }

        int temp=intArray[i];
        intArray[i]=intArray[j];
        intArray[j]=temp;
    }
}
