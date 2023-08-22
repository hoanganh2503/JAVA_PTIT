import java.util.*;

public class Day_con_co_tong_le {
    static int ok = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Set<String> vt = new TreeSet<String>();
        while (t-- > 0) {
            ok = 1;
            vt.clear();
            int n = scanner.nextInt();
            int[] arr = new int[n + 1];
            int[] b = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = scanner.nextInt();
                b[i] = 0;
            }
            while (ok == 1) {
                int sum = 0;
                sinh(b, n);
                for (int i = 1; i <= n; i++) {
                    if (b[i] == 1) sum += arr[i];
                }
                if (sum % 2 == 1) {
                    List<Integer> vec = new ArrayList<>();
                    for (int i = 1; i <= n; i++) {
                        if (b[i] == 1) vec.add(arr[i]);
                    }
                    Collections.sort(vec, Collections.reverseOrder());
                    String s = "";
                    for(Integer it:vec){
                        s+=it.toString() + " ";
                    }
                    vt.add(s);
                }
            } 

            for (String vec : vt) {
                System.out.println(vec);
            }

        }
    }

    private static void sinh(int[] b, int n) {
        int i = n;
        while (i > 0 && b[i] == 1) {
            b[i] = 0;
            i--;
        }
        if (i == 0) ok = 0;
        else b[i] = 1;
    }
}