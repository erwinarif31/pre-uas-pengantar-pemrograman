public class NomorLima {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        
        try {
            System.out.println(array[4]);
        } catch (IndexOutOfBoundsException e) {
            /** Dapat diberi pesan error */
        } finally {
            System.out.println("Program harus menampilkan ini");
        }

    }
}
