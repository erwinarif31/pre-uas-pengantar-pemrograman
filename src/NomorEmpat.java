public class NomorEmpat {
    public static void main(String[] args) {
        int[] arr = {1,8,4,5,3,7,2,6,0,9};
        int nomorInduk = 9;

        /** Sorting Array */
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        /** Print Array */
        System.out.print("Angka setelah disort :[" );
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d%c ", i, (i == arr.length - 1) ? ']' : ',');
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == nomorInduk) {
                System.out.printf("\nangka %d ada di index %d", nomorInduk, i);
                break;
            }
        }
    }
}
