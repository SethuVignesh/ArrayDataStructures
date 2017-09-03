public class ArrayRotation {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int b[] = rotate(a, 2, a.length);
        for (int c : b) {
            System.out.println(c);
        }
    }

    private static int[] rotate(int[] a, int d, int n) {
        int b[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            if (n - d + i < n) {
                b[n - d + i] = a[i];
            } else
                b[i-d] = a[i];
        }

        return b;
    }
}
