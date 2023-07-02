public class array_Swap {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];

        arr[0] = 23;
        arr[1] = 43;
        arr[2] = 65;
        arr[3] = 67;
        arr[4] = 34;

        swap(arr, 0, 3);

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " is = " + arr[i]);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
