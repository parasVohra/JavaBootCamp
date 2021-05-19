package Assignment2;

public class array {
    public static void main(String[] args) {
        int array1[] = new int[] { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };

        int array2[] = array1;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("************");

        array1[3] = 0;

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // so after running the code array2 has affect of changing the index 3 of array1

        // I think array2 is not storing the actual value of array1 but reference to array1 storage.
    
    }
}
