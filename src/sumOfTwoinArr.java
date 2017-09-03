public class sumOfTwoinArr {
    public static void main(String[] args) {
        int sum = 16;
        int a[] = {1, 4, 45, 6, 10, 8};

        if(checkPresence(a,sum)){
            System.out.println("YES");
        }else {
            System.out.print("NO");
        }


    }

    private static boolean checkPresence(int[] a, int sum) {
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = j; i < a.length; i++) {
                if (a[i] + a[j] == sum) {
                   return true;
                }
            }
        }
        return false;
    }
}

