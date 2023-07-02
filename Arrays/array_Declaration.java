public class array_Declaration {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];

        arr[0] = 23;
        arr[1] = 43;
        arr[2] = 65;
        arr[3] = 67;
        arr[4] = 34;
        //arr[5] = 45; // index 5 is out of bounds for array of size 5

        System.out.println("Length of array is = " + arr.length);

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " is = " + arr[i]);
        }
    }
}