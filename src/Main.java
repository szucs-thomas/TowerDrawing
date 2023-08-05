public class Main {
    public static void drawing(int size, int offset) {

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < offset; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < size; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        drawing(2,6);
        drawing(4,4);
        drawing(6,2);
    }
}